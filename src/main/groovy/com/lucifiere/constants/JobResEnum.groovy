package com.lucifiere.constants

/**
 * Created by @author XD.Wang
 * 2018-03-31
 * Func:
 */
enum JobResEnum {

    SUCCESS(1, "job buildJobResult success!"),

    BIZ_ERROR(2, "job buildJobResult failed! cause by job error"),

    INTERNAL_ERROR(3, "job buildJobResult failed! cause by programing error")

    JobResEnum(int code, String desc) {
        this.code = code
        this.desc = desc
    }

    int code

    String desc

}
