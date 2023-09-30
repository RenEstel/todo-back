package io.github.renestel.todo.back.app

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class TodoBackApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder(TodoBackApplication::class.java)
        .bannerMode(Banner.Mode.OFF)
        .logStartupInfo(false)
        .registerShutdownHook(true)
        .run(*args)
}