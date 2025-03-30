package com.example.fztb

class TaskNotFoundException(id: Long) : Exception("Task with id = $id not found")