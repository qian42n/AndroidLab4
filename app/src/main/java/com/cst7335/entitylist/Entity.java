package com.cst7335.entitylist;

public class Entity {
    private int id;
    private String name;
    private String type;

    // Constructor to initialize Entity with id, name, and type
    public Entity(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
