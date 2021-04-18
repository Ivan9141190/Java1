package ru.progwards.java1.lessons.bitsworld;

public class SumBits {

    public static int sumBits(byte value){

        int a,b,c,d,e,f,g,h,result;

        a =0b1&value;
        b = value>>1&0b1;
        c = value>>2&0b1;
        d = value>>3&0b1;
        e = value>>4&0b1;
        f = value>>5&0b1;
        g = value>>6&0b1;
        h = value>>7&0b1;
        result = a+b+c+d+e+f+g+h;

        return result;
    }

    public static int checkBit(byte value, int bitNumber){
int res;
res = value<<bitNumber;


       return res;
    }

    public static void main(String[] args) {

        System.out.println(sumBits((byte) -222));
        System.out.println(Integer.toBinaryString(sumBits((byte) 222)));
        System.out.println(Integer.toBinaryString(checkBit((byte) 1,4)));
        System.out.println(checkBit((byte) 10,4));
    }

        }
