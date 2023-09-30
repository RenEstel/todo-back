package io.github.renestel.todo.back.app.persistence.entity

import io.github.renestel.todo.back.app.domain.model.dto.TaskDto
import jakarta.persistence.*

@Entity
@Table(name = "task")
class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskSeqGenerator")
    @SequenceGenerator(name = "taskSeqGenerator", sequenceName = "task_id_seq", allocationSize = 1)
    var id: Long? = null
    var name: String? = null
}


