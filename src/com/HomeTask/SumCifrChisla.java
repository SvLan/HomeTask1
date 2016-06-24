package com.HomeTask;

import java.util.Scanner;

/**
 * Created by Администратор on 12.06.2016.
 */
public class SumCifrChisla {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Введите число от 0 до 99 = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n >= 10 & n <= 99) {
            sum = sum + (n % 10) + ((n/10)%10);
            System.out.println("Сумма цифр в цисле = " + sum);
        }
        else {
            System.out.println("Введите число от 0 до 99!!! Ваше число не соотвествует указанному критерию");
            return;
        }
    }

}
