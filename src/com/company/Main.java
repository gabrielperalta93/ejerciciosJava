package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ejericio1();
        //Ejercicio2();
        //Ejercicio3();
        //Ejercicio4();
        Ejercicio5();
    }

    public static void Ejericio1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar numero");

        int a = scanner.nextInt();
        int comparar = 0;
        while(a > comparar){
            comparar++;
            if (comparar%2 == 0){
                System.out.println(comparar + " es par");
            }
        }
        scanner.close();
    }

    public static void Ejercicio2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar N y luego M");
        int N = scanner.nextInt(); //3
        int M = scanner.nextInt(); //15
        int i = 0;
        for (i = 1; i < M; i++){
            if(M%i == 0){
                System.out.println(i + " es multiplo");
            }

        }

        scanner.close();
    }

    public static void Ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int N = scanner.nextInt();

        int i = 2;
        boolean esPrimo = true;
        while (i <= N / 2) {
            if (N % i == 0) {
                esPrimo = false;
                break;
            }
            ++i;
        }
        if (esPrimo)
            System.out.println(N + " es un numero primo");
        else
            System.out.println(N + " no es un numero primo");

        scanner.close();
    }

    public static void Ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = scanner.nextInt();
        int cont = 0;
        for(int i =1 ; cont < n; i++){
            if(esPrimo(i)) {
                System.out.println(i);
                cont++;
            }
        }
    }

    public static boolean esPrimo(int n) {

        for(int i=2 ; i<n; i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Ejercicio5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese N");
        int n = scan.nextInt();
        System.out.println("Ingrese M");
        int m = scan.nextInt();
        System.out.println("Ingrese D");
        int d = scan.nextInt();

        int aux = 0;
        int count;
        for (int i = 0; aux != n; i++) {
            count = numerosRepetidos(i, d);
            if (count >= m) {
                aux++;
                System.out.println(i);
            }
        }
    }

    public static int numerosRepetidos(int n, int d) {
        int count = 0;

        while (n > 0) {
            count = (n % 10 == d) ? count + 1 : count;
            n = n / 10;
        }

        return count;
    }
}
