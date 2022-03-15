package com.specialtask;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /* 1. В классе Cat создай статическую переменную public int catCount.
    Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1.
    Создать 10 объектов Cat и вывести значение переменной catCount на экран. */

    static class Cat12 {
        static protected int catCount = 0;
        String name;
        public static ArrayList<Cat12> cats = new ArrayList<>(); // Часть задания №2

        public Cat12 (String name) {
            this.name = name;
            catCount++;
            System.out.println("У нас новый пушистый друг! Привет, " + name + "!");
            System.out.println("Котиков теперь: " + catCount);
        }

        /* 2. Статические коты:
        1) В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
        2) Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
        3) Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.

        Подсказка: Чтобы создать переменную cats, используйте конструкцию:
        public static ArrayList<Cat> cats = new ArrayList<Cat>(); */

        public static void printCats() {
            for (Cat12 cat: cats) {
                System.out.println("Вся информация о нашем котике хранится здесь: " + cat);
            }
            System.out.println();
        }
    }

    /* 3. Переставь один модификатор static, чтобы пример скомпилировался. */
    /* 4. Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась */

    static /* Вот он, пожалуйста */ class Solution34 {
        public int a = 5;
        public int b = 2;
        public int c = a * b;

        static public void printIdea(Idea idea) { // Часть задания 5
            System.out.println(idea.getDescription());
        }

        /* 5. Есть новые идеи? Подумаем...
        1) В классе Solution создать public статический класс Idea
        2) В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст
        3) В классе Solution создайте статический метод public void printIdea(Idea idea),
        который будет выводить на экран описание идеи - это то, что возвращает метод getDescription */

        public static class Idea {
            static String s = null;

            public String getDescription() {
                if (s != null)
                    return s;
                else return null;
            }
        }
    }

    /* 6. Создай класс с именем KissMyShinyMetalAss.
    Создай объект этого класса, выведи его на экран. */

    static class KissMyShinyMetalAss {
        static String greeting = "Kiss my shiny metal ass!";

        public KissMyShinyMetalAss () {
            System.out.println(greeting);
        }
    }

    /* 7. Создай 3 public статических переменных:
    String Solution.name, String Cat.name, String Dog.name */

    class Solution {
        public static String name;
    }

    class Cat {
        public static String name;
    }

    class Dog {
        public static String name;
    }

    // Задачи повышенной сложности:

    /* 1. Нужно исправить программу, чтобы компилировалась и работала.
    Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25». */

    static public class Solutions {
        Scanner scan = new Scanner(System.in);
        static public int a, b;
        static String s;
        public Solutions() {
            System.out.println("Давай найдем большее из двух чисел - a и b?");
            System.out.print("Введи число a - ");
            a = scan.nextInt();
            System.out.print("Введи число b - ");
            b = scan.nextInt();
            if (a > b) {
                s = "a";
                System.out.println("Наибольшее число: " + s + " - " + a);
            }
            else {
                s = "b";
                System.out.println("Наибольшее число: " + s + " - " + b);
            }
        }
    }

    /* 2. Нужно добавить в программу новую функциональность.
    Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
    Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран. */

    // Задача:
    static class Kitty_Old {
        String name;
        Kitty_Old mommy;

        public Kitty_Old(String name) {
            this.name = name;
            System.out.println("У нас новая кошка! Поприветствуем - это " + name + "!");
        }

        public void whosKittysMommy (Kitty_Old mommy) {
            this.mommy = mommy;
            System.out.println(this.name + ", мы нашли твою маму! Это - " + mommy.name + "!");
        }
    }

    /* Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Создать класс, который бы помог описать данную ситуацию.
    Создать 6 объектов: маму, папу, сына, дочь, бабушку (мамина мама) и дедушку (папин папа).
    Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь. */

    // Новая задача:

    static class Kitty_New {
        String name;
        boolean gender;
        Kitty_New mommy = null;
        Kitty_New daddy = null;
        Kitty_New son = null;
        Kitty_New daughter = null;
        Kitty_New granny = null;
        Kitty_New granddad = null;

        public Kitty_New (String name, boolean isItsGenderMale) {
            this.name = name;
            this.gender = isItsGenderMale;
            System.out.println("У нас новый котейка! Поприветствуем - это " + name + "!");
        }

        public void whosKittysMommy (Kitty_New whoIsChild, Kitty_New whoIsMommy) {
            this.mommy = whoIsMommy;
            if (whoIsChild.gender == true) {
                whoIsMommy.son = whoIsChild;
            } else {
                whoIsMommy.daughter = whoIsChild;
            }
            System.out.println(this.name + ", мы нашли твою маму! Это - " + mommy.name + "!");
        }

        public void whosKittysDaddy (Kitty_New whoIsChild, Kitty_New whoIsDaddy) {
            this.daddy = whoIsDaddy;
            if (whoIsChild.gender == true) {
                whoIsDaddy.son = whoIsChild;
            } else {
                whoIsDaddy.daughter = whoIsChild;
            }
            System.out.println(this.name + ", мы нашли твоего папу! Это - " + daddy.name + "!");
        }

        public void whosKittysGranny (Kitty_New whoIsMommy, Kitty_New whoIsGranny) {
            whoIsMommy.mommy = whoIsGranny;
            this.granny = whoIsGranny;
            System.out.println(this.name + ", мы нашли твою бабушку! Это - " + granny.name + "! Следовательно, твоя мама - " + mommy.name + "!");
        }

        public void whosKittysGranddad (Kitty_New whoIsDaddy, Kitty_New whoIsGranddad) {
            whoIsDaddy.daddy = whoIsGranddad;
            this.granddad = whoIsGranddad;
            System.out.println(this.name + ", мы нашли твоего дедушку! Это - " + granddad.name + "! Следовательно, твой папа - " + daddy.name + "!");
        }

        public void happyKittyFamily () {
            System.out.println("Твоя семья от прошлого поколения:");

            System.out.print("Твой дедушка: " + this.granddad.name + ", ");
            if (this.granddad.mommy == null) {
                System.out.print("матери нет, ");
            } else {
                System.out.print("его мама: " + this.granddad.mommy.name + ", ");
            }
            if (this.granddad.daddy == null) {
                System.out.print("отца нет;\n");
            } else {
                System.out.print("его отец: " + this.granddad.daddy.name + ";\n");
            }

            System.out.print("Твоя бабушка: " + this.granny.name + ", ");
            if (this.granny.mommy == null) {
                System.out.print("матери нет, ");
            } else {
                System.out.print("её мама: " + this.granny.mommy.name + ", ");
            }
            if (this.granny.daddy == null) {
                System.out.print("отца нет;\n");
            } else {
                System.out.print("её папа: " + this.granny.daddy.name + ";\n");
            }

            System.out.print("Твой папа: " + this.daddy.name + ", ");
            if (this.daddy.mommy == null) {
                System.out.print("матери нет, ");
            } else {
                System.out.print("его мама: " + this.daddy.mommy.name + ", ");
            }
            if (this.daddy.daddy == null) {
                System.out.print("отца нет;\n");
            } else {
                System.out.print("его папа: " + this.daddy.daddy.name + ";\n");
            }

            System.out.print("Твоя мама: " + this.mommy.name + ", ");
            if (this.mommy.mommy == null) {
                System.out.print("матери нет, ");
            } else {
                System.out.print("её мама: " + this.mommy.mommy.name + ", ");
            }
            if (this.mommy.daddy == null) {
                System.out.print("отца нет;\n");
            } else {
                System.out.print("её папа: " + this.mommy.daddy.name + ";\n");
            }

            System.out.print("Твой брат: " + mommy.son.name + ", ");
            if (this.mommy == null) {
                System.out.print("матери нет, ");
            } else {
                System.out.print("его мама: " + mommy.name + ", ");
            }
            if (this.daddy == null) {
                System.out.print("отца нет;\n");
            } else {
                System.out.print("его папа: " + daddy.name + ";\n");
            }

            System.out.print("Ты: " + name + ", ");
            if (this.mommy == null) {
                System.out.print("матери нет, ");
            } else {
                System.out.print("твоя мама: " + mommy.name + ", ");
            }
            if (this.daddy == null) {
                System.out.print("отца нет.\n");
            } else {
                System.out.print("твой отец: " + daddy.name + ".\n");
            }
        }
    }

    /* 3. Задача: Программа вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке. */

    static class Algoritm {
        int[] array = new int[5];
        static Scanner scan = new Scanner(System.in);

        public Algoritm() {
            System.out.println("Введи ниже пять чисел - я выведу их по возрастанию!");
            for (int i = 0; i < 5; i++) {
                System.out.print("Введи число №" + (i + 1) + " - ");
                array[i] = scan.nextInt();
            }

            System.out.println();
            for (int i = 1; i < 5; i++) {
                for (int j = 1; j < 5; j++) {
                    if (array[j-1] > array[j]) {
                        int swap = array[j-1];
                        array[j-1] = array[j];
                        array[j] = swap;
                    }
                }
            }

            System.out.println("Наблюдай: ");
            for (int i = 0; i < 5; i++) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();

	    // Вывод задания №1
        for (int i = 0; i < 10; i++) {
            Cat12 cat = new Cat12("Пушок");
            Cat12.cats.add(i, cat); // Часть задания 2
        }
        System.out.println();

        // Вывод задания №2
        Cat12.printCats();

        // Вывод задания №3 и №4
        System.out.println("Меня просили переставить static так, чтобы при этом все выводилось нормально.\nСейчас попробую:");
        Solution34 sl = new Solution34();
        System.out.println("Я сделал новый класс, добавил static в его определение и создал его объект.");
        System.out.println("Его переменная a: " + sl.a + "\nЕго переменная b: " + sl.b);
        System.out.println("Его переменная c (a * b): " + sl.c);
        sl.a = 15;
        sl.b = 20;
        sl.c = sl.a * sl.b;
        System.out.println("Новое значение a: " + sl.a + "\nНовое значение b: " + sl.b);
        System.out.println("Новое значение c (a * b): " + sl.c);
        System.out.println("Видите? Все и правда работает! :)");
        System.out.println("Ну и как оказалось я использовал минимальное кол-во static,\nпри этом давая программе компилироваться без проблем! :)");
        System.out.println();

        // Вывод задания №6
        KissMyShinyMetalAss kmsma = new KissMyShinyMetalAss();
        System.out.println();

        // Вывод задания №1 повышенной сложности
        Solutions solutions = new Solutions();
        System.out.println();

        // Вывод задания №2 повышенной сложности
        Kitty_Old cat1 = new Kitty_Old("Маша");
        Kitty_Old cat2 = new Kitty_Old("Даша");
        cat2.whosKittysMommy(cat1);
        System.out.println();

        System.out.println("Теперь то же самое, но уже поновее (и куда сложнее): ");

        Kitty_New kittyDaddy = new Kitty_New("папа Котофей", true); // Папа
        Kitty_New kittyMommy = new Kitty_New("мама Василиса", false); // Мама
        Kitty_New kittySon = new Kitty_New("сын Мурчик", true); // Сын
        Kitty_New kittyDaughter = new Kitty_New("дочь Пушинка", false); // Дочь
        Kitty_New kittyGrandad = new Kitty_New("дедушка Вася", true); // Дедушка
        Kitty_New kittyGranny = new Kitty_New("бабушка Мурка", false); // Бабушка
        System.out.println();

        kittySon.whosKittysMommy(kittySon, kittyMommy);
        kittyDaughter.whosKittysMommy(kittyDaughter, kittyMommy);
        kittySon.whosKittysDaddy(kittySon, kittyDaddy);
        kittyDaughter.whosKittysDaddy(kittyDaughter, kittyDaddy);
        System.out.println();

        kittySon.whosKittysGranny(kittyMommy, kittyGranny);
        kittySon.whosKittysGranddad(kittyDaddy, kittyGrandad);
        kittyDaughter.whosKittysGranny(kittyMommy, kittyGranny);
        kittyDaughter.whosKittysGranddad(kittyDaddy, kittyGrandad);
        System.out.println();

        kittyDaughter.happyKittyFamily(); // По какой-то причине, ссылка на девочку сломана, а на мальчика выдает девочку - надо доделать
        System.out.println();

        // Вывод задания №3 повышенной сложности

        Algoritm algoritm = new Algoritm();
    }
}