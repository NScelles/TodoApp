package org.example.model;

import org.example.service.TodoService;
import org.example.service.TodoServiceImpl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Todo implements TodoServiceImpl {

    private int id;
    private String name;
    private String description;
    private boolean done;

    private static int compt = 0;
    private static Map<Integer,Todo> allTodo = new HashMap();

    public Todo() { }

    public Todo(String name, String description) {
        this(compt++,name,description,false);
    }

    public Todo(int id, String name, String description, boolean done) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.done = done;
    }

    @Override
    public List<Todo> getAll() {
        return List.of();
    }

    @Override
    public Todo getById(int id) {
        return null;
    }

    @Override
    public void add(String name, String description) {

    }

    @Override
    public void update(int id, String name, String description, boolean done) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void toggleDone(int id) {

    }
}
