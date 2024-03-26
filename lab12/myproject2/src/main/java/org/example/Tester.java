package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "A1", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "A1", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Опыт в годах: " + experienceInYears);
        System.out.println("Уровень английского языка: " + englishLevel);
        System.out.println("Зарплата: " + salary);
    }
    public void method(int a){
        System.out.println(a);
    }
    public void method(int a, int b){
        System.out.println(a + " " + b);
    }
    public void method(int a, int b, int c){
        System.out.println(a + " " + b + " " + c);
    }

    public static void staticMethod() {
        System.out.println("Статический метод");
    }
}
