package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);//głupie nazewnictwo
        System.out.println("s");
        double w;
        double a, b;
        int x;
        System.out.println("Co chcesz zrobić?");
        System.out.println("1.Dodawanie, 2.Odejmowanie , 3.Mnożenie 4.Dzielenie   ");
        x=p.nextInt();
        switch (x) {
            case 1 -> {
                a=p.nextDouble(); // wprowadzamy z klawiatury a
                b=p.nextDouble();// wprowadzamy z klawiatury b
                w=a+b;
                System.out.println("Wynik to:" +w);
            }
            case 2 -> {

            }
            default -> System.out.println("Nie ma takiego działania");


        }

    }
}
