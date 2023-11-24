package com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task.mapper;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task.data.request.TaskCreateRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskRestMapperImpl implements TaskRestMapper{

    private final ModelMapper modelMapper;
    @Override
    public Task toTask(TaskCreateRequest taskCreateRequest) {
      return modelMapper.map(taskCreateRequest, Task.class);
    }
}
