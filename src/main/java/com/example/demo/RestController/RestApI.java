package com.example.demo.RestController;

import com.example.demo.ZModel.TodoModel;
import com.example.demo.xRepo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RestApI {
    @Autowired
    private TodoRepo todoRepo;

    @GetMapping(value = {"/users/{username}/todos"})
    public List<TodoModel> getAllTodos(@PathVariable("username") String username ){
       return todoRepo.findAll();
    }


    @GetMapping(value = {"/users/{username}/todos/{id}"})
    public TodoModel getOneTodo(@PathVariable("username") String username , @PathVariable("id") Long id ){
        return todoRepo.findById(id).get();
    }



    @DeleteMapping(value = {"/users/{username}/todos/{id}"})
    public  void  deleteTode(@PathVariable("username") String username , @PathVariable("id") Long id ){
            todoRepo.deleteById(id);
    }


}
