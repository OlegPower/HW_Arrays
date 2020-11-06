package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter information for person1");
        Human person1 = createPerson();
        Human person2 = createPerson();
        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
        comparePersonCompatibilityTest(person1, person2);
    }
    private static Human createPerson(){
        System.out.println("Do you wanna chose a Man(enter True) or a Woman(enter False?)");
        Scanner scanner = new Scanner(System.in);
        Boolean choseGender = Boolean.parseBoolean(scanner.nextLine());
        Human person;
        if (choseGender){
            person = new Man();
        }else{
            person = new Woman();
        }
        System.out.println("Please enter Name for person");
        person.setName(scanner.nextLine());
        System.out.println("Please enter Lastname for person");
        person.setLastName(scanner.nextLine());
        System.out.println("Please enter Height for person");
        person.setHeight(Integer.parseInt(scanner.nextLine()));
        System.out.println("Please enter Weight for person");
        person.setWeight(Integer.parseInt(scanner.nextLine()));

        return person;
    }

    private static void comparePersonCompatibilityTest(Human person1, Human person2){
        person1.haveRelations(person2);
    }
}
