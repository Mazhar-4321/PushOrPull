package com.geekster.practice.day1;

import java.util.Scanner;

public class TypeCast
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte byte_input = Byte.parseByte(sc.next());
        short short_input = Short.parseShort(sc.next());
        int integer_input = Integer.parseInt(sc.next());
        long long_input = Long.parseLong(sc.next());
        float float_input = Float.parseFloat(sc.next());
        double double_input = Double.parseDouble(sc.next());
        char character_input = (sc.next()).charAt(0);
        boolean boolean_input= Boolean.parseBoolean(sc.next());

    }
}
