package com.vinod;

public class arrays
{
    public static void main (string[] args)
    {
        int[] num = {1,2,3,4,5,6,7};
        String[] name = {"Tien","Oam","Tigger","Aum"};
        //this is regular type of array
        num[0] = 9;             //num will change 1 to 9
        int le = num.length;    //le = the size of num
        //basic func
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars)
        {
            System.out.println(i);
        }
        //for
        int magnum[][] = {{1,2,3,4,5},{3,8,5,9,7}};
        //2D array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        //use for with Multidimensional Arrays
    }
}
