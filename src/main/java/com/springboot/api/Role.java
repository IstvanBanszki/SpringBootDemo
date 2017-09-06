package com.springboot.api;

import java.util.Arrays;

public enum Role {
    
    NOT_SET(1, "NOT-SET"),
    USER(2, "USER"),
    ADMIN(3, "ADMIN");
    
    private final int id;
    private final String name;
    
    Role(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public static Role getValue(String name) {
        return Arrays.stream(Role.values()).filter(role -> role.getName().equals(name)).findFirst().orElse(NOT_SET);
    }
    
    public static Role valueOf(int id) {
        return Arrays.stream(Role.values()).filter(role -> role.getId() == id).findFirst().orElse(NOT_SET);
    }
    
}
