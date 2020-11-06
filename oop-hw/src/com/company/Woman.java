package com.company;

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

//    @Override
//    boolean spendTimeTogether() {
//        return false;
//    }

//    @Override
//    void haveRelations(Human anotherPerson) {
//        this.sustainSociety(anotherPerson);
//    }
    boolean giveBirth(){
        return true;
    }
}
