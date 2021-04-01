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

            }
                return b;
            }

    public static void main(String[] args) {
        Eratosthenes era = new Eratosthenes(80);
        era.sift();


        System.out.println(Arrays.toString(era.sieve));
        System.out.println(era.isSimple(11));
          int a[] = new int[] {-1,-3,-3,33,33,22};
        ArraySort arraySort = new ArraySort();
        arraySort.sort(a);
        System.out.println(Arrays.toString(a));
        DIntArray dIntArray = new DIntArray();
        System.out.println(Arrays.toString(dIntArray.arr));
        dIntArray.add(9);
        System.out.println(Arrays.toString(dIntArray.arr));

        System.out.println();
        dIntArray.atInsert(1,3333);
        System.out.println(Arrays.toString(dIntArray.arr));
        System.out.println();
        dIntArray.atDelete(3);
        System.out.println(Arrays.toString(dIntArray.arr));
        dIntArray.at(3);
        System.out.println(Arrays.toString(dIntArray.arr));
    }}

