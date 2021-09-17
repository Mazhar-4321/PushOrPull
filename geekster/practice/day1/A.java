package com.geekster.practice.day1;

public class A
{
    public static void main(String[] args)
    {
     // non static method
     B obj = new B();
     obj.sum(4,5);
     // static method
        B.add(4,5);
    }
}
