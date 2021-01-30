package ru.progwards.java1.lessons.compare_if_cycles;



public class TriangleInfo {

    public static boolean isTriangle(int a, int b, int c) {
        boolean result = a < b + c && b < a + c && c < a + b;
        return result;

    }

    public static boolean isRightTriangle(int a, int b, int c) {
        boolean result = a * a == b * b + c * c || c * c == b * b + a * a || b * b == c * c + a * a;
        return result;
    }


    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        boolean result = a == b || c == b || a == c;

        return result;
    }

    public static int fiboNumber(int n) {
int n0 = 1 ;
int n1 = 1 ;
int n2;


        for (int i = 3; i < n; i++) {
        n2 = n0 + n1;

            n0 = n1;
            n1 = n2;

        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(3, 3, 9));
        System.out.println(isIsoscelesTriangle(1, 1, 1));
        System.out.println(isIsoscelesTriangle(9, 3, 3));

        fiboNumber(6);

        int n0 = 1 ;
        int n1 = 1 ;
        int n2;


        for (int i = 3; i <= 15; i++) {
            n2 = n0 + n1;

            n0 = n1;
            n1 = n2;
            System.out.println(n2);
        }


    }

    }

