package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

class DIntArray {
    int [] arr = {};

    public static void copy(int [] a, int [] b) {
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        }
    public  void add(int num){
        int [] arr3  =new int [arr.length+1];
        System.arraycopy(arr,0,arr3,0,arr.length);
        arr3 [arr.length]= num;
       this.arr=arr3;
    }

    public void atInsert(int pos, int num){
        int [] arr3  =new int [arr.length+1];
        System.arraycopy(arr,0,arr3,0,pos);
        System.arraycopy(arr,pos,arr3,pos+1,arr.length-pos);
        arr3 [pos]= num;
       this.arr=arr3;
}
    public void atDelete(int pos){
        int [] arr3  =new int [arr.length];
        System.arraycopy(arr,0,arr3,0,pos);
       System.arraycopy(arr,pos+1,arr3,pos,arr.length-pos-1);
        this.arr=arr3;

    }
    // вот тут верно???
    public int at(int pos){

        return  arr [pos] ;
    }


    public static void main(String[] args) {

            DIntArray dIntArray = new DIntArray();
        System.out.println(Arrays.toString(dIntArray.arr));
        System.out.println(Arrays.toString(dIntArray.arr));


    }


    };

