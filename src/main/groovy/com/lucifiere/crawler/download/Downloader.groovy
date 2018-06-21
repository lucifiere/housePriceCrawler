package com.lucifiere.crawler.download

import com.lucifiere.crawler.HttpError
import groovyx.net.http.HTTPBuilder
import org.apache.http.conn.EofSensorInputStream
import com.lucifiere.utils.HttpUtil

import static groovyx.net.http.ContentType.BINARY
import static groovyx.net.http.Method.GET

abstract class Downloader {

    HTTPBuilder site

    List<String> path = []

    byte[] raw

    HttpError error

    Downloader(String url) {
        url = HttpUtil.completeHttpSchema(url)
        site = new HTTPBuilder(url)
    }

    Downloader path(String path) {
        this.path << path
        this
    }

    Downloader paths(List<String> path) {
        this.path.addAll(path)
        this
    }

    Downloader paths(String... path) {
        this.path.addAll(path)
        this
    }

    void download() {
        site.request(GET, BINARY) { req ->
            uri.path = path[0]
            response.success = { resp, data ->
                assert resp.statusLine.statusCode == 200
                EofSensorInputStream stream = ((data as EofSensorInputStream))
                raw = stream.bytes
            }

            site.handler.'404' = { resp ->
                error = HttpError.NOT_FOUND
            }

            site.handler.'500' = { resp ->
                error = HttpError.SERVER_ERROR
            }

            site.handler.'401' = { resp ->
                error = HttpError.GRANT_FAILED
            }

            site.handler.failure = { resp ->
                error = HttpError.UNKNOWN
            }
        }
    }

    byte[] read() { raw }

}
