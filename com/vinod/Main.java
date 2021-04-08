package com.vinod;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String hello = "Hello Vinod";
	System.out.println("hello world");
        System.out.println(100);
	System.out.print("hello world "+hello);
        System.out.println("\n1. Array \t 2. Casting \t 3. For \t 4. IfElse \n 5. Math \t 6. Methods \t 7. Operator \t 8. String \n 9. Switch \t 10. Variable \t 11. While \t 12. Wrapper \n 13. Stack \n Enter your choice?");
	// This is how user input needs to be taken
        Scanner menuInput = new Scanner(System.in);
	int selection = menuInput.nextInt();
	// switching
        switch(selection)
        {
            case 1 :
                arrays.mainf();
                break;
            case 2 :
                casting.mainf();
                break;
            case 4:
                ifelse.mainf();
                break;
            case 5 :
                    math.mainf();
                break;
            case 3:
                For.mainf();
                break;
            case 6 :
                Methods.mainf();
                break;
            case 7:
                operator.mainf();
                break;
            case 8:
                string.mainf();
                break;
            case 9:
                Switch.mainf();
                break;
            case 10:
                    variable.mainf();
                break;
            case 11:
                While.mainf();
                break;
            case 12:
                Wrapper.mainf();
                break;
            case 13:
                Stack.mainf();
                break;
            default:
                System.out.println("Invalid option.");

        }

    }
}
