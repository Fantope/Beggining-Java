/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 * @author Alexander
 */
public class Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //p1();
        //p2();
        //p3();
        //p4();
        //p5();
    }
    public static void p1 () {
        //Mejor alumno y su nota media.
        Scanner sc = new Scanner(System.in);
        int i, j, alumnos = 150, asignaturas = 5;
        double nota, suma, media, acum;
        String nombre, mejor_alum;
        acum = 0;
        mejor_alum = "NaN";
        System.out.print("Introduce el numero de alumnos que vas a escribir: ");
        alumnos = sc.nextInt();
        for (i = 1; i <= alumnos; i++){
            suma = 0;
            System.out.print("Introduce el nombre del alumno:");
            nombre = sc.next();
            for (j = 1; j<= asignaturas; j++){
                System.out.print("Introduce la nota de la asignatura " + j + ": ");
                nota = sc.nextDouble();
                suma = suma + nota;
            }
            media = suma / asignaturas;
            if (media > acum){
                acum = media;
                mejor_alum = nombre;
            }
        }
        System.out.print("El mejor alumno es " + mejor_alum + ".");
        System.out.println("Su nota media es: " + acum + ".");
                
    }
    public static void p2 () {
        //Suma de divisores.
        Scanner sc = new Scanner(System.in);
        int numero, i, suma;
        System.out.print("Introduce un numero y, para acabar, uno negativo: ");
        numero = sc.nextInt();
        suma = 0;
        while (numero > 0){
            for (i = 1; i <= numero/2; i++){
                
                if (numero % i == 0){
                    suma = suma + i;
                }    
            }
            System.out.println("La suma de los divisores del número es: " + suma);
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        }
        System.out.print("La suma de los divisores de los número era: " + suma);
    }    
    public static void p3 () {
        //Capital resultante despues de m años.
        Scanner sc = new Scanner(System.in);
        int j, m;
        double c, i;
        System.out.print("Introduce el capital(c > 0): ");
        c = sc.nextDouble();
        System.out.print("Introduce el interes(100>i>0): ");
        i = sc.nextDouble();
        System.out.print("Introduce el tiempo(m > 0):");
        m = sc.nextInt();
        for (j = 1; j<= m; j++)
            c = c * (1 + i / 100);
        System.out.print("Tendrás" + c + " €. ");
    }
    public static void p4 () {
        //Cambio de formato dia/mes/año a dia x del y mes del z año + cantidad de dias.
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, n_dias = 0;
        String n_mes = "";
        System.out.print("Introduce el día: ");
        dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        año = sc.nextInt();
        switch (mes){
            case 1:
                n_mes = "enero";
                n_dias = 31;
                break;
            case 2:
                n_mes = "febrero";
                if (año % 4 == 0)
                    n_dias = 29;
                else
                    n_dias = 28;
                break;
            case 3:
                n_mes = "marzo";
                n_dias = 31;
                break;
            case 4:
                n_mes = "abril";
                n_dias = 30;
                break;
            case 5:
                n_mes = "mayo";
                n_dias = 31;
                break;
            case 6:
                n_mes = "junio";
                n_dias = 30;
                break;
            case 7:
                n_mes = "julio";
                n_dias = 31;
                break;
            case 8:
                n_mes = "agosto";
                n_dias = 30;
                break;
            case 9:
                n_mes = "septiembre";
                n_dias = 30;
                break;
            case 10:
                n_mes = "octubre";
                n_dias = 31;
                break;
            case 11:
                n_mes = "noviembre";
                n_dias = 30;
                break;
            case 12:
                n_mes = "diciembre";
                n_dias = 31;
                break;
            default:
                System.out.println("Debes poner un mes valido.");                
        }
        System.out.println("El mes de " + n_mes + " tiene " + n_dias + " dias.");
        System.out.println("La fecha es " + dia + " de " + n_mes + " de " +año);
    }
    public static void p5 () {
        //Serie matematica parecida a la de Fibonacci.
        int a1 = 0, a2 = 1, an = a2 + (2 * a1), n = 3;
        while (an < 2000){
            a1 = a2;
            a2 = an;
            an = a2 + (2 * a1);
            n = n + 1;
            System.out.println(an);

        }
        System.out.println("\nEl rango es " + (n-1) + " y el resultado es: " + an);
    }

}
