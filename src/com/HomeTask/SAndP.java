package com.HomeTask;

import java.util.Scanner;

/**
 * Created by Администратор on 14.06.2016.
 */
public class SAndP {
    public static void main(String[] args) {
        double a;
        System.out.println("Введите длину одного катета ");
        Scanner kat = new Scanner(System.in);
        a = kat.nextDouble();
        System.out.println("Введите длину второго катета ");
        double b;
        Scanner kat2 = new Scanner(System.in);
        b = kat2.nextDouble();
       if (a > 0.0 & b > 0.0) {
           double n = Math.sqrt(a * a + b *b);
           double c = a + b + n;
           double d = a*b/2;
           System.out.println("Периметр равер = " + c);
           System.out.println("Площадь равна = " + d);
        }
        else {
            System.out.println("Неверно указаны значения");
        }

    }
}
