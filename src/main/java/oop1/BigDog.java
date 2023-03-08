package org.oop;

public class BigDog extends Dog{
    public void voiceBigDog(){
        System.out.println("Big Dog Voice");
    }

    @Override
    public void voice(){
        System.out.println("Other dog voice");
    }
}
