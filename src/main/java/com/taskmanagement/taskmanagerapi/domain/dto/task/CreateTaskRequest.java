package com.taskmanagement.taskmanagerapi.domain.dto.task;

import com.taskmanagement.taskmanagerapi.domain.entities.task.TaskStatus;

public record CreateTaskRequest(
        String title,
        String description,
        String startDate,
        String endDate,
        TaskStatus status
){
}
