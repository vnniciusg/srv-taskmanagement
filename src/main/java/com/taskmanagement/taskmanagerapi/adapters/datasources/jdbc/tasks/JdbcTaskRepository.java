package com.taskmanagement.taskmanagerapi.adapters.datasources.jdbc.tasks;

import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.domain.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.UUID;

import static com.taskmanagement.taskmanagerapi.adapters.datasources.jdbc.tasks.TaskSQLExpressions.SQLCreateTask;

@Repository
public class JdbcTaskRepository implements TaskRepository {
    private final JdbcTemplate db;

    KeyHolder keyHolder = new GeneratedKeyHolder();
    @Autowired
    public JdbcTaskRepository(JdbcTemplate db) {
        this.db = db;
    }
    @Override
    public Long save(Task task) {
        int row = db.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(SQLCreateTask(), Statement.RETURN_GENERATED_KEYS);
            setTaskParameters(ps , task);
            return ps;
        }, keyHolder);

        if(row > 0 ){
            Number id = keyHolder.getKey();
            return (id != null) ? id.longValue() : null;
        }else{
            return null;
        }
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


    private void setTaskParameters(PreparedStatement ps, Task task) throws SQLException {
        ps.setString(1, task.getTitle());
        ps.setString(2, task.getDescription());
        ps.setString(3, task.getStartDate());
        ps.setString(4, task.getEndDate());
        ps.setString(5, task.getStatus().name());
    }


}
