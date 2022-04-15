pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/bnmosria/park-rides.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}