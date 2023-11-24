package com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.mapper;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.entity.TaskEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskPersistenceMapperImpl implements TaskPersistenceMapper{

    private final ModelMapper modelMapper;

    @Override
    public TaskEntity toTaskEntity(Task task) {
        return modelMapper.map(task,TaskEntity.class);
    }

    @Override
    public Task toTask(TaskEntity taskEntity) {
        return modelMapper.map(taskEntity, Task.class);
    }
}
