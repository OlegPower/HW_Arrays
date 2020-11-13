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
        float heightOfFirstPerson = this.height;
        float heightOfSecondPerson = anotherPerson.height;
        float reductionRate = 100 * ((heightOfFirstPerson - heightOfSecondPerson) / heightOfSecondPerson);
        if (Math.abs(reductionRate) > 10) {
            double randomNumber = Math.random();
            return randomNumber < 0.85;
        } else {
            double randomNumber = Math.random();
            return randomNumber < 0.95;
        }
    }


    public Human haveRelations(Human anotherPerson) {
        boolean condition = (this.speak(anotherPerson) && this.sustainSociety(anotherPerson) && this.spendTimeTogether(anotherPerson));
        System.out.println("condition = " + condition);
        if (condition) {
            if (this.gender == anotherPerson.gender) {
                return null;
            } else {
                if (this.gender == true) {
                    return ((Woman) anotherPerson).giveBirth(this);
                } else {
                    return ((Woman) this).giveBirth(anotherPerson);
                }
            }
        } else {
            return null;
        }
    }

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



