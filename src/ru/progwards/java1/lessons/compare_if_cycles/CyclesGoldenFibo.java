package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static int fiboNumber(int n) {
        int n0 = 1;
        int n1 = 1;
        int n2 = 1;


        for (int i = 3; i <= n; i++) {
            n2 = n0 + n1;

            n0 = n1;
            n1 = n2;

    }
        System.out.println(n2);
        return n2;
    }
    public static boolean containsDigit(int number, int digit) {

        boolean result = number==0 && digit ==0;
        return result;
    }

        public static boolean isGoldenTriangle ( int a, int b, int c){

double adouble = a;
double bdouble = b;
double cdouble = c;
        boolean result = a == b &&  adouble/c >= 1.61703 && adouble/c <= 1.61903
                     || a == c && adouble / b >= 1.61703 && adouble / b <= 1.61903 ||
                    b == c && bdouble / a >= 1.61703 &&  bdouble / a <= 1.61903 ;

            return result;
        }


    public static void main(String[] args) {
        fiboNumber(8);


        int n0 = 1;
        int n1 = 1;
        int n2;


        for (int i = 3; i <= 15; i++) {
            n2 = n0 + n1;

            n0 = n1;
            n1 = n2;
            System.out.println(n2);
        }
        System.out.println(isGoldenTriangle(34,55,55));
        System.out.println( containsDigit(3,2));
    }
}