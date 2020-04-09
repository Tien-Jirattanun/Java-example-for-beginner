package com.company;

public class ifelse
{
    public static void main(String[] args)
    {
        byte n = 0;
        byte c = 7;
        while(1==1)
        {
            if(n < c)
            {
                System.out.println("n<c");
                ++n;
            }
            else if(n>c)
            {
                System.out.println(n>c);
                --n;
            }
            else {
                //pass
            }
        }
    }

}
