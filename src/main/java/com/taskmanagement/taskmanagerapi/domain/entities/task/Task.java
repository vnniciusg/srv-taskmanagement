package com.taskmanagement.taskmanagerapi.domain.entities.task;


import com.taskmanagement.taskmanagerapi.domain.dto.task.CreateTaskRequest;

public class Task {
    private Long id ;
    private String title;
    private String description;
    private String startDate;
    private String endDate;
    private TaskStatus status;


    public Task(CreateTaskRequest taskRequest) {
        this.title = taskRequest.title();
        this.description = taskRequest.description();
        this.startDate = taskRequest.startDate();
        this.endDate = taskRequest.endDate();
        this.status = taskRequest.status();
    }
}
