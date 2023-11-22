package com.taskmanagement.taskmanagerapi.domain.usecases.task;

import com.taskmanagement.taskmanagerapi.domain.repositories.TaskRepository;

import java.util.UUID;

public class DeleteTask {

    final TaskRepository taskRepository;

    DeleteTask(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    boolean call(UUID TaskID){
        return taskRepository.delete(TaskID);
    }
}
