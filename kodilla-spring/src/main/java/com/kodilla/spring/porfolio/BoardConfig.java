package com.kodilla.spring.porfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList todoList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(todoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getTaskOne() {
        return new TaskList("task to do");
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getTaskTwo() {
        return new TaskList("task in progress");
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getTaskThree() {
        return new TaskList("task done");
    }


}
