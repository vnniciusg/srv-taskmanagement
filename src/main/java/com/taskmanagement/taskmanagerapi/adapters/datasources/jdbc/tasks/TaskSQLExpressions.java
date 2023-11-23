package com.taskmanagement.taskmanagerapi.adapters.datasources.jdbc.tasks;

import org.springframework.stereotype.Component;

@Component
public class TaskSQLExpressions {
    public static String SQLCreateTask() {
        return "INSERT INTO task " +
                "(title, description, start_date, end_date, status) " +
                "VALUES (?, ?, ?, ?, ?)";
    }
}
