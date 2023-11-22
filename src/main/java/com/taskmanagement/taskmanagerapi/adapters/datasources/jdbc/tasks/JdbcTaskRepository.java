package com.taskmanagement.taskmanagerapi.adapters.datasources.jdbc.tasks;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.domain.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class JdbcTaskRepository implements TaskRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTaskRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public Task save(Task task) {
        String sql = "INSERT INTO task (title, description, start_date, end_date, status) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, task.getTitle(),task.getDescription(), task.getStartDate() , task.getEndDate() , task.getStatus().name());



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
