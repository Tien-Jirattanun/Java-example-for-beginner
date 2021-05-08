package com.vinod;

import java.util.LinkedList;
import java.util.Queue;
/*
Author: Vinod Kotiya
vinodkotiya.blogspot.com
 */
public class Que {
    public static void mainf(){
        Queue<String> kids = new LinkedList<String>();
        kids.add("Ram");
        kids.add("Mohan");
        kids.add("Shyam");

        kids.poll();  //it will remove the head ram
        System.out.println(kids);
        //remove next but know what is removed
        System.out.println(kids.poll());
    }
}
