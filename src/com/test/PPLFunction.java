package com.test;

public class PPLFunction {

    private final boolean isBoolean;
    private final String name;
    private String description;

    public PPLFunction(String name, boolean isBoolean) {
        this.name = name;
        this.description = "";
        this.isBoolean = isBoolean;
    }

    public PPLFunction(String name, String description, boolean isBoolean) {
        this.name = name;
        this.description = description;
        this.isBoolean = isBoolean;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBoolean() {
        return isBoolean;
    }
}
