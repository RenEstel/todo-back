package io.github.renestel.todo.back

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoBackApplication

fun main(args: Array<String>) {
    runApplication<TodoBackApplication>(*args)
}
