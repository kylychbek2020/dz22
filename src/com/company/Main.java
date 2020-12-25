package com.company;

public class Main {

    public static void main(String[] args) {
        person(38, 14);
        person(27, 15);
        person(40, 25);
        person(18, 33);
        person(22, 20);
    }

    public static int person(int ageOfPerson, int temperature) {
        if (ageOfPerson > 20 && ageOfPerson < 45 && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (ageOfPerson < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно идти гулять");
        } else if (ageOfPerson > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Можно идти гулять");
        } else {
        System.out.println("Оставаться дома");
    }
        return ageOfPerson;
}}




