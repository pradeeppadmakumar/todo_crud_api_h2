package com.pradeeppadmakumar.crud.todo_crud_api_h2.repository;

import com.pradeeppadmakumar.crud.todo_crud_api_h2.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
