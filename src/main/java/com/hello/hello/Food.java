package com.hello.hello;

public class Food {
    private String name;

    private String materials;

    private String country;

    public Food(String name, String materials, String country) {
        this.name = name;
        this.materials = materials;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getMaterials() {
        return materials;
    }

    public String getCountry() {
        return country;
    }
}

