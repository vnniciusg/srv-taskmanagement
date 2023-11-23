package com.taskmanagement.taskmanagerapi.application.ports.output.task;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;

public interface TaskOutputPort {
    Task saveTask(Task task);
}
