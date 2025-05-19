package org.example.model;

import org.example.service.TodoService;
import org.example.service.TodoServiceImpl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Todo extends TodoServiceImpl {

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
}
