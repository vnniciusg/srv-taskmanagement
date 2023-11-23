package com.taskmanagement.taskmanagerapi.application.ports.input.task;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
