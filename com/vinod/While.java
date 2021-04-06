package com.vinod;

public class While
{
    public static void main(String[] args)
    {
       int i = 0;
       while (i<5)                                      //while the statement is true do it
       {
           System.out.print(i);
           System.out.print(" ");
           i++;
       }
       System.out.println();
       System.out.println("----------------------------------");
       i = 0;
       do                                               //do first and check statement
       {
           System.out.print(i);
           System.out.print(" ");
           i++;
       } while(i<5);
    }
}
