package com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence;

import com.taskmanagement.taskmanagerapi.application.ports.output.task.TaskOutputPort;
import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.entity.TaskEntity;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.mapper.TaskPersistenceMapper;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.repository.TaskRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaskPersistenceAdapter implements TaskOutputPort {

    private final TaskRepository taskRepository;
    private final TaskPersistenceMapper taskPersistenceMapper;

    @Override
    public Task saveTask(Task task) {
        TaskEntity taskEntity = taskPersistenceMapper.toTaskEntity(task);
        taskEntity = taskRepository.save(taskEntity);
        return taskPersistenceMapper.toTask(taskEntity);
    }
}
