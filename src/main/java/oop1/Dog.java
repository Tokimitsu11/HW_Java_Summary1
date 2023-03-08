package org.oop;

public class Dog extends Animal{

    public void voice (){
        System.out.println("Dog voice");
    }

    @Override
    public void eat() {
        System.out.println("Eat!!!");

    }
}
