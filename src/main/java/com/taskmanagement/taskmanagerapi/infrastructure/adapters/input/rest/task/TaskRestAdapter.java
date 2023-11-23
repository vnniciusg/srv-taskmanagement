package com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task;

import com.taskmanagement.taskmanagerapi.application.ports.input.task.CreateTaskUseCase;
import com.taskmanagement.taskmanagerapi.domain.entities.task.Task;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task.data.request.TaskCreateRequest;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.input.rest.task.mapper.TaskRestMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
public class TaskRestAdapter {

    private final CreateTaskUseCase createTaskUseCase;
    private final TaskRestMapper taskRestMapper;
 
    @PostMapping
    public ResponseEntity createTask(@RequestBody TaskCreateRequest taskCreateRequest, UriComponentsBuilder UriBuilder){
        Task task = taskRestMapper.toTask(taskCreateRequest);
        task = createTaskUseCase.createTask(task);
        var uri = UriBuilder.path("/api/v1/tasks/{id}").buildAndExpand(task.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
