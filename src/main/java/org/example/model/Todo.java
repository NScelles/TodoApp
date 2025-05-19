package org.example.model;

import org.example.service.TodoService;
import org.example.service.TodoServiceImpl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Todo implements TodoServiceImpl {


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
