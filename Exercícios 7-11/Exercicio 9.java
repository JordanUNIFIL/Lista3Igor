package com.mycompany.listatresjfb;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valores ímpares:");
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}