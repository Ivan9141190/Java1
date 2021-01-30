package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static int fiboNumber(int n) {
        int n0 = 1;
        int n1 = 1;
        int n2;


        for (int i = 3; i < n; i++) {
            n2 = n0 + n1;

            n0 = n1;
            n1 = n2;

        }

        return n;
    }


    public static void main(String[] args) {
        fiboNumber(4);


        int n0 = 1;
        int n1 = 1;
        int n2;


        for (int i = 3; i <= 15; i++) {
            n2 = n0 + n1;

            n0 = n1;
            n1 = n2;
            System.out.println(n2);
        }

    }
}