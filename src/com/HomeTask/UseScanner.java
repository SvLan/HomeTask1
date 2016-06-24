package com.HomeTask;

import java.util.Scanner;

/**
 * Created by Администратор on 12.06.2016.
 */
public class UseScanner {
    public static void main(String[] args) {
            Scanner ChetNechet = new Scanner(System.in);
            int i = ChetNechet.nextInt();
        System.out.print("Введите целое число: ");
        if(i%2 == 0) {
            System.out.println("Число: " + i + " - четное ");
        } else {
            System.out.println("Число: " + i + " - нечетное ");
            }
        }
}
