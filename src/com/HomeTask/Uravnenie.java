package com.HomeTask;

import java.util.Scanner;

/**
 * Created by d on 15.06.2016.
 */
public class Uravnenie {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float d;
        Scanner scr = new Scanner(System.in);
        a = scr.nextFloat();
        b = scr.nextFloat();
        c = scr.nextFloat();
        d = b * b - 4 * a * c;

        if (d > 0) {
            float e;
            e = (- b + (float) Math.sqrt(d))/(2*a);
            float f;
            f = (- b - (float) Math.sqrt(d))/(2*a);
            System.out.println("Решение имеет два корня = " + e + f);
        }
        else {
            if (d == 0){
                float n;
                n = -1* (b/(2*a));
                System.out.println("Решение имеет один корень = " + n);
            }
            else {
                System.out.println("Корней нет");
            }

        }
    }
}
