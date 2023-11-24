package com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.mapper;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.entity.TaskEntity;

public interface TaskPersistenceMapper {
    TaskEntity toTaskEntity(Task task);
    Task toTask(TaskEntity taskEntity);
}
