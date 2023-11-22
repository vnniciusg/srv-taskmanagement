package com.taskmanagement.taskmanagerapi.application.task;

import com.taskmanagement.taskmanagerapi.domain.dto.task.CreateTaskRequest;
import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    void save (CreateTaskRequest task);

    List<Task> findAll();
    Boolean update(Task Task);
    Boolean delete(UUID TaskID);

}
