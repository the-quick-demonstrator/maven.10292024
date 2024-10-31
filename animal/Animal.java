package com.github.curriculeon.animal;

/**
 * "When it's first created" - "upon construction"
 */
abstract public class Animal implements AnimalInterface {
    private final String noise;
    public Animal(String noise) {
        this.noise = noise;
    }
    @Override
    public String getNoise() {
        return noise;
    }
}
