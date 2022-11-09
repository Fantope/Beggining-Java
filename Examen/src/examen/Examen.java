/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Alexander
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
        //p5();
        //p6();
        //p7();
        //p8();
        //p9();
        //p10();
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
        double nota, notas = 0,n_susp = 0, n_aprob = 0, m_total, m_aprob, m_susp = 0;
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
        int n;
        System.out.print("Introduce la cantidad de numeros en las dos series: ");
        n = sc.nextInt();
        int serie1 [] = new int [n];
        int serie2 [] = new int [n];
        for (int i = 0; i < n; i++){
            System.out.print("Introduce el numero " + (i + 1) + " de la primera serie: ");
            serie1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            System.out.print("Introduce el numero " + (i + 1) + " de la segunda serie: ");
            serie2[i] = sc.nextInt();
        }
        int res [] = new int [n];
        for (int j = 0; j < n; j++){
            //Aquesta operació només multiplica per el numero que estigui a la mateixa posició...
            res[j] = serie1[j] * serie2[j];
            System.out.print(res[j] +" ");
        }
    }
    public static void p6(){
        int i;
        for (i = 0; i < 11; i++){
        if (i < 5)
            System.out.print(i + " ");
        else
            System.out.print((15-i) +" ");
        }
    }
    public static void p7(){
        Scanner sc = new Scanner(System.in);
        int s1[] = new int [10];
        int n;
        for (int i = 0; i < 10 ; i++){
        System.out.print("Introduce el numero " + (i + 1) + " de la serie: ");
        s1[i] = sc.nextInt();    
        }
        System.out.print("Introduce el numero que quieres comparar: ");
        n = sc.nextInt();
        for (int j = 0; j < 10 ; j++){
            if (s1[j] > n){
                System.out.println(s1[j] + " es mayor que " + n);
            }else if (s1[j] < n){
                System.out.println(s1[j] + " es menor que " + n);
            }else {
                System.out.println(s1[j] + " es igual que " + n);
            }   
         }
    }
    public static void p8(){
        //La respuesta correcta es "b".
        int x, y, a, b;
        x = 2;
        y = 3;
        a = f1(x);
        b = f2(y,a);
        System.out.println(x + ","+ y + "," + a + "," + b);
    }
    public static int f1 (int x){
        x = x * x;
        return x;
    }
     public static int f2 (int x, int y){
        y = y * y;
        return x * y;
    }
     public static void p9(){
         Scanner sc = new Scanner(System.in);
         int emp, edad, salario, c_edad = 0, c_sal = 0, s_tot = 0, edad_tot = 0, m_sal, m_edad;
         do{
            System.out.print("Introduce la cantidad de empleados: ");
            emp = sc.nextInt();
         }while (2 > emp || emp > 15);
         for(int i = 1; i <= emp; i++){
            do{
               System.out.print("Introduce salario empleado " + i + ":");
               salario = sc.nextInt();
            }while (600 > salario || salario > 3000);
            if (salario < 1000)
                c_sal++;
            s_tot = s_tot + salario;
            do{
               System.out.print("Introduce edad empleado " + i + ":");
               edad = sc.nextInt();
            }while (16 > edad || edad > 65);
            if (edad > 50)
                c_edad++;
            edad_tot = edad_tot + edad;
         }
        m_edad = edad_tot / emp;
        m_sal = s_tot / emp;
        System.out.println("La media de sueldos es de " + m_sal + " euros.");
        System.out.println("La media de edades es de " + m_edad + " años.");
        System.out.println(c_sal + " empleados cobran menos de 1000 euros.");
        System.out.println(c_edad + " empleados tienen mas de 50 años.");
     }
     public static void p10(){
         Scanner sc = new Scanner(System.in);
        int exponente, base;
        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        System.out.print("Introduce el exponente: ");
        exponente = sc.nextInt();
        System.out.println(base + " ^ " + exponente + " = " + potencia(base, exponente));
     }
     public static int potencia (int v1, int v2){
        int i = 0, j = 1;
        while (i < v2){
            j = j * v1;
            i++;
        }
        return j;
    }
}