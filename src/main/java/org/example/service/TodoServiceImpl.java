package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoServiceImpl extends Todo implements TodoService {




    @Override
    public List<Todo> getAll() {
        return allTodo.values().stream().toList();
    }

    public List<Todo> getAllNotDone() {
        List<Todo> allTodoNotdone = new ArrayList<>();
        for (Todo todo:allTodo.values())
            if(!todo.isDone())
                allTodoNotdone.add(todo);
        return allTodoNotdone;
    }

    @Override
    public Todo getById(int id) {
        return allTodo.get(id);
    }

    @Override
    public void add(String name, String description) {
        allTodo.put(compt,new Todo(name,description));
    }

    @Override
    public void update(int id, String name, String description, boolean done) {
        allTodo.replace(id,new Todo(id,name,description,done));
    }

    @Override
    public void remove(int id) {
        allTodo.remove(id);
    }

    @Override
    public void toggleDone(int id) {
        Todo todo = allTodo.get(id);
        allTodo.replace(id, new Todo(id, todo.getName(), todo.getDescription(), !todo.isDone()));
    }



}
