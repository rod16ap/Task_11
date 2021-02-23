package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main ( String[] args ) {
        // Задание №1
        String arr1[] = {"Мыло", "Сахар"};
        Integer arr2[] = {45, 90};

        System.out.println("*************************");
        System.out.println("Задание №1");
        System.out.println("*************************");
        swap(arr1);
        System.out.println("*************************");
        swap(arr2);
        System.out.println("*************************");

        String arr3[] = {"наша", "жизнь", "-", "игра"};
        System.out.println(arr3[0] + " " + arr3[1] + " " + arr3[2] + " " + arr3[3]);

        swapChoice(arr3, 0, 3);
        swapChoice(arr3, 1, 3);
        swapChoice(arr3, 1, 2);
        System.out.println(arr3[0] + " " + arr3[1] + " " + arr3[2] + " " + arr3[3]);
        System.out.println("*************************");

        // Задание №2
        String arr4[] = {"Мыло", "Сахар", "Клубника", "Ведро"};
        Integer arr5[] = {2, 16, 32, 64};

        System.out.println("Задание №2");
        System.out.println("*************************");
        arrayToArrayList ( arr4 );
        System.out.println("*************************");
        arrayToArrayList ( arr5 );
        System.out.println("*************************");

        // Задание №3
        Box<Orange> org = new Box<>();
        Box<Orange> org2 = new Box<>();
        Box<Apple> apl = new Box<>();
        Box<Apple> apl2 = new Box<>();
        org.addFruit(new Orange(), 5);
        org2.addFruit(new Orange(), 4);
        apl.addFruit(new Apple(), 6);
        apl2.addFruit(new Apple(), 8);
        System.out.println("Задание №3");
        System.out.println("*************************");
        System.out.println("Добавляем фрукты");
        System.out.println("В первой коробке с апельсинами стало: " + org.getWeight());
        System.out.println("Во второй коробке с апельсинами стало: " + org2.getWeight());
        System.out.println("В третьей коробке с яблоками стало: " + apl.getWeight());
        System.out.println("В четвертой коробке с яблоками стало: " + apl2.getWeight());
        System.out.println("****************************************************");
        System.out.println("Сравниваем коробки 1 и 3: " + org.compare(apl2));
        System.out.println("Сравниваем коробки 2 и 4: " + org2.compare(apl));

        org.pourItOver(org2);
        apl.pourItOver(apl2);
        System.out.println("****************************************************");
        System.out.println("Перекладываем фрукты из одной коробки в другую");
        System.out.println("В первой коробке с апельсинами стало: " + org.getWeight());
        System.out.println("Во второй коробке с апельсинами стало: " + org2.getWeight());
        System.out.println("В третьей коробке с яблоками стало: " + apl.getWeight());
        System.out.println("В четвертой коробке с яблоками стало: " + apl2.getWeight());
        System.out.println("****************************************************");
    }

    public static void swap ( Object[] arr ) {
        System.out.println("Массив: " + Arrays.toString(arr));
        Object swap = arr[0];
        arr[0] = arr[1];
        arr[1] = swap;
        System.out.println("Результат: " + Arrays.toString(arr));
    }

    public static void swapChoice ( Object[] arr, int sw1, int sw2 ) {
        Object swap = arr[sw1];
        arr[sw1] = arr[sw2];
        arr[sw2] = swap;
    }

    public static <T> void arrayToArrayList (T[] arr) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (T t : arr) {
            arrayList.add(t);
        }
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Список: " + arrayList);
    }


}
