package com.vinod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
Author: Vinod Kotiya
vinodkotiya.blogspot.com
 */
public class ArraysList {
    public static void mainf() {

        //regular array
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "banana";
        fruits[1] = "Mango";
        System.out.println(fruits[1]);

        //arraylist: Easy working
        ArrayList<String> fruitList = new ArrayList();
        fruitList.add("Apple");
        fruitList.add("banana");
        fruitList.add("Mango");
        System.out.println(fruitList);
        fruitList.remove("banana");
        System.out.println(fruitList);

        System.out.println("Normal For");
        for (int i=0; i< fruitList.size();i++){
            System.out.println(fruitList.get(i));
        }

        System.out.println("Advanced For");
        for (String f : fruitList) {
            System.out.println(f);
        }

        System.out.println("Iterator (hasnext,next,remove)");
        Iterator<String> i = fruitList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("ListIterator (hasnext,next,remove, hasprev, prev, add)");
        ListIterator<String> l = fruitList.listIterator();
        while(l.hasNext()){
            System.out.println(l.next());
        }

        System.out.println("Java 8 Stream");
        fruitList.forEach((fruit) -> {
            System.out.println(fruit);
        });
    }
}