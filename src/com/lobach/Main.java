package com.lobach;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        MyLinkedList<Person> linkedList = new MyLinkedList<>();
//
//        Person person = new Person("Andrew", 30, 2210);
//        Person person1 = new Person("Andrew", 31, 2210);
//        Person person2 = new Person("Andrew", 32, 2210);
//        Person person3 = new Person("Andrew", 33, 2210);
//        Person person4 = new Person("Andrew", 34, 2210);
//        Person person5 = new Person("Andrew", 35, 2210);
//        Person person6 = new Person("Andrew", 36, 2210);
//        Person person7 = new Person("Andrew", 37, 2210);
//        Person person8 = new Person("Andrew", 38, 2210);
//        Person person9 = new Person("Andrew", 39, 2210);
//        Person person10 = new Person("Andrew", 40, 2210);
//        Person person11 = new Person("Andrew", 41, 2210);
//        Person person12 = new Person("Andrew", 42, 2210);
//        Person person13 = new Person("Andrew", 43, 2210);
//        linkedList.add(person12);
//        linkedList.add(person11);
//        linkedList.add(person10);
//        linkedList.add(person9);
//        linkedList.add(person8);
//        linkedList.add(person7);
//        linkedList.add(person6);
//        linkedList.add(person5);
//        linkedList.add(person4);
//        linkedList.add(person3);
//        linkedList.add(person2);
//        linkedList.add(person1);
//
//
//        System.out.println(linkedList.toString());
//        System.out.println(" ");
//        System.out.println(linkedList.indexOf(person10));
//
//        linkedList.remove(3);
//        System.out.println(linkedList.toString());
//
//
//        Iterator<Person> it = linkedList.iterator();
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//
//        System.out.println("---------------------------------");
//        System.out.println("---------------------------------");
//        System.out.println("---------------------------------");
//
//        Person[] arr = new Person[11];
//        linkedList.toArray(arr);
//        for (Person i :
//                arr) {
//            System.out.println(i);
//
//        }
 Comparison comparison = new Comparison();
        comparison.A();
        comparison.A1();
        comparison.A2();
        comparison.A3();
        comparison.B();
        comparison.B1();
        comparison.B2();
        comparison.C();
        comparison.C1();
        comparison.C2();
        comparison.C3();

        System.out.println(" вывод: используем для хранения небольших коллекций(<1000) ArrayList, \n" +
                "на больших коллекциях LinkedList лучше во всем, кроме времени доступа, \n" +
                "поскольку ему нужно пробегать по элементам от начала до искомого. \n");

        System.out.println(" вывод 2 : HashSet показала себя лучше на небольших массивах(<20000 элементов),\n" +
                " на больших (150000 элементов) лучший результат у LinkedHashSet");

        System.out.println(" вывод 3 : у  LinkedHashMap хорошее время доступа к элементам, и хорошее время репозиции ,\n" +
                " относительно других коллекций");
    }
}






