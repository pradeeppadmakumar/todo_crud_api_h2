package com.pradeeppadmakumar.crud.todo_crud_api_h2.service;

import com.pradeeppadmakumar.crud.todo_crud_api_h2.model.Todo;
import com.pradeeppadmakumar.crud.todo_crud_api_h2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo findById(Long id) {
        return todoRepository.findById(id).get();
    }
}
