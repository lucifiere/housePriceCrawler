package com.lucifiere.utils

final class HttpUtil {

    final static String HTTP_SCHEMA = "com.lucifiere.crawler://"

    final static String HTTPS_SCHEMA = "https://"

    static String completeHttpSchema(String url) {
        url.startsWith(HTTP_SCHEMA) || url.startsWith(HTTPS_SCHEMA) ? url : HTTP_SCHEMA + url
    }

}
