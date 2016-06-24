package com.HomeTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number 1: ");
        NotInitialisate NotInitialisate = new NotInitialisate();
        System.out.println("int: " + NotInitialisate.geta());
        System.out.println("char: " + NotInitialisate.getb());
        System.out.println("/////////////////////////////");// Создаем не инициализорованные int и char

        System.out.println("Number 2: ");
        Dog Dog1 = new Dog("spot","Ruff!");
        Dog Dog2 = new Dog("scruffy", "Wurf!");
System.out.println("Dog1: " + Dog1.getName() + " says: " + Dog1.getSays());
        System.out.println("Dog2: " + Dog2.getName() + " says: " + Dog2.getSays());
        System.out.println("////////////////////////////////");//Создаем и два поля а потом в мейн создаются два дубликата класса, которым задаем имя

        System.out.println("Number 3: Смотри класс UseScanner,java ");
        System.out.println("////////////////////////////////");//


    }
}
