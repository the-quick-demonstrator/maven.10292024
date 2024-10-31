package com.github.curriculeon;

import com.github.curriculeon.animal.Animal;
import com.github.curriculeon.animal.Cat;
import com.github.curriculeon.animal.Dog;
import com.github.curriculeon.animal.Snake;

public class MainApplication {
    public static void main(String... args) {
        final Dog dog = new Dog();
        final Cat cat = new Cat();
        final Snake snake = new Snake();
        final Animal[] animals = new Animal[]{dog, cat, snake};
        erbodySpeakn(animals);
    }

    public static void erbodySpeakn(Animal... animals) {
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            animal.speak();
        }
    }


}
