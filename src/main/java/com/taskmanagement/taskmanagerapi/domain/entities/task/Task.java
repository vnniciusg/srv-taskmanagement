package com.taskmanagement.taskmanagerapi.domain.entities.task;
public class Task {
    private Long id ;
    private String title;
    private String description;
    private String startDate;
    private String endDate;
    private TaskStatus status;

    public Task(Long id, String title, String description, String startDate, String endDate, TaskStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public TaskStatus getStatus() {
        return status;
    }
}
