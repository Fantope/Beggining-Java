/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;

/**
 * @author Alexander
 */
public class Tema3 {

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
        //Escritura multiple.
        int x = 0;
        while (x < 100) {
            System.out.print("No lanzaré avioncillos en clase. \n");
            x = x + 1;
        }
}
    public static void p2 () {
        //Cuenta atras con tres maneras diferentes.
        int x = 100;
        while (x >= 1){
            System.out.println (x + ". ");
            x = x - 1;
        }
        x = 100;
        do { 
            System.out.println (x + ". ");
            x = x - 1;
        }while (x >= 1);
        for (x = 100; x >= 1; x = x - 1)
            System.out.println (x + ". ");
}
    public static void p3 () {
        //Tabla de multiplicar.
        Scanner sc = new Scanner (System.in);
        int mult, i, numero;
        i = 1;
        System.out.print("Introduce el número: ");
        numero = sc.nextInt();
        
        while (i <= 10){
            mult = i * numero;
        System.out.println(numero + " x " + i + " = " + mult);
        i = i + 1;
        }
}     
    public static void p4 () {
        //Multiplicación de dos valores mediante suma.
        Scanner sc = new Scanner(System.in);
        int num1, num2, i, suma;
        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();
        i = 0;
        suma = 0;
        while (i < num2){
            suma = suma + num1;
            i = i + 1; 
        }
        System.out.print (num1 + " x " + num2 + " = " + suma);
}
    public static void p5 () {
        // Producto por los siguientes num a num inicial.
        Scanner sc = new Scanner(System.in);
        int num, mult;
        System.out.print("Introduce el número: ");
        num = sc.nextInt();
        for (int i = num + 1; i <= num + 5; i = i + 1){
            mult = i * num;
            System.out.println(num + " * " + i + " = " + mult);
        }
            
}
    public static void p6 () {
       Scanner sc = new Scanner(System.in);
       //Suma de cuadrados.
       int n , res = 0, i = 1;
       System.out.print("Introduce el número: ");
       n = sc.nextInt();
       while (i <= n){
           res = res + (i * i);
           i = i + 1;
       }
       System.out.println("El resultado es: " + res);
}
    public static void p7 () {
        //Introducir 10 num o negativo.
       Scanner sc = new Scanner(System.in);
       int n, i = 1;
       do {
           System.out.print("Introduce número " + i + ": ");
           n = sc.nextInt();
           i = i + 1;
       }
       while (i <= 10 && n > 0);
       System.out.print("Se acabo la secuencia.");
}
    public static void p8 () {
        //Introducir 10 num o negativo + media.
       Scanner sc = new Scanner(System.in);
       int n = 0, i = 0; 
       double media = 0, sumando = 0;

       /*//
       System.out.print("Introduce el número " + i + ": ");
       n = sc.nextInt();
       while (i < 10 && n > 0){
           sumando = sumando + n;
           i = i + 1;
           if (i<10){
                System.out.print("Introduce el número " + i + ": ");
                n = sc.nextInt();
           }
       }
       //*/
       do {
           System.out.print("Introduce el número " + i + ": ");
           n = sc.nextInt();
           if (n > 0){
               sumando = sumando + n;
               i = i + 1;
           }
       }
       while (i < 10 && n > 0);
       //
       media = sumando / i;
        if (i > 0)
          System.out.print("La media de los números introducidos es: " + media); 
        else   
          System.out.print("No has introducido ningun numero valido.");     
}
    public static void p9 () {
        //Suma de numeros entre dos cifras.
        Scanner sc = new Scanner(System.in);
        int a, b, res;
        a = 1;
        b = 2;
        res = 0;
        System.out.print("Introduce el número " + a + ": ");
        a = sc.nextInt();
        System.out.print("Introduce el número " + b + ": ");
        b = sc.nextInt();
        while (a <= b){
            res = res + a;
            a = a + 1;
        }
        if (a > b + 1){
            System.out.print("El primer número debe ser menor que el segundo");
        }else{    
        System.out.print("El resultado es: " + res);
        }
}
    public static void p10 () {
        //Juego "1 entre 100".
        Scanner sc = new Scanner(System.in);
        int random, x;
        random = (int)(Math.random()*99+1);
        do{
        System.out.println("Introduce un numero: ");
        x = sc.nextInt();
        if (x > random){
            System.out.println("El numero " + x + " es mayor.");    
        }
        else if (x < random && x > 0){
            System.out.println("El numero " + x + " es menor."); 
        }
        else if (x == random){
            System.out.println("Has acertado, el numero era: " + x);    
        }
        else
            System.out.println("Vuelve pronto!");
        }while ((x < random || x > random) && x > 0);
}
    public static void p11 () {
        //Juego "1 entre 100" con repeat.
    Scanner sc = new Scanner(System.in);
        int random, x;
        String repite;
        random = (int)(Math.random()*99+1);
        do{
        System.out.println("Introduce un numero: ");
        x = sc.nextInt();
        if (x > random){
            System.out.println("El numero " + x + " es mayor.");    
        }
        else if (x < random){
            System.out.println("El numero " + x + " es menor."); 
        }
        else {//Has acertado
            System.out.println("Has acertado, el numero era: " + x);
            System.out.println("Quieres seguir jugando?  (S o N)");
            repite = sc.next();
            if (repite.equals("S") || repite.equals("s"))
                random = (int)(Math.random()*99+1);
            else{
               System.out.println("Vuelve pronto!");
               x = -1;
            }           
        }
        }while (x > 0);        
}
    public static void p12 () {
        //Numeros primos entre 1 y 1000.
            int cont = 0;
        for (int num = 1; num <= 1000; num++) {
            boolean esPrimo = true;
            for (int div = 2; div < num; div ++) {
                if (num % div == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo == true) {
                  cont ++;
                System.out.print(num + "." );
            }
        }
        System.out.println("\nEn total son: " + cont + " numeros primos.");
}
    public static void p13 () {
        //Maximo numero introducido.
        Scanner sc = new Scanner(System.in);
        int num, max = 0;
        System.out.print("Introduce un numero.(Para acabar introduce un numero negativo)");
        num = sc.nextInt();
        while (num > 0){
            if (num > max){
                max = num;
            }
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
        }
        System.out.print("El numero mas grande que has introducido es: " + max);
}
    public static void p14 () {
        //Multiplos de 5.
        Scanner sc = new Scanner (System.in);
        int i, m;
        System.out.print("Introduce el numero limite: ");
        m = sc.nextInt();
        i = 1;
        while (i < m){
            if (i % 5 == 0)
                System.out.println(i + ".");
        i++;
        }
}
}
