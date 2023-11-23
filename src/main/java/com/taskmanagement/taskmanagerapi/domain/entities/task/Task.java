package com.taskmanagement.taskmanagerapi.domain.entities.task;

import com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task.data.request.TaskCreateRequest;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private Long id ;
    private String title;
    private String description;
    private String startDate;
    private String endDate;
    private TaskStatus status;

}
