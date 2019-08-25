package com.example.demo.BootInit;

import com.example.demo.ZModel.TodoModel;
import com.example.demo.xRepo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class initData implements CommandLineRunner {
    @Autowired
    private TodoRepo todoRepo;

    @Override
    public void run(String... args) throws Exception {
        TodoModel t1 = new TodoModel();
        t1.setUsername("abdo");
        t1.setDescription("learn java");
        t1.setTargetData(new Date());
        t1.setIsDone(false);


        TodoModel t2 = new TodoModel();
        t2.setUsername("abdo");
        t2.setDescription("learn c++");
        t2.setTargetData(new Date());
        t2.setIsDone(false);


        TodoModel t3 = new TodoModel();
        t3.setUsername("abdo");
        t3.setDescription("learn dance");
        t3.setTargetData(new Date());
        t3.setIsDone(false);

        TodoModel t4 = new TodoModel();
        t4.setUsername("abdo");
        t4.setDescription("learn python");
        t4.setTargetData(new Date());
        t4.setIsDone(false);

        todoRepo.save(t1);
        todoRepo.save(t2);
        todoRepo.save(t3);
        todoRepo.save(t4);

    }
}
