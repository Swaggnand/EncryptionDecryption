package com.github.swaggnand.encryptiondecryption.services

import com.github.swaggnand.encryptiondecryption.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
