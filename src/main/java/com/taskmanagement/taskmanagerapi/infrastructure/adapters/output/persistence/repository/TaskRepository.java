package com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.repository;

import com.taskmanagement.taskmanagerapi.infrastructure.adapters.output.persistence.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity , Long> {
}
