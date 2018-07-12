package com.lucifiere.bootstrap

import com.lucifiere.core.job.Job
import com.lucifiere.entity.bo.JobResult

class Bootstrap {

    private Job job

    private JobResult result

    Bootstrap(Job job) {
        this.job = job
    }

    JobResult start(boolean refresh = false) {
        return refresh || result == null ? job.doJob() : result
    }

}
