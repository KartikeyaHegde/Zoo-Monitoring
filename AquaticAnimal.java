package com.karthik.zoo.animals;

public class AquaticAnimal extends Animal {
    private String name;
    private int age;
    private String healthStatus;

    public AquaticAnimal(String name, int age, String healthStatus) {
        this.name = name;
        this.age = age;
        this.healthStatus = healthStatus;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getHealthStatus() {
        return healthStatus;
    }

    public void setAnimal(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
}
