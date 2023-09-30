package io.github.renestel.todo.back.app.persistence.repository

import io.github.renestel.todo.back.app.persistence.entity.TaskEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<TaskEntity, Long>