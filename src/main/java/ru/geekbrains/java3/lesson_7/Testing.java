package ru.geekbrains.java3.lesson_7;

public class Testing {
    public static void method1() {
        System.out.println("Тест с приоритетом 1");
    }

    @BeforeSuite
    public static void start() {
        System.out.println("Тест Before ");
    }
    @Test(priority = 4)
    public static void method2() {
        System.out.println("Тест с приоритетом 4");
    }
    @Test(priority = 3)
    public static void method3() {
        System.out.println("Тест с приоритетом 3");
    }
    @Test(priority = 2)
    public static void method4() {
        System.out.println("Тест с приоритетом 2");
    }
    @AfterSuite
    public static void shutdown(){
        System.out.println("Тест shutdown");
    }
    @Test(priority = 10)
    public static void method5() {
        System.out.println("Тест с приоритетом 10");
    }

}
