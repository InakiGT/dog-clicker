package com.example.servingwebcontent;

public class Dog {
    public int id;
    public String name;
    public String img;
    public int count;

    public Dog(int id, String name, String img) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.count = 0;
    }

    public void IncCount() {
        this.count += 1;
    }
}