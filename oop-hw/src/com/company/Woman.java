package com.company;

import java.util.Scanner;

public class Woman extends Human{
    public Woman() {
        super(false);
    }

    @Override
    boolean speak(Human anotherPerson) {
        return true;
    }

    @Override
    public boolean sustainSociety(Human anotherPerson) {
        if(anotherPerson.getGender()) {
            double randomNumber = Math.random();
            return randomNumber < 0.05;
        }else{
            double randomNumber = Math.random();
            return randomNumber < 0.7;
        }
    }
    protected Human giveBirth(Human father) {
        Human child = null;

        double randomNumber = Math.random();

        if (randomNumber > 0.5){
            child = new Man();
        }else{
            child = new Woman();
        }

        System.out.println("Please enter Name for person");
        Scanner scanner = new Scanner(System.in);
        child.setName(scanner.nextLine());
        child.setLastName(father.getLastName());
        if(child.getGender()){
            float boyHeight = father.getHeight() + (0.1f * this.getHeight());
            child.setHeight(boyHeight);
        }else {
            float girlHeight = this.getHeight() + (0.1f * father.getHeight());
            child.setHeight(girlHeight);
        }
        if(child.getGender()){
            float boyWeight = father.getWeight() + (0.1f * this.getWeight());
            child.setWeight(boyWeight);
        }else {
            float girlWeight = this.getWeight() + (0.1f * father.getWeight());
            child.setWeight(girlWeight);
        }
        return child;
    }
}

