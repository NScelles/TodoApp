package org.example.model;

public class PriorityTodo extends Todo{
    private Priority priority;

    public PriorityTodo(String name, String description, Priority priority) {
        super(name, description);
        this.priority = priority;
    }
/*
    @Override
    public void add(String name, String description) {
        allTodo.put(compt,new PriorityTodo(name,description,Priority.HAUTE));
    }
 */


    @Override
    public String toString() {
        return "["+id+"] "+"[Prioritaire - "+ priority +"] "+ name + " - " + description +
                ((done) ? " (fait)" : (" (à faire)"));
    }
}
