/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg5;

import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class Tema5 {

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
    public static void p1 () {
        //Abecedario normal e inverso.
        char abc[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
            'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char letra;
        int i = 0;
        System.out.println("Abecedario normal: ");
        while (i < 26) {
            letra = abc[i];
            System.out.print(letra + " ");
            i = i + 1;
        }
        i = i - 1;
        System.out.println("\nAbecedario inverso: ");
        while (i >= 0) {
            letra = abc[i];
            System.out.print(letra + " ");
            i = i - 1;
        }
        }
    public static void p2 () {
        //Guardado de 10 num y inversion de estos.
        Scanner sc = new Scanner (System.in);
        int save[] = new int [10];
        int n, i = 0;
        do{
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            save[i] = sc.nextInt();
            i++;
        }while (i < 10);
        i = i - 1;
        System.out.print("Secuencia Inversa: ");
        while (i >= 0){
            System.out.print(save[i] + " ");
            i--;
        }
    }
    public static void p3 () {
        //Guardado e interpretacion de datos en arrays.
        Scanner sc = new Scanner (System.in);
        int mem[] = new int [10];
        int contador = 0, i = 0, n;
        do{
            System.out.print("Introducir numero " + (i + 1) + ": ");
            mem[i] = sc.nextInt();
            i++;
        }while (i < 10);
        i = 0;
        while (i < 10){
            if (mem[i] > 22)
            contador++;
            i++;
        }
        System.out.print("Has puesto " + contador + " numeros superiores a 22." + "\n");
    }
    public static void p4 () {
        //Comprovante de valores repetidos.
        int j, i ;
        int mem[] = {10, 11, 60, 50, 40, 38, 33, 89, 13, 56, 40, 70, 60};
        System.out.print("Vector: ");
        for (i = 0; i < 13; i++){
             System.out.print(mem[i] + " ");
        }
        System.out.print("\nNumeros repetidos en el vector: ");
        for (i = 0; i < 13; i++){
            for (j = i + 1; j < 13; j++){
                if (mem[i] == mem[j]){
                    System.out.print(mem[i] + " ");
                }
            }
        }
    }
    public static void p5() {
        //Numeros almacenados, usados para su suma y declaracin de limites.
        Scanner sc = new Scanner (System.in);
        int n, max = -10000, min = 10000, suma = 0;
        do{
            System.out.print("Introduce la cantidad de números: ");
            n = sc.nextInt();
        }while (n < 0);
        int num[] = new int [n];
        for (int i = 0; i < n; i++){
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            suma = suma + num[i];
            if (max < num[i])
                max = num[i];
            if (min > num[i])
                min = num[i];
        }
        System.out.println("La suma es: " + suma);
        System.out.println("El número mas grande es: " + max);
        System.out.println("El número mas pequeño es: " + min);
    }
    public static void p6() {
        //Calculo media y cantidad de aprobados/suspendidos.
        Scanner sc = new Scanner(System.in);
        int nota = 0, i = 0, limite;
        int aprob = 0, susp = 0, s_susp = 0, s_aprob = 0;
        double m_susp = 0, m_aprob = 0;
        int Nota[] = new int [100];
        System.out.println("Introduce nota: ");
        nota = sc.nextInt();
        while (nota >= 0 && nota <= 100){
            Nota[i] = nota;
            i++;
            System.out.println("Introduce nota: ");
            nota = sc.nextInt();
        }
        limite = i;
        for (i = 0; i < limite; i++){
            if (Nota[i] >=5) {
                aprob++;
                s_aprob = s_aprob + Nota[i];
            }else{
                susp++;
                s_susp = s_susp + Nota[i];
            }
            
        }
        if (aprob != 0){
                m_aprob = s_aprob / aprob;
        }
        if (susp != 0){
                m_susp = s_susp / susp;
        }        
            System.out.println("Hay un total de " + aprob + " aprobados, con una media de " + m_aprob);
            System.out.println("Hay un total de " + susp + " suspendidos, con una media de " + m_susp);
    }
    public static void p7 () {
        //Comparacion de numeros de arrays diferentes.
        Scanner sc = new Scanner(System.in);
        int s1[] = new int [10];
        int s2[] = new int [10];
        for (int i = 0; i < 10 ; i++){
        System.out.print("Introduce el numero " + (i + 1) + " de la primera serie: ");
        s1[i] = sc.nextInt();    
    }
         for (int j = 0; j < 10 ; j++){
        System.out.print("Introduce el numero " + (j + 1) + " de la segunda serie: ");
        s2[j] = sc.nextInt();
    }
         for (int k = 0; k < 10 ; k++){
            if (s1[k] > s2[k]){
                System.out.println(s1[k] + " es mayor que " + s2[k]);
            }else if (s1[k] < s2[k]){
                System.out.println(s1[k] + " es menor que " + s2[k]);
            }else {
                System.out.println(s1[k] + " es igual que " + s2[k]);
            }   
         }
    }
    public static void p8 () {
        //Mover de una array a otras.
        Scanner sc = new Scanner(System.in);
        int o[] = new int[10];
        int d1[] = new int[5];
        int d2[] = new int[5];
        int j;
        for( int i = 0; i < 10; i++){
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            o[i] = sc.nextInt();
        }
        for (j = 0; j < 10; j++){
            if (j < 5){
                d1[j] = o[j];
            }
            else {
                d2[j - 5] = o[j];
            }
        }
        System.out.print("Vector 1: ");
        for (j = 0; j < 5; j++){
            System.out.print(d1[j] + " ");
        }
        System.out.print("\nVector 2: ");
        for (j = 0; j < 5; j++){
            System.out.print(d2[j] + " ");
        }
    }
    public static void p9 () {
        //Calculo de media y cantidad de aprobados/suspendidos.
        Scanner sc = new Scanner (System.in);
        double NOTAS[] = new double[10];
        double nota, media, m_aprob = 0, m_susp = 0, s_aprob = 0;
        double s_susp = 0, s_media = 0;
        int n = 0, susp = 0, aprob = 0;
        while (n < 10){
            System.out.print("Introduce la nota " + (n + 1) + ": ");
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10){
                NOTAS[n] = nota;
                n++;
            }
        }
        for (int i = 0; i < 10; i++){
            if (NOTAS[i] >= 5.0){
                aprob++;
                s_aprob = s_aprob + NOTAS[i];
            }else{
                susp++;
                s_susp = s_susp + NOTAS[i];
            }
            s_media = s_media + NOTAS[i];
        }
            media = s_media / n;
        if (aprob != 0){
                m_aprob = s_aprob / aprob;
        }
        if (susp != 0){
                m_susp = s_susp / susp;
        }
    System.out.println("La nota media es: " + media);
    System.out.println("Hay un total de " + aprob + " aprobados, con una media de " + m_aprob);
    System.out.println("Hay un total de " + susp + " suspendidos, con una media de " + m_susp);    
    }
    public static void p10 () {
        //Suma inversa de dos arrays.
        Scanner sc = new Scanner (System.in);
        int o1[] = new int [10];
        int o2[] = new int [10];
        int dest[] = new int [10];
        int j, i;
        for (i = 0; i < 10; i++){
            System.out.print("Introduce el numero " + (i + 1) + " del primer vector: ");
            o1[i] = sc.nextInt();
        }
        for (j = 0; j < 10; j++){
            System.out.print("Introduce el numero " + (j + 1) + " del segundo vector: ");
            o2[j] = sc.nextInt();
        }
        System.out.print("Vector Suma: ");
        for (j = 0;j < 10; j++){
            dest[j] = o1[j] + o2[9-j];
            System.out.print(dest[j] +" ");
        }
    }
    public static void p11 () {
        //Array bidimensional.
        int tabla [][] = new int [10][10];
        int i, j;
        for (i = 0; i < 10; i++){
            for (j = 0; j < 10; j++){
                tabla[i][j] = (i + 1) * (j + 1);
                System.out.print (tabla [i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
    public static void p12 () {
        //Tablero de ajedrez.
        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= 8; j++){
                if ((i + j) %2 == 0)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }
            System.out.println(" ");
        }
    }
    public static void p13 () {
        //Generación de filas y columnas.
        Scanner sc = new Scanner (System.in);
        int f, c;
        System.out.print("Introduce el número de filas: ");
        f = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        c = sc.nextInt();
        int fc[][] = new int [f][c];
        for (int i = 0; i < f; i++){
            for (int j = 0; j < c; j++){
                fc[i][j] = j + 1;
                System.out.print(fc[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
    public static void p14 () {
        //Tabla de sumas de posición en base a columna y fila.
        int tabla[][] = new int [8][5];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++){
                tabla[i][j] = i + j + 1;
                System.out.print(tabla [i][j] + " ");
            }
            System.out.println (" ");
        }
    }
    
}
