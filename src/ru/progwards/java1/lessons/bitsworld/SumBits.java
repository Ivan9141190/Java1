package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
String t;
    public static int sumBits(byte value) {

        int a, b, c, d, e, f, g, h, result;

        a = 0b1 & value;
        b = value >> 1 & 0b1;
        c = value >> 2 & 0b1;
        d = value >> 3 & 0b1;
        e = value >> 4 & 0b1;
        f = value >> 5 & 0b1;
        g = value >> 6 & 0b1;
        h = value >> 7 & 0b1;
        result = a + b + c + d + e + f + g + h;

        return result;
    }


    public static void main(String[] args) {
        Binary binary = new Binary((byte)8);
        System.out.println(binary);
//        System.out.println(new Binary((byte) -81).toString());
//        System.out.println(new Binary((byte) 1).toString());
//        System.out.println(new Binary((byte) 127).toString());
//        System.out.println(new Binary((byte) -40).toString());
//        System.out.println(new Binary((byte) -1).toString());

        System.out.println(sumBits((byte) -222));
        System.out.println(Integer.toBinaryString(sumBits((byte) 222)));
        System.out.println(Integer.toBinaryString(CheckBit.checkBit((byte) 1,4)));
        System.out.println(CheckBit.checkBit((byte) 10,4));
    }


    }


