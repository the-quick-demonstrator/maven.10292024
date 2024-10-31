package com.github.curriculeon.animal;

public interface AnimalInterface {
    String getNoise();
    default void speak() {
        System.out.print(getNoise());
        System.out.println("!!!!!!");
    }
}
