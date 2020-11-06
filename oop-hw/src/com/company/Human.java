package com.company;

public abstract class Human {
    private String name;
    private String lastName;
    private float height;
    private float weight;
    private final boolean gender;

    protected Human(boolean gender) {
        this.gender = gender;
    }

    abstract boolean speak(Human anotherPerson);
    abstract boolean sustainSociety(Human anotherPerson);
    public boolean spendTimeTogether(Human anotherPerson) {
        int heightOfFirstPerson = 0;
        int differenceInHeight = 0;
        if((this.height / 100) == heightOfFirstPerson) {
        }
        return  false;
    };

    public void haveRelations(Human anotherPerson) {
        this.spendTimeTogether(anotherPerson);
    };



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", getGender=" + gender +
                '}';
    }
}
