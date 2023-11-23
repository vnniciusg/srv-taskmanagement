package com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task.data.request;

import com.taskmanagement.taskmanagerapi.domain.entities.task.TaskStatus;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskCreateRequest {
    private String title;
    private String decription;
    private String startDate;
    private String endDate;
    private TaskStatus status;
}
