package com.company;

public class operator
{
    public static void main(String[] args)
    {
        byte x = 25;
        byte y = 5;
        int op1 = x + y;                        //x+y
        int op2 = x - y;                        //x-y
        int op3 = 2 * 5;                        //2x5
        int op4 = 25 / 5;                       //25  / 5
        int op5 = 25 % 5;                       //25 / 5    Returns the division remainder
        byte op6 = ++x;                         //x+1
        byte op7 = --y;                         //y-1
        System.out.println("op1 : " + op1);
        System.out.println("op2 : " + op2);
        System.out.println("op3 : " + op3);
        System.out.println("op4 : " + op4);
        System.out.println("op5 : " + op5);
        System.out.println("op6 : " + op6);
        System.out.println("op7 : " + op7);

    }
}
