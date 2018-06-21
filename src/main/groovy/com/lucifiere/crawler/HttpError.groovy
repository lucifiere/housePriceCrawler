package com.lucifiere.crawler

enum HttpError {

    NOT_FOUND(404, "resource not found"),

    SERVER_ERROR(500, "server error occurred"),

    GRANT_FAILED(404, "no permission to assert resource"),

    UNKNOWN(0, "unknown error")

    HttpError(int code, String desc) {
        this.code = code
        this.desc = desc
    }

    int code

    String desc

}
