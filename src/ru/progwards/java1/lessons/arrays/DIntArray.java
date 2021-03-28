package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    int [] arr = {1,2,2,2,2,2,};

    int [] arr2  =new int [arr.length+1];
    int [] arr3  =new int [arr.length+1];

    public static void copy(int [] a, int [] b) {
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        }

    public void add(int num){
        int [] arr = {1,2,2,2,2,2,};
        int [] arr2  =new int [arr.length+1];
        System.arraycopy(arr,0,arr2,0,arr.length);
        arr2 [arr.length]= num;
        this.arr2=arr2;

    }

    public static void main(String[] args) {

            DIntArray dIntArray = new DIntArray();
        System.out.println(Arrays.toString(dIntArray.arr));
        dIntArray.add(444);
        System.out.println(Arrays.toString(dIntArray.arr2));
        int [] arr = {1,2,2,2,2,2,};

        int [] arr2  =new int [arr.length+1];
        int [] arr3  =new int [arr.length+1];

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        copy(arr,arr2);
        arr2[arr.length]=99;

        copy(arr,arr3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }


    };

