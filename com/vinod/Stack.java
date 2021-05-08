package com.vinod;
/*
Author: Vinod Kotiya
vinodkotiya.blogspot.com
 */
public class Stack {
    int stack[] = new int[5];
    int top = 0;

    public void push(int data){
        stack[top] = data;
        top++;
    }
    public void pop(){
        top--;
        System.out.println(stack[top]);
        stack[top] = 0;
    }
    public void peep(int i){
        System.out.println(stack[i]);
    }
    public void show()
    {
        for (int n:stack)
        {
            System.out.println(n + "");
        }
    }

    public static void mainf(){
        Stack s = new Stack();
        s.push(5);
        s.push(3);
        s.push(8);
        s.show();
s.pop();
s.show();
s.push(4);
s.peep(1);
s.show();
    }
}
