package view;

import java.util.Scanner;

import controller.Paralelogramo;
import controller.Trapezio;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Paralelogramo p = new Paralelogramo();

        System.out.print("Informe o valor da base: ");
        float base = sc.nextFloat();
        p.setBase(base);
        System.out.print("Informe a altura: ");
        float altura = sc.nextFloat();
        p.setAltura(altura);

        System.out.println("Área do Paralalogramo: " + p.calcArea());

        System.out.println("\n*********************************\n");

        Trapezio t = new Trapezio();

        System.out.print("Informe o valor da base maior: ");
        base = sc.nextFloat();
        t.setBase(base);

        System.out.print("Informe o valor da base menor: ");
        float baseMenor = sc.nextFloat();
        t.setBaseMenor(baseMenor);

        System.out.print("Informe a altura: ");
        altura = sc.nextFloat();
        t.setAltura(altura);

        System.out.println("Área do Trapézio: " + t.calcArea());

        sc.close();
    }
}
