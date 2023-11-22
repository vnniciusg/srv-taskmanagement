package com.taskmanagement.taskmanagerapi.domain.usecases.task;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.domain.repositories.TaskRepository;

public class CreateTask {

    final TaskRepository taskRepository;

    CreateTask(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    void call(Task task){
        taskRepository.save(task);
    }
}
