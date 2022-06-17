package com.kodilla.spring.porfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private String name;
    private List<String> tasks;

    public TaskList(String name) {
        this.name = name;
        tasks = new ArrayList<>();
    }
    public void addTask(String task) {
        tasks.add(task);
    }
    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
