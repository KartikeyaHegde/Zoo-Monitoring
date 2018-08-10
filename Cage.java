package com.karthik.zoo.animals;

import java.util.ArrayList;
import java.util.List;

class Cage
{
    void caging()
    {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Bird("Peacock", 8,"fit"));
        animalList.add(new Mammal("Tiger", 10, "fit"));
        animalList.add(new Mammal("Lion", 15,"fit"));
        animalList.add(new AquaticAnimal("Crocodile", 30, "fit"));
        animalList.add(new Mammal("Dog",12,"fit"));

        System.out.println("Animals in zoo:");

        System.out.println();

        for(int i=0; i<animalList.size();i++)
        {
            System.out.println(animalList.get(i).getName() + " - " + animalList.get(i).getAge() + " years old " + " and animal is " + animalList.get(i).getHealthStatus());
        }
    }
}
