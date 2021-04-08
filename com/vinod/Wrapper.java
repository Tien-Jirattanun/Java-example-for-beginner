package com.vinod;
/*
Author: Vinod Kotiya
vinodkotiya.blogspot.com
 */
public class Wrapper {

    public static void mainf(){
        // wrapper class =  provides a way to use primitive data types as reference data types
        //     reference data types contain useful methods
        //     can be used with collections (ex.ArrayList)

        //primitive  //wrapper
        //---------  //-------
        // boolean  Boolean
        // char   Character
        // int   Integer
        // double  Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
        int i = 10;
        Integer d = new Integer(i);  //autoboxing
        System.out.println(d.longValue());  //unboxing

        //autoboxing
        Boolean a = true;
        Character b ='#';
        Integer c = 123;
        Double f = 3.14;
        String name = "Vinod";

        //unboxing
        if (a.booleanValue()==true)
        {
            System.out.println("This is true");
        }
    }
}
