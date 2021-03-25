package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    int N = 17;
    private boolean[] sieve = new boolean[N];{
        Arrays.fill(sieve,true);
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i] = true) {
                for (int j = 2* i; j < sieve.length; j += i) {
                    sieve[j] = false;

                }
            }
        }}


    public Eratosthenes(int N) {
        boolean [] isPrime = new boolean[N];
        Arrays.fill(isPrime,true);
        for (int i = 2; i*i < N; i ++)
            if (isPrime [i]){
                for(int j =2*i; j<N; j+=i ){
                    isPrime [j] = false;
                }
            }
    }
    private void sift() {
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i < sieve.length; ++i) {
            if (sieve[i]) {
                for (int j = 2; i * j < sieve.length; ++j) {
                    sieve[i * j] = false;
                }
            }
        }
    }
    public boolean isSimple(int n) {
            boolean b = true;
            for (int i = 2; i <= n; i++) {
                b = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        b = false;
                        //break;
                    }
                }
//                if (b) {
//                    System.out.println(i + "  " + b);
//                } else
//                    System.out.println(i + " " + b);
//            }
            }
                return b;
            }
        //return n >0 && n <= sieve.length ? sieve[n] : false;

    public static class ArraySort {

        public static void sort(int[] ArraySort){
            ArraySort = new int[] {121,434,3443};

            for (int i = 0; i < ArraySort.length; i++) {
                int num = ArraySort[i];

                for (int j = i - 1; j >= 0; j--) {
                    int leftnumber = ArraySort[j];

                    if (num < leftnumber) {
                        ArraySort[j + 1] = leftnumber;
                        ArraySort[j] = num;
                    } else {
                        break;
                    }
                }
            }

            for (int n : ArraySort) {
                System.out.println(n);
            }
        }


    }
    public static void main(String[] args) {
        Eratosthenes era = new Eratosthenes(80);
        era.sift();
       // for ( int i = 2; i< era.sieve.length; i++)

         //   System.out.println(i + " " + era.isSimple(i));

        System.out.println(Arrays.toString(era.sieve));
        System.out.println(era.isSimple(11));
          int a[] = new int[] {};
        ArraySort arraySort = new ArraySort();
        arraySort.sort(a);

    }}

