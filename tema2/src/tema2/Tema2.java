/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.util.Scanner;

/**
 * @author Alexander
 */
public class Tema2 {

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
        
    }
    public static void p1() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        int edad, limite;
        limite = 150;
        System.out.print("Introduzca el nombre:");
        nombre = sc.next();
        System.out.print("Introduzca el apellido:");
        apellido = sc.next();
        System.out.print("Introduzca la edad:");
        edad = sc.nextInt();
        if (edad > limite)
            System.out.print ("La edad de " + nombre + " " + apellido + " es incorrecta.");
    }
    public static void p2() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        int edad, limite;
        limite = 150;
        System.out.print("Introduzca el nombre:");
        nombre = sc.next();
        System.out.print("Introduzca el apellido:");
        apellido = sc.next();
        System.out.print("Introduzca la edad:");
        edad = sc.nextInt();
        if (edad > limite || edad <= 0)
            System.out.print ("La edad de " + nombre + " " + apellido + " es incorrecta.");
    }
    public static void p3() {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.print("Introduzca el primer numero: ");
        x = sc.nextDouble();
        System.out.print("Introduzca el segundo numero: ");
        y = sc.nextDouble();
        if (x > y)
            System.out.print ("El numero " + x + " es mas grande que el numero " + y);
        else if (x < y)
            System.out.print ("El numero " + y + " es mas grande que el numero " + x);
        else
            System.out.print ("Los numeros son iguales.");
                
                
    }
    public static void p4() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double nota;
        System.out.print("Introduzca el nombre: ");
        nombre = sc.next();
        System.out.print("Introduzca la nota: ");
        nota = sc.nextDouble();
        if (nota < 5)
            System.out.print(nombre + " ha suspendido.");
        else
            System.out.print(nombre + " ha aprobado.");
    }
    public static void p5() {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.print("Introduzca la nota: ");
        nota = sc.nextDouble();
        if (nota < 5)
            System.out.print("Ha suspendido.");
        else if (nota >= 5 && nota < 7)
            System.out.print("Ha sacado un aprobado.");
        else if (nota >= 7 && nota < 9)
            System.out.print("Ha sacado un notable.");
        else if (nota >=9 && nota <10)
            System.out.print("Ha sacado un sobresaliente");
        else if (nota == 10)
            System.out.print("Ha sacado una matricula de honor");
        else
            System.out.print("Ha de ser un numero entre el 0 y el 10");
    }
    public static void p6() {
        Scanner sc = new Scanner(System.in);
        int idioma;
        System.out.print("Introduzca el idioma:");
        System.out.print ("1.- Català \n2.- Castellano\n3.- English ");
        idioma = sc.nextInt();
        switch (idioma) {
            case 1:
                System.out.print("Gràcies");
                break;
            case 2:
                System.out.print("Gracias");
                break;
            case 3:
                System.out.print("Thank you");
                break;
            default:
                System.out.print("Elección incorrecta");
                break;    
        }     
    }
    public static void p7() {
        Scanner sc = new Scanner (System.in);
        int operacion;
        int a = 2;
        int b= 3;
        System.out.print("Elija operación (2 op 3):  ");
        System.out.print(" 1: SUMA ");
        System.out.print(" 2: RESTA ");
        System.out.print(" 3: MULTIPLICACIÓN ");
        System.out.print(" 4: DIVISIÓN ");
        operacion = sc.nextInt();
        switch(operacion){
            case 1 : System.out.print(a+b);
                break;
            case 2 : System.out.print(a-b);
                break;
            case 3 : System.out.print(a*b);
                break;
            case 4 : System.out.print(a/b);
                break;
            default : System.out.print("Elección incorrecta");             
        }
    }
    public static void p8() {
        Scanner sc = new Scanner(System.in);
        double grados, radiantes;
        System.out.print("Introduzca los grados: ");
        grados = sc.nextDouble();
        if (grados >= 360)
            grados = grados%360;
        radiantes = grados/180;
        System.out.print(radiantes + " Π radianes ");
    }
    public static void p9() {
        Scanner sc = new Scanner(System.in);
        int duros;
        System.out.print("Introduzca los duros");
        duros = sc.nextInt();
        System.out.print (duros/5000 + " billetes de 5000 ptas. ");
        duros = duros % 5000;
        System.out.print (duros/1000 + " billetes de 1000 ptas. ");
        duros = duros % 1000;
        System.out.print (duros/200 + " monedas de 200 ptas. ");
        duros = duros % 200;
        System.out.print (duros/25 + " monedas de 25 ptas. ");
        duros = duros % 25;
        System.out.print (duros + " monedas de 1 ptas. ");
         
    }
    public static void p10() {
        Scanner sc = new Scanner(System.in);
        double vel, radio, tiempo, longd, des;
        System.out.print  ("Introduce la velocidad (m/s) ");
        vel = sc.nextDouble();
        System.out.print  ("Introduce el radio (m) ");
        radio = sc.nextDouble();
        longd = 4 * Math.PI * radio;
        des = longd/1000;
        tiempo = longd / vel + des * 60;
        System.out.print  ("El tiempo que tarda el atleta es de " + tiempo + "segundos");   
    }
}