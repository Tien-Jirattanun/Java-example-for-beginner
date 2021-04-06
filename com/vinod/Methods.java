package com.vinod;

public class Methods
{
    static void hello()
    {
        System.out.println("hello world");          //basic function
    }

    static void print(String x)                     //can use data from outside function
    {
        System.out.println(x);
    }

    static void plus(int x ,int y)                  //can use data from outside and use more than 1 variable
    {
        int z = x + y;
        System.out.println(z);
    }

    static float curcum(int r)                      //return function
    {
        return (float) (2*3.14*r);
    }

    static void checkage(int age)
    {
        if (age < 18)
        {
            System.out.println("can't pass");
        }
        else if (age > 18)
        {
            System.out.println("pass");
        }
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }



    public static void mainf()
    {
        hello();
        print("How are you");
        plus(5,10);
        System.out.println(plusMethod(6,5));
        System.out.println(plusMethod(6.8,7.6));
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        Methods myObj = new Methods(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
    }

}
