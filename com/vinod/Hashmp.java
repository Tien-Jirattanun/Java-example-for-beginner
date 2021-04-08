package com.vinod;

import java.util.HashMap;

public class Hashmp {
    public static void mainf(){
        HashMap<String, Integer> h = new HashMap<String, Integer>();
//key value pair
        h.put("a",10);
        h.put("b",20);
        h.put("c",4);

        System.out.println(h);
        System.out.println(h.get("b"));
        h.remove("c");
        System.out.println(h);
        System.out.println(h.containsValue(4));
        System.out.println(h.replace("b",24));
        System.out.println(h);
        System.out.println(h.keySet());
    }
}
