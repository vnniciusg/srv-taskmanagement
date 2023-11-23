package com.taskmanagement.taskmanagerapi.infrastructure.adapters.config;

import com.taskmanagement.taskmanagerapi.domain.service.TaskService;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.TaskPersistenceAdapter;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.mapper.TaskPersistenceMapper;
import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.repository.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public TaskPersistenceAdapter taskPersistenceAdapter(TaskRepository taskRepository , TaskPersistenceMapper taskPersistenceMapper){
        return new TaskPersistenceAdapter(taskRepository , taskPersistenceMapper);
    }

    @Bean
    public TaskService taskService(TaskPersistenceAdapter taskPersistenceAdapter ){
        return new TaskService(taskPersistenceAdapter);
    }
}
