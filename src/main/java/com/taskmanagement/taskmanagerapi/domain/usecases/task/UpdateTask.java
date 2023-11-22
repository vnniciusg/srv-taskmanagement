package com.taskmanagement.taskmanagerapi.domain.usecases.task;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.domain.repositories.TaskRepository;

public class UpdateTask {

    final TaskRepository taskRepository;

     UpdateTask(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
     }

    boolean call(Task Task){
        return taskRepository.update(Task);
    }



}
