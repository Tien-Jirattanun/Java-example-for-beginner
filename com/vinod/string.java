package com.vinod;

public class string
{
    public static void main(String[] args)
    {
        String h = "the world";
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);       //jhon Dep
        System.out.println(h.length());                       //9
        System.out.println(h.toUpperCase());                  //uppercase
        System.out.println(h.toLowerCase());                  //lower case
        System.out.println(h.indexOf("world"));               //5
        System.out.println(firstName.concat(lastName));       //firstname + lastname
        System.out.println("jirattanun\nleeudomwong");        //new line
        System.out.println("jirattanun\rleeudonwong");        //carriage return
        System.out.println("jirattanun\tleeudonwong");        //horizontal tab
        System.out.println("jirattanun\bleeudomwong");        //backspace
        System.out.println("jirattanun\fleeudomwong");        //form feed

    }
}
