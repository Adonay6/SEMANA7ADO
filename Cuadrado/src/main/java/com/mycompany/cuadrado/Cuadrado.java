/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuadrado;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Cuadrado {
    private double lado;
    private double perimetro;
    private double area;

    // Constructor vacío
    public Cuadrado() {
        this.lado = 0;
        calcularPerimetro();
        calcularArea();
    }

    // Constructor que recibe un lado como parámetro
    public Cuadrado(double lado) {
        this.lado = lado;
        calcularPerimetro();
        calcularArea();
    }

    // Constructor que recibe dos lados como parámetros
    public Cuadrado(double lado1, double lado2) {
        this.lado = (lado1 + lado2) / 2; // Consideramos el promedio para representar un cuadrado
        calcularPerimetro();
        calcularArea();
    }

    private void calcularPerimetro() {
        this.perimetro = 4 * this.lado;
    }

    private void calcularArea() {
        this.area = this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del cuadrado:");
        double lado = scanner.nextDouble();

        Cuadrado cuadrado1 = new Cuadrado(lado);
        System.out.println("Cuadrado con un lado ingresado:");
        System.out.println("Lado: " + cuadrado1.getLado());
        System.out.println("Perímetro: " + cuadrado1.getPerimetro());
        System.out.println("Área: " + cuadrado1.getArea());

        System.out.println("\nIngrese los valores de los dos lados del cuadrado:");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();

        Cuadrado cuadrado2 = new Cuadrado(lado1, lado2);
        System.out.println("\nCuadrado con dos lados ingresados:");
        System.out.println("Lado: " + cuadrado2.getLado());
        System.out.println("Perímetro: " + cuadrado2.getPerimetro());
        System.out.println("Área: " + cuadrado2.getArea());

        scanner.close();
    }
}
