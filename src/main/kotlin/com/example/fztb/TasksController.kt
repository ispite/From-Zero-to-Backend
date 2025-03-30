package com.example.fztb

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class TasksController {
    //API logic here

    @Autowired
    lateinit var taskRepository: TaskRepository

    @GetMapping("/task/{id}")
    fun getTask(@PathVariable id: Long): Task? {
        //Fetch task with the provided id and return it
        return taskRepository.findById(id).orElseThrow { TaskNotFoundException(id) }
    }

    @PostMapping("/task")
    fun createTask(@RequestBody task: Task): Task {
        return taskRepository.save(task)
    }

    @DeleteMapping("/task/{id}")
    fun deleteTask(@PathVariable id: Long) {
        taskRepository.deleteById(id)
    }
}