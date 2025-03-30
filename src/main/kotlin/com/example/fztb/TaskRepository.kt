package com.example.fztb

import org.springframework.data.repository.CrudRepository

interface TaskRepository : CrudRepository<Task, Long>