package com.methodOverridingtask;

public class Cat extends Animal {

    public void sound() {
        System.out.println("Cat sound -> meow meow");
    }

    public void getName() {
        System.out.println("Cat name -> Cat");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal duck=new Duck();
        Animal cat=new Cat();

        dog.sound();
        dog.getName();
        duck.sound();
        duck.getName();
        cat.sound();
        cat.getName();

    }
}

