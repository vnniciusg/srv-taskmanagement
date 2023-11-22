package com.taskmanagement.taskmanagerapi.application.task;

import com.taskmanagement.taskmanagerapi.domain.dto.task.CreateTaskRequest;
import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.domain.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    @Override
    public void save (CreateTaskRequest task){
        taskRepository.save(task);
    }

    @Override
    public List<Task> findAll() {
        return null;
    }
    @Override
    public Boolean update(Task Task) {
        return null;
    }
    @Override
    public Boolean delete(UUID TaskID) {
        return null;
    }

}
