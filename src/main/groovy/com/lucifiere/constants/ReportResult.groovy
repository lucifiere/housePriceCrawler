package com.lucifiere.constants

/**
 * Created by @author XD.Wang
 * 2018-06-11
 * Func:
 */
enum ReportResult {

    SUCCESS(1, "report generate success!"),

    BIZ_ERROR(2, "report generate failed! cause by biz error"),

    INTERNAL_ERROR(3, "report generate failed! cause by programing error")

    ReportResult(int code, String desc) {
        this.code = code
        this.desc = desc
    }

    int code

    String desc

}
