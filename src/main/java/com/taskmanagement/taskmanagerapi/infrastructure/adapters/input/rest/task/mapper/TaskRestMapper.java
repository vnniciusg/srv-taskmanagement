package com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task.mapper;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task.data.request.TaskCreateRequest;
import org.mapstruct.Mapper;

@Mapper
public interface TaskRestMapper {
    Task toTask(TaskCreateRequest taskCreateRequest);
    TaskCreateRequest toTaskCreateResponse(Task task);
}
