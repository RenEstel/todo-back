package io.github.renestel.todo.back.app.domain.model.dto

import io.github.renestel.todo.back.app.persistence.entity.TaskEntity

data class TaskDto(
    var id: Long? = null,
    var name: String? = null
)

fun TaskEntity.toDto() = TaskDto(id = id, name = name)