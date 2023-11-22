package com.taskmanagement.taskmanagerapi.adapters.http.tasks;

import com.taskmanagement.taskmanagerapi.application.task.TaskServiceImpl;
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
    private final TaskServiceImpl taskService;
    @Autowired
    public TaskController(TaskServiceImpl taskService) {

        this.taskService = taskService;
    }
    @PostMapping
    public ResponseEntity createTask(@RequestBody Task task , UriComponentsBuilder UriBuilder){
        var taskResponse = taskService.save(task);
        var uri = UriBuilder.path("/api/v1/tasks/{id}").buildAndExpand(taskResponse).toUri();
        return ResponseEntity.created(uri).body("");
    }
}
