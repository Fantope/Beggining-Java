/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //p1();
        //p2();
        //p3();
        //p4();
        p5();
        //p6();
        //p7();
    }
    public static void p1(){
        Scanner sc = new Scanner(System.in);
        int alt, anc;
        System.out.print("Introduce la altura: ");
        alt = sc.nextInt();
        System.out.print("Introduce la anchura: ");
        anc = sc.nextInt();
        for (int i = 0; i < alt; i++){
            for ( int j = 0; j < anc; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void p2(){
        Scanner sc = new Scanner(System.in);
        double nota, notas = 0,n_susp = 0, n_aprob = 0, m_total = 0, m_aprob = 0, m_susp = 0;
        int  susp = 0, aprob = 0;
        for (int i = 0 ; i < 10; i++){
            do{
                System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
                nota = sc.nextDouble();
            /*if (nota < 0)
                System.out.print("La nota es incorrecta.");
            else if (nota > 10)
                System.out.print("La nota es incorrecta.");*/
            }while(nota<0 || nota>10);
            if ( nota < 5){
                susp++;
                notas = notas + nota;
                n_susp = n_susp + nota;
            }else{
                aprob++;
                notas = notas + nota;
                n_aprob = n_aprob + nota;
            }
        }
        m_total = notas/10;
        m_susp = n_susp/susp;
        m_aprob = n_aprob/aprob;
        System.out.println("Hay " + aprob + " alumnos aprobados.");
        System.out.println("Hay " + susp + " alumnos suspendidos.");
        System.out.println(m_susp + " es la nota media de los alumnos que han suspendido.");
        System.out.println(m_aprob + " es la nota media de los alumnos que han aprobado.");
        System.out.println(m_total + " es la nota media.");
    }
    public static void p3(){
        Scanner sc = new Scanner (System.in);
        int fil, col;
        System.out.print("Introduce las filas: ");
        fil = sc.nextInt();
        System.out.print("Introduce las columnas: ");
        col = sc.nextInt();
        int tabla[][] = new int[fil][col];
        for (int i = 0; i < fil; i++){
            for (int j = 0; j < col; j++){
                tabla[i][j] =j + 1;
                System.out.print(tabla[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static void p4(){
        Scanner sc = new Scanner (System.in);
        int num1, num2, total = 0;
        do{
            System.out.print("Introduce la cantidad de numeros a introducir: ");
            num1 = sc.nextInt();
        }while(num1<0);
                
        for (int i = 0; i < num1; i++){
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            num2 = sc.nextInt();
            total = total + num2;
        }
        System.out.println("La suma de todos los numeros es: " + total);
    }
    public static void p5(){
        Scanner sc = new Scanner (System.in);
        int n, m;
        System.out.print("Introduce la cantidad de numeros en las dos series: ");
        n = sc.nextInt();
        int s [][] = new int [n][n];                                                               
        for (int i = 0; i < n; i++){
        System.out.print("Introduce el numero " + i + " de la primera serie: ");
        //s = sc.nextInt();
        for (int j = 0; i < n; j++){
        System.out.print("Introduce el numero " + i + " de la segunda serie: ");
        //s [][j] = sc.nextInt();
       
    }
}
