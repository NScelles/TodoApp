package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoServiceImpl implements TodoService{

    protected int id;
    protected String name;
    protected String description;
    protected boolean done;

    protected static int compt = 0;
    protected static Map<Integer,Todo> allTodo = new HashMap();

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
        TodoServiceImpl todo = allTodo.get(id);
        allTodo.replace(id, new Todo(id, todo.name, todo.description, !todo.done));
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
