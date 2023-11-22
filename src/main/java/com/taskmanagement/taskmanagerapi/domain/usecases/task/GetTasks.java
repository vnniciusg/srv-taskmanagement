package com.taskmanagement.taskmanagerapi.domain.usecases.task;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.domain.repositories.TaskRepository;

import java.util.List;

public class GetTasks {

    final TaskRepository taskRepository;


    GetTasks(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    List<Task> call (){
        return taskRepository.findAll();
    }

}
