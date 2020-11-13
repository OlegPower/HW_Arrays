
package com.company;

public class Man extends Human{

    public Man() {
        super(true);

    }

    @Override
    boolean speak(Human anotherPerson) {
        if(!anotherPerson.getGender()){
            return true;
        }else{
            double randomNumber = Math.random();
            return randomNumber < 0.5;
        }
    }
    @Override
    public boolean sustainSociety(Human anotherPerson) {
        if(anotherPerson.getGender()) {
            double randomNumber = Math.random();
            return randomNumber < 0.056;
        }else{
            double randomNumber = Math.random();
            return randomNumber < 0.7;
        }

    }
}





































