package ru.progwards.java1.lessons.compare_if_cycles;



public class TriangleInfo {

    public static boolean isTriangle(int a, int b, int c) {
        boolean result = a < b + c && b < a + c && c < a + b;
        return result;

    }
    public static boolean isRightTriangle(int a, int b, int c){
        boolean result =  a==b ||  c==b  || a==c   ;

        return result;

    }
    public static void main(String[] args) {
        System.out.println(isTriangle(3, 3, 9));
        System.out.println(isRightTriangle(9,3,8));
    }
}
