package com.company;

public class ifelse
{
    public static void main(String[] args)
    {
        byte n = 0;
        byte c = 7;
        if(n < c)                               //if statement is true do it                          
        {
            System.out.println("n<c");
            ++n;
        }
        else if(n>c)                            //if statrment is not true check this if this statement is true do it
        {
             System.out.println("n>c");
             --n;
        }
    }

}
