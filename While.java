package com.company;

public class While
{
    public static void main(String[] args)
    {
       int i = 0;
       while (i<5)
       {
           System.out.print(i);
           System.out.print(" ");
           i++;
       }
       System.out.println();
       System.out.println("----------------------------------");
       i = 0;
       do
       {
           System.out.print(i);
           System.out.print(" ");
           i++;
       } while(i<5);
    }
}
