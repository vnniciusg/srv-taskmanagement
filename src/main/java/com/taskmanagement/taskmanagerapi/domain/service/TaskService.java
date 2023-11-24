package com.taskmanagement.taskmanagerapi.domain.service;

import com.taskmanagement.taskmanagerapi.application.ports.input.task.CreateTaskUseCase;
import com.taskmanagement.taskmanagerapi.application.ports.output.task.TaskOutputPort;
import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TaskService implements CreateTaskUseCase {

    private final TaskOutputPort taskOutputPort;
    @Override
    public Task createTask(Task task) {
        return taskOutputPort.saveTask(task);
    }
}
