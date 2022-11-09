/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import java.util.Scanner;

/**
 * @author Alexander
 */
public class Tema1 {

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
    public static void p1() {
        //scan int and add 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero:");
        int x = sc.nextInt();
        int y= x+3;
        System.out.print("El resultado es " + y);
        
    }
    public static void p2() {
        //sum scanned ints
        Scanner sc = new Scanner(System.in);
        int x, y, res;
        System.out.print("Introduce el primer numero de la suma:");
        x=sc.nextInt();
        System.out.print("Introduce el segundo numero de la suma:");
        y=sc.nextInt();
        res= x + y;
        System.out.print("El resultado es " + res);
    }
    public static void p3() {
        //operations scanned Double
        Scanner sc = new Scanner(System.in);
        double euro, dolar;
        System.out.print("Introduce la cantidad de Euros: ");
        euro = sc.nextDouble();
        dolar = euro * 1.5;
        System.out.print("Son " + dolar + " dolares.");       
    }
    public static void p4() {
        //Operations with Double and use of String
        Scanner sc = new Scanner(System.in);
        String producto;
        double precio, unidades, total;
        System.out.print("Introduce el producto: ");
        producto = sc.next();
        System.out.print("Introduce el precio del producto: ");
        precio = sc.nextDouble();
        System.out.print("Introduce la cantidad de unidades: ");
        unidades = sc.nextDouble();
        total = precio * unidades;
        System.out.print("La cantidad de " + producto + " ha sido de " + unidades + " unidades, por un total de " + total + " € ");
    }
    public static void p5() {
        //Operations to calculate "salary"
        Scanner sc = new Scanner(System.in);
        double precio_hora, horas_trab, sueldo_bruto, retencion, sueldo_neto, IRPF;
        IRPF = 0.05;
        String trabajador;
        System.out.print("Introduzca el nombre del trabajador: ");
        trabajador = sc.next();
        System.out.print("Introduzca el numero de horas trabajadas: ");
        horas_trab = sc.nextDouble();
        System.out.print("Introduzca el precio por hora: ");
        precio_hora = sc.nextDouble();
        sueldo_bruto= horas_trab * precio_hora;
        retencion = sueldo_bruto * IRPF;
        sueldo_neto = sueldo_bruto-retencion;
        System.out.print("Datos de " + trabajador + ": Bruto: " + sueldo_bruto + " Retencion: " + retencion + " Sueldo_neto: " + sueldo_neto);
        
    }

    

    

    
    
}
