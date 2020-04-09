package com.company;

public class For
{
    public static void main(String[] args)
    {
        for(int i = 0;i<9;i++)
        {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("------------------------------------");
        //simple for
        for (int i = 0;i<10;i += 2)
        {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("------------------------------------");
        //advance for
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        //array+for
        }
    }
}
