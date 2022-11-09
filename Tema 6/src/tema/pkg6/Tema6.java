/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg6;

import java.util.Scanner;

/**
 * @author Alexander
 */
public class Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //p1();
        //p2();
        //p3();
        //p4();
        //p5();
        //p6();
        //p7();
        //p8();
        //p9();
        //p10();
        //p11();
        //p12();
        //p13();
        //p14();
    }
    public static void p1 (){
        //Calculadora.
        Scanner sc = new Scanner(System.in);
        int v1, v2, oper;
        System.out.print("Introduce el primer número: ");
        v1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        v2 = sc.nextInt();
        System.out.print("Elija la operación: \n1- SUMA \n2- RESTA \n3- MULTIPLICACIÓN \n4- DIVISIÓN");
        oper = sc.nextInt();
        switch(oper){
            case 1:
                System.out.println("Resultado de la suma :" + suma (v1,v2));
                break;
            case 2:
                System.out.println("Resultado de la resta :" + resta (v1,v2));
                break;
            case 3:
                System.out.println("Resultado de la multiplicación :" + multi (v1,v2));
                break;
            case 4:
                System.out.println("Resultado de la división: " + div (v1,v2));
                break;
            default:
                System.out.println("Operación Incorrecta");
        }
    }
    public static int suma (int v1,int v2){
        return (v1 + v2);
    }
    public static int resta (int v1,int v2){
        return (v1 - v2);
    }
    public static int multi (int v1,int v2){
        return (v1 * v2);
    }
    public static int div (int v1,int v2){
        return (v1 / v2);
    }
    public static void p2 (){
        //Potencias.
        Scanner sc = new Scanner(System.in);
        double base;
        int expon;
        System.out.print("Introduce la base: ");
        base = sc.nextDouble();
        System.out.print("Introduce el exponente: ");
        expon = sc.nextInt();
        System.out.println(base + " ^ " + expon + " = " + potencia(base, expon));
    }
    public static double potencia (double v1, int v2){
        double pot = 1;
        int i = 0;
        while (i < v2){
            pot = pot * v1;
            i++;
        }
        return pot;
    }
    public static void p3 (){
        //Factorial.
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.print("Introduce el número: ");
        num = sc.nextInt();
        System.out.println("El factorial de " + num + " es " + factorial1 (num));
    }
    public static int factorial1 (int numero){
        int fact = 1;
        int i = 1;
        while (i <= numero){
            fact = fact * i;
            i++;
        }
        return fact;
    }
    public static void p4 (){
        //Fibonacci.
        Scanner sc = new Scanner (System.in);
        int num, i;
        System.out.print("Introduce el número: ");
        num = sc.nextInt();
        System.out.print("La serie de Fibonacci: ");
        for (i = 1; i <= num; i++){
            System.out.print(Fibonacci(i) + " ");
        }
    }
    public static int Fibonacci (int num){
        int a1 = 1, a2 = 1, i = 3, an = 0 ;
        if (num == 1 || num == 2)
            return 1;
        while (i <= num){
            an = a1 + a2;
            a1 = a2;
            a2 = an;
            i++;
        }
        return an;
    }
    public static void p5 (){
        //Fibonacci Recursiva.
        Scanner sc = new Scanner (System.in);
        int num, i;
        System.out.print("Introduce el número: ");
        num = sc.nextInt();
        System.out.print("La serie de Fibonacci: ");
        for (i = 1; i <= num; i++){
            System.out.print(FibonacciR(i) + " ");
        }
    }
    public static int FibonacciR (int num){
     if (num == 1 || num == 2)
            return 1;
        else
            return (Fibonacci(num-1) + Fibonacci (num-2));
    }
    public static void p6 (){
        //Capital final mediante formula del interés compuesto.
        Scanner sc = new Scanner(System.in);
        double capital, interes;
        int años;
        System.out.print("Introduce el capital: ");
        capital = sc.nextDouble();
        System.out.print("Introduce el interés: ");
        interes = sc.nextDouble();
        System.out.print("Introduce los años: ");
        años = sc.nextInt();
        System.out.println("El capital compuesto será: " + Interes(capital, interes, años));
    }
    public static double Interes (double c, double i, int t){
        for (int j = 0; j < t; j++){
            c = c *(1 + i / 100);
        }
        return c;
    }
    public static void p7 (){
        //Calcular el Combinatorio.
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Introduce el valor de m: ");
        m = sc.nextInt();
        System.out.print("Introduce el valor de n (n < m) : ");
        n = sc.nextInt();
        System.out.println("El combinatorio es: " + factorial2(m) / (factorial2(n) * factorial2 (m - n)));
    }
    public static int factorial2 (int num){
        if (num == 0)
            return 1;
        else
            return (num * factorial2(num-1));
    }
    public static void p8 (){
        
    }
    public static void p9 (){
        
    }
    public static void p10 (){
        
    }
    public static void p11 (){
        
    }
    public static void p12 (){
        
    }
    public static void p13 (){
        
    }
    public static void p14 (){
        
    }
}
