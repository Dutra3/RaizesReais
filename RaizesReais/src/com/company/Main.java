package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Sabendo que uma equação segue o seguinte formato: ax^2 + bx + c = 0");
        System.out.println("Sabendo que o Delta da equação me diz se existe ou não raizes reais, sendo Delta = b^2 - 4*a*c");
        System.out.println("Me forneça um valor para a");
        int a = keyboard.nextInt();
        System.out.println("Me forneça um valor para b");
        int b = keyboard.nextInt();
        System.out.println("Me forneça um valor para c");
        int c = keyboard.nextInt();

        System.out.println("A equação fica da seguinte forma: " + a + "x^2" + " + " + b + "x" + " + " + c  + " = 0");
        System.out.println("O delta fica da seguinte forma: " + b + "^2" + " - 4*" + a + "*" + c);

        double delta = Math.pow(b, 2) - 4*a*c;
        System.out.println(delta);

        if(delta>=0) {
            System.out.println("Existem raizes reais nessa equação");
        } else {
            System.out.println("Não existem raizes reais para essa equação");
        }
    }
}
