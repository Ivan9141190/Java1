package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {

    public static int maxSide(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        }
        if (b >= a && b >= c) {
            return b;
        }
        if (c >= a && c >= b) {
            return c;
        }
        return 0;
    }
    public static int minSide(int a, int b, int c){
        if (a <= b && a <= c) {
            return a;
        }
        if (b <= a && b <= c) {
            return b;
        }
        if (c <= a && c <= b) {
            return c;
        }
        return 0;
    }


    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean result = a == b && a == c;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(1,3,3));
        System.out.println(minSide(1,2,1));
        System.out.println(isEquilateralTriangle(2,2,2));
    }

}
