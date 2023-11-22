package com.taskmanagement.taskmanagerapi.domain.repositories;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;

import java.util.List;
import java.util.UUID;

public interface TaskRepository {
    void save(Task Task);
    List<Task>findAll();
    Boolean update(Task Task);
    Boolean delete(UUID TaskID);
}
