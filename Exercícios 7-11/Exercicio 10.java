package com.mycompany.listatresjfb;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        int n1 = sc.nextInt();

        System.out.println("Informe o segundo número");
        int n2 = sc.nextInt();

        for (int i = n1 + 1; i <= n2 - 1; i++) {
            System.out.println(i);
        }
    }
}