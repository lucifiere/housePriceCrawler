package com.lucifiere.crawler.download

import com.lucifiere.constants.HttpError
import groovyx.net.http.HTTPBuilder
import org.apache.http.conn.EofSensorInputStream
import com.lucifiere.utils.HttpUtil

import static groovyx.net.http.ContentType.BINARY
import static groovyx.net.http.Method.GET

/**
 * Created by @author XD.Wang
 * 2018-06-11
 * Func:
 */
abstract class Downloader {

    protected HTTPBuilder site

    private String path = ""

    protected byte[] data

    protected HttpError error

    Downloader(String url) {
        url = HttpUtil.completeHttpSchema(url)
        site = new HTTPBuilder(url)
    }

    Downloader path(String path) {
        this.path = path
        this
    }

    protected void download() {
        site.request(GET, BINARY) { req ->
            uri.path = path
            response.success = { resp, data ->
                assert resp.statusLine.statusCode == 200
                EofSensorInputStream stream = ((data as EofSensorInputStream))
                this.data = stream.bytes
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

    protected boolean isDataReady() {
        return this.error == null && this.data != null && this.data.size() > 0
    }

    protected Byte[] read() { data }

    abstract boolean build()

}
