package com.vinod;

import java.util.Iterator;
import java.util.LinkedList;
/*
Author: Vinod Kotiya
vinodkotiya.blogspot.com
 */
public class Linklist {
    public static void mainf(){
        LinkedList linky = new LinkedList();
        linky.add("vinod");
        linky.add("Ramu");
        linky.add("shyamu");

        System.out.println(linky);
        linky.remove();
        System.out.println(linky);
        linky.add("vin");
        System.out.println(linky);
        System.out.println(linky.get(1));

        /// give type of linked list
        LinkedList<String> linkyS = new LinkedList<String>();
        linkyS.add("vinod");
        linkyS.add("Ramu");
        linkyS.add("shyamu");

        System.out.println(linkyS);

        LinkedList<Integer> linkyI = new LinkedList<Integer>();
        linkyI.add(10);
        linkyI.add(14);
        linkyI.add(8);

        System.out.println(linkyI);

        Iterator i = linkyS.iterator();
int j = 1;
        while(i.hasNext()){
            if (i.next().toString() == "shyamu"){
                System.out.println("\nWe found shyamu" ) ;
                break;
            }
            System.out.println("\ni.next " + i.next().toString() + "j " + j);
            j++;
        }

    }
}
