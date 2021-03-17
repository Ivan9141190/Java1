package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    int N = 10;
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
//    public boolean isSimple(int n) {
//        boolean n = true;
//        for (int i = 2; i <= N; i++) {
//            n = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    n = false;
//                    //break;
//                }
//            }
//            if (n) {
//
//                System.out.println(i + "  " + n);
//
//            } else
//                System.out.println(i + " " + n);
//
//        }
//
//        return n ;
//    }

    public static void main(String[] args) {
        Eratosthenes era = new Eratosthenes(80);
        era.sift();
        for ( int i = 2; i< era.sieve.length; i++)

          //  System.out.println(i + " " + era.isSimple(i));

        System.out.println(Arrays.toString(era.sieve));
      //  System.out.println(era.isSimple(11));
    }}

