package com.taskmanagement.taskmanagerapi.adapters.http.tasks;

import com.taskmanagement.taskmanagerapi.application.task.TaskService;
import com.taskmanagement.taskmanagerapi.domain.dto.task.CreateTaskRequest;
import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController{
    private final TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping
    public ResponseEntity createTask(@RequestBody CreateTaskRequest taskRequest , UriComponentsBuilder UriBuilder){
        taskService.save(taskRequest);
        var uri = UriBuilder.path("/api/v1/tasks/{id}").buildAndExpand().toUri();
        return ResponseEntity.created(uri).body("");
    }
}
