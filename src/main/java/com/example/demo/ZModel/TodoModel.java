package com.example.demo.ZModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class TodoModel {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String description;
    private Date targetData;
    private Boolean isDone;
}
