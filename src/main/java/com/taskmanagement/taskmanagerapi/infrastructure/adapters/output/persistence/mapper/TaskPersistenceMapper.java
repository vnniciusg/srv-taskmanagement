package com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.mapper;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.entity.TaskEntity;
import org.mapstruct.Mapper;

@Mapper
public interface TaskPersistenceMapper {
    TaskEntity toTaskEntity(Task task);
    Task toTask(TaskEntity taskEntity);
}
