package com.lobach;

import java.util.*;

public class Comparison {
    ArrayList arr = new ArrayList();
    LinkedList lin = new LinkedList();
    HashMap map = new HashMap();
    HashSet set = new HashSet();
    LinkedHashSet lhs = new LinkedHashSet();
    TreeSet tset = new TreeSet();
    TreeMap tmap = new TreeMap();
    LinkedHashMap lhm = new LinkedHashMap();
    MyLinkedList my = new MyLinkedList();
    Person q = new Person("qwert", 125, 135240);


    public void A() {
        System.out.println("Add 150000 obj");
        System.out.println();
        long time = System.nanoTime();
        for (int i = 0; i < 150000; i++)
            arr.add(q);
        long t = System.nanoTime() - time;
        System.out.println("ArrayList - " + t / 1000);


        long time1 = System.nanoTime();
        for (int i = 0; i < 150000; i++)
            lin.add(q);
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedList - " + t1 / 1000);
        System.out.println();

        System.out.println("Add to center");
        System.out.println();
        long time2 = System.nanoTime();
        for (int i = 7000; i < 10000; i++)
            arr.add(i, new Person("i", i, i));
        long t2 = System.nanoTime() - time2;
        System.out.println("arraylist - " + t2 / 1000);


        long time3 = System.nanoTime();
        for (int i = 7000; i < 10000; i++)
            lin.add(i, new Person("i", i, i));
        long t3 = System.nanoTime() - time3;
        System.out.println("Linkedlist - " + t3 / 1000);
        System.out.println();


    }


    public void A1() {
        System.out.println("Add obj from start to 3000 el");
        System.out.println();

        long time = System.nanoTime();
        for (int i = 0; i < 3000; i++)
            arr.add(i, new Person("i", i, i));

        long t = System.nanoTime() - time;
        System.out.println("ArrayList - " + t / 1000);


        long time1 = System.nanoTime();
        for (int i = 0; i < 3000; i++)
            lin.add(i, new Person("i", i, i));
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedList - " + t1 / 1000);
        System.out.println();
    }


    public void A2() {
        System.out.println("delete obj from start to 1000 el");
        System.out.println();
        long time = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            arr.remove(i);
        long t = System.nanoTime() - time;
        System.out.println("ArrayList - " + t / 1000);


        long time1 = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            lin.remove(i);
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedList - " + t1 / 1000);
        System.out.println();
    }


    public void A3() {
        System.out.println("take el #10000 ");
        System.out.println();
        long time = System.nanoTime();

            arr.get(10000);
        long t = System.nanoTime() - time;
        System.out.println("ArrayList - " + t / 1000);


        long time1 = System.nanoTime();
            lin.get(10000);
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedList - " + t1 / 1000);
        System.out.println();
    }


    public void B() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Add 150000 obj");
        System.out.println();
        long time = System.nanoTime();
        for (int i = 0; i < 150000; i++)
            set.add(i);
        long t = System.nanoTime() - time;
        System.out.println("HashSet - " + t / 1000);


        long time1 = System.nanoTime();
        for (int i = 0; i < 150000; i++)
            lhs.add(i);
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedHashSet - " + t1 / 1000);


        long time2 = System.nanoTime();
        for (int i = 0; i < 150000; i++)
            tset.add(i);
        long t2 = System.nanoTime() - time2;
        System.out.println("TreeSet - " + t2 / 1000);
        System.out.println();

    }

    public void B1() {
        System.out.println("Delete obj from center");
        System.out.println();

        long time = System.nanoTime();
        for (int i = 7000; i < 10000; i++)
        set.remove(i);
        long t = System.nanoTime() - time;
        System.out.println("HashSet - " + t / 1000);


        long time1 = System.nanoTime();
        for (int i = 7000; i < 10000; i++)
        lhs.remove(i);
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedHashSet - " + t1 / 1000);


        long time2 = System.nanoTime();
        for (int i = 7000; i < 10000; i++)
        tset.remove(i);
        long t2 = System.nanoTime() - time2;
        System.out.println("TreeSet - " + t2 / 1000);
        System.out.println();
    }
    public void B2() {
        System.out.println("add obj from center");
        System.out.println();

        long time = System.nanoTime();
        for (int i = 7000; i < 10000; i++)
            set.add(i);
        long t = System.nanoTime() - time;
        System.out.println("HashSet - " + t / 1000);


        long time1 = System.nanoTime();
        for (int i = 7000; i < 10000; i++)
            lhs.add(i);
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedHashSet - " + t1 / 1000);


        long time2 = System.nanoTime();
        for (int i = 7000; i < 10000; i++)
            tset.add(i);
        long t2 = System.nanoTime() - time2;
        System.out.println("TreeSet - " + t2 / 1000);
        System.out.println();
    }


    public void C() {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Add 10000 obj");
        System.out.println();
        long time = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            map.put(i, new Person("i", i, i));
        long t = System.nanoTime() - time;
        System.out.println("HashMap - " + t / 1000);


        long time1 = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            lhm.containsValue(new Person("i", i, i));
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedHashMap - " + t1 / 1000);


        long time2 = System.nanoTime();
        for (int i = 0; i < 10000; i++)
            tmap.containsValue(new Person("i", i, i));
        long t2 = System.nanoTime() - time2;
        System.out.println("TreeMap - " + t2 / 1000);
        System.out.println();
    }

    public void C1() {

        System.out.println("Get obj #7000");
        System.out.println();
        long time = System.nanoTime();
        map.get(7000);
        long t = System.nanoTime() - time;
        System.out.println("HashMap - " + t / 100);


        long time1 = System.nanoTime();
        lhm.get(7000);
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedHashMap - " + t1 / 100);


        long time2 = System.nanoTime();
        tmap.get(7000);
        long t2 = System.nanoTime() - time2;
        System.out.println("TreeMap - " + t2 / 100);
        System.out.println();

    }
    public void C2() {

        System.out.println("Put into 500 obj");
        System.out.println();
        long time = System.nanoTime();
        for (int i = 1000; i < 1500; i++)
            map.put(i, new Person("i", i, i));
        long t = System.nanoTime() - time;
        System.out.println("HashMap - " + t / 1000);


        long time1 = System.nanoTime();
        for (int i = 1000; i < 1500; i++)
            lhm.put(i,new Person("i", i, i));
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedHashMap - " + t1 / 1000);


        long time2 = System.nanoTime();
        for (int i = 1000; i < 1500; i++)
            tmap.put(i,new Person("i", i, i));
        long t2 = System.nanoTime() - time2;
        System.out.println("TreeMap - " + t2 / 1000);
        System.out.println();
    }
    public void C3() {

        System.out.println("replace 500 obj");
        System.out.println();
        long time = System.nanoTime();
        for (int i = 1000; i < 1500; i++)
            map.replace(i, new Person("i", i, i),i-200);
        long t = System.nanoTime() - time;
        System.out.println("HashMap - " + t / 1000);


        long time1 = System.nanoTime();
        for (int i = 1000; i < 1500; i++)
            lhm.replace(i, new Person("i", i, i),i-200);
        long t1 = System.nanoTime() - time1;
        System.out.println("LinkedHashMap - " + t1 / 1000);


        long time2 = System.nanoTime();
        for (int i = 1000; i < 1500; i++)
            tmap.replace(i, new Person("i", i, i),i-200);
        long t2 = System.nanoTime() - time2;
        System.out.println("TreeMap - " + t2 / 1000);
        System.out.println();
    }
    }



