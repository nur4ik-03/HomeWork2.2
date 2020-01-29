package com.company;


import java.util.Random;


public class Main {
    public static int age;
    public static void main(String[] args) {
        String name = "RICK";
        int age = 34;
        int tempreture = 29;
        if(age >= 20 && age < 45 && tempreture <30 && tempreture >= -20){
            System.out.println("Можно идти гулять");
        }
        if (age < 20 && tempreture >= 0 && tempreture < 28){
            System.out.println("Можно идти гулять");
        }
        if (age >= 45 && tempreture >= -10 && tempreture < 25 ){
            System.out.println("Можно идти гулять");

        }

        System.out.println(generateRandomAge(age));
    }
    public static int generateRandomAge(int age){
        Random rand = new Random();
        age = rand.nextInt(107);
        return age;
    }

}



