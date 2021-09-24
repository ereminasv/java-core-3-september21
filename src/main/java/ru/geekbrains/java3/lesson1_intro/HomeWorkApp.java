package ru.geekbrains.java3.lesson1_intro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class HomeWorkApp {
    public static void main(String[] args) {

        UniversalArray arr1 = new UniversalArray(1, 2, 3, 4, 5);
        System.out.println(Arrays.toString(arr1.getElem()));

        arr1.changeArr(1, 2);
        System.out.println(Arrays.toString(arr1.getElem()));

        arr1.transformationArr();

        Box<Apple> boxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();
        Box<Apple> boxAppleEmpty = new Box<>();
        Box<Orange> boxOrangeEmpty = new Box<>();
        Apple[] arrApple = new Apple[8];
        Orange[] arrOrange = new Orange[5];
        for (int i = 0; i < arrApple.length; i++) {
            arrApple[i] = new Apple();
            boxApple.addFruits(arrApple[i]);
        }
            System.out.println("Вес одного яблока = 1");
            System.out.println("В коробке яблок " + arrApple.length + " шт.");
            System.out.println("Вес коробки яблок = " + boxApple.getWeightBox());

        for (int j = 0; j < arrOrange.length; j++) {
            arrOrange[j] = new Orange();
            boxOrange.addFruits(arrOrange[j]);
        }
            System.out.println("Вес одного апельсина = 1,5");
            System.out.println("В коробке апельсинов " + arrOrange.length + " шт.");
            System.out.println("Вес коробки апельсинов = " + boxOrange.getWeightBox());

        System.out.println("Сравнение коробки яболк и коробки апельсинов " + boxApple.compare(boxOrange));

        boxApple.pourFruit(boxAppleEmpty);
        System.out.println("После пересыпания новая коробка имеет вес = " + boxAppleEmpty.getWeightBox());
    }
}
