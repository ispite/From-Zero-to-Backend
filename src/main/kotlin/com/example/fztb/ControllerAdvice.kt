package com.example.fztb

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
class ControllerAdvice {
    @ExceptionHandler
    fun handleTaskNotFoundException(ex: TaskNotFoundException): ResponseEntity<ErrorMessage> {
        val errorMessage = ErrorMessage(
            ex.message, HttpStatus.NOT_FOUND.toString(),
        )
        return ResponseEntity(errorMessage, HttpStatus.NOT_FOUND)
    }
}
