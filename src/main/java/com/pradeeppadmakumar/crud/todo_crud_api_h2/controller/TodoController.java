package com.pradeeppadmakumar.crud.todo_crud_api_h2.controller;

import com.pradeeppadmakumar.crud.todo_crud_api_h2.model.Todo;
import com.pradeeppadmakumar.crud.todo_crud_api_h2.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/todo")
    public ResponseEntity<List<Todo>> getAllTodos(){
        List<Todo> todos = todoService.findAll();
        return new ResponseEntity<List<Todo>>(todos, HttpStatus.OK);
    }

    @GetMapping("/todo/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable("id") Long id){
        Todo todo = todoService.findById(id);
        return new ResponseEntity<Todo>(todo, HttpStatus.OK);
    }
}
