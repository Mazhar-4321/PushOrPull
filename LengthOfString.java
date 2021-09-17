package com;

import java.util.Scanner;

public class LengthOfString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        s=s+"\0";
        int l=0;
        System.out.println(s.charAt(0));
        while(s.charAt(l)!='\0')
        {
            l++;
        }
        System.out.println(l);
        int length=0;
        try
        {
            while(true)
            {
                s.charAt(length++);
            }
        }
        catch(StringIndexOutOfBoundsException e)
        {
            length=length-1;
        }
        System.out.println(length);
    }
}
