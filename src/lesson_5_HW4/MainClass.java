package lesson_5_HW4;

import java.util.ArrayList;

//*
// 1.
// Написати метод пошуку максимального значення в листі. Лист Integer.
// Метод повинен знайти значення, вивести його в консоль і повернути в основну програму.
// 2.
// Написати метод reverse для листа.
// Метод повинен виводити в консоль лист і повертати його в основну програму. Наприклад 1,4,3,6 повинен повернути 6,3,4,1
public class MainClass {
    public static void main(String[] args) {
        Worker worker = new Worker();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(3);
        System.out.println(list);
        worker.findMaxValue(list);
        worker.reverseOfList(list);
    }
}
