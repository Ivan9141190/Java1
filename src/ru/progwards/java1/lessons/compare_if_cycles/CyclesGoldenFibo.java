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

        boolean result = number>=100 && digit ==1.61703;
        return result;
    }

        public static boolean isGoldenTriangle ( int a, int b, int c){
            boolean result = a == b && (a / c >= 1.61703) && (a / c <= 1.61903)
                    && (b / c >= 1.61703) && (b / c <= 1.61903) || a == c && (a / b >= 1.61703) &&
                    (a / b <= 1.61903) && (c / b >= 1.61703) && (c / b <= 1.61903) ||
                    a == c && (a / b >= 1.61703) &&
                            (a / b <= 1.61903) && (c / b >= 1.61703) && (c / b <= 1.61903) ||
                    b == c && (b / a >= 1.61703) &&
                            (b / a <= 1.61903) && (c / a >= 1.61703) && (c / a <= 1.61903);

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
        System.out.println(isGoldenTriangle(3,6,6));
        System.out.println( containsDigit(3,2));
    }
}