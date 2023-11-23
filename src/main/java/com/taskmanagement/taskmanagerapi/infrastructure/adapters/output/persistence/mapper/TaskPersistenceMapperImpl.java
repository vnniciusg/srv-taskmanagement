package com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.mapper;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskPersistenceMapperImpl implements TaskPersistenceMapper{
    @Override
    public TaskEntity toTaskEntity(Task task) {
        if ( task == null){
            return null;
        }

        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitle(task.getTitle());
        taskEntity.setDecription(task.getDescription());
        taskEntity.setStartDate(task.getStartDate());
        taskEntity.setEndDate(task.getEndDate());
        taskEntity.setStatus(task.getStatus());

        return taskEntity;
    }

    @Override
    public Task toTask(TaskEntity taskEntity) {
        return null;
    }
}
