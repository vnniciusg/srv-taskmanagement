package com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task.mapper;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task.data.request.TaskCreateRequest;
import org.springframework.stereotype.Component;

@Component
public class TaskRestMapperImpl implements TaskRestMapper{
    @Override
    public Task toTask(TaskCreateRequest taskCreateRequest) {
        if( taskCreateRequest == null){
            return null;
        }

        Task task = new Task();

        task.setTitle(taskCreateRequest.getTitle());
        task.setDescription(taskCreateRequest.getDecription());
        task.setStartDate(taskCreateRequest.getStartDate());
        task.setEndDate(taskCreateRequest.getEndDate());
        task.setStatus(taskCreateRequest.getStatus());

        return task;
    }
}
