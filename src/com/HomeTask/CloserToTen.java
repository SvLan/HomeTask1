package com.HomeTask;

import java.util.Scanner;

/**
 * Created by Администратор on 14.06.2016.
 */
public class CloserToTen {
    public static void main(String[] args) {
        float a = 10;
        float n;
        System.out.println("Введите первое число");
        Scanner num1 = new Scanner(System.in);
        n = num1.nextFloat();
        float m;
        System.out.println("Введите второе число");
        Scanner num2 = new Scanner(System.in);
        m = num2.nextFloat();
        if (Math.abs (n-a) < Math.abs(m-a)) {
            System.out.println("К заданному числу " + a + " приближенным является число " + n);
        }
           else if (Math.abs(n-a) > Math.abs (m-a)){
               System.out.println("К заданному числу " + a + " приближенным является число " + m);
           }

        else {
            System.out.println("Числа равноудаленные от числа " + a);
        }
    }
}
