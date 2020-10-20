package com.github.licc.myredis.services

import com.intellij.openapi.project.Project
import com.github.licc.myredis.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
