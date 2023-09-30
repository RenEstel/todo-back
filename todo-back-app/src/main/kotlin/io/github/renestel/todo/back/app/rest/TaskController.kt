package io.github.renestel.todo.back.app.rest

import io.github.renestel.todo.back.app.domain.model.dto.TaskDto
import io.github.renestel.todo.back.app.domain.model.dto.toDto
import io.github.renestel.todo.back.app.persistence.repository.TaskRepository
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Задачи")
@RequestMapping("api/ui/v1/task")
@RestController
class TaskController(
    private val taskRepository: TaskRepository
) {

    @Operation(summary = "Получить все задачи")
    @GetMapping
    fun getAll(): List<TaskDto> {
        return taskRepository.findAll()
            .map { it.toDto() }
    }
}
