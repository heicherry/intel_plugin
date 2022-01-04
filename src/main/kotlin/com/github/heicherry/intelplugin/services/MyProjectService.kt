package com.github.heicherry.intelplugin.services

import com.intellij.openapi.project.Project
import com.github.heicherry.intelplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
