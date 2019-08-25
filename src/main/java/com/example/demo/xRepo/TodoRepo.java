package com.example.demo.xRepo;

import com.example.demo.ZModel.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoModel,Long> {
}
