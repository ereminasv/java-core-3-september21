package ru.geekbrains.java3.lesson_7;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try{
            ReflectionTester.start(Testing.class);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
