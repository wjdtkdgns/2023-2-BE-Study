package org.example;

public class Dog extends Animal{
    private String name;

    public String getName() {
        return name;
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " says Woof!");
    }
}
