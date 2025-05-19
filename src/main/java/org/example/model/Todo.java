package org.example.model;

import org.example.service.TodoService;
import org.example.service.TodoServiceImpl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Todo {

    protected int id;
    protected String name;
    protected String description;
    protected boolean done;

    protected static int compt = 0;
    protected static Map<Integer,Todo> allTodo = new HashMap();

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

    public boolean isExist(int id){
        return allTodo.containsKey(id);
    }

    @Override
    public String toString() {
        return "["+id+"] " + name + " - " + description +
                ((done) ? " (fait)" : (" (à faire)"));
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
