package com.amigoscode._2_developers._12_classes;

public enum Season {
    SPRING("Flowers bloom"),
    SUMMER("Sun shines"),
    AUTUMN("Leaves fall"),
    WINTER("Snow falls");


    private final String description;
    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
