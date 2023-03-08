package org.oop;

public class DogDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();

        BigDog bigDog = new BigDog();
        bigDog.voice();
        bigDog.voiceBigDog();
        bigDog.eat();

        Cat cat = new Cat();
        cat.voice();
    }
}
