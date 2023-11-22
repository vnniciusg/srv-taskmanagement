package com.taskmanagement.taskmanagerapi.adapters.datasources.jdbc.tasks;


import com.taskmanagement.taskmanagerapi.domain.dto.task.CreateTaskRequest;
import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.domain.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class JdbcTaskRepository implements TaskRepository {
    private final NamedParameterJdbcOperations db;
    private final TaskSQLExpressions sqlExpressions;
    @Autowired
    public JdbcTaskRepository(NamedParameterJdbcOperations db, TaskSQLExpressions sqlExpressions) {
        this.db = db;
        this.sqlExpressions = sqlExpressions;
    }
    @Override
    public void save(CreateTaskRequest task) {


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
