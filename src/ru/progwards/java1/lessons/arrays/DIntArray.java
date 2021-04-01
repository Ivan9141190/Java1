package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

class DIntArray {
    int [] arr = {222,555};

    //int [] arr2  =new int [arr.length+1];
    //int [] arr3  =new int [arr.length+1];

    public static void copy(int [] a, int [] b) {
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        }

    public  void add(int num){
int []arr = {1,1,1,1,1,1};
        int [] arr3  =new int [arr.length+1];
        System.arraycopy(arr,0,arr3,0,arr.length);
        arr3 [0]= num;
       this.arr=arr3;

    }
    public void atInsert(int pos, int num){
        int [] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,11};
        int [] arr3  =new int [arr.length+1];
        System.arraycopy(arr,0,arr3,0,pos);
        System.arraycopy(arr,pos,arr3,pos+1,arr.length-pos);
        arr3 [pos]= num;
       this.arr=arr3;
}
    public void atDelete(int pos){ }
    public int at(int pos){

        return arr  [pos] ;

    }


    public static void main(String[] args) {


            DIntArray dIntArray = new DIntArray();
        System.out.println(Arrays.toString(dIntArray.arr));
      //  dIntArray.atInsert(3,444);
        System.out.println(Arrays.toString(dIntArray.arr));


       // int [] arr = {1,2,2,2,2,2,};

     //   int [] arr2  =new int [arr.length+1];
      //  int [] arr3  =new int [arr.length+1];

      //  System.out.println(Arrays.toString(arr));
      //  System.out.println(Arrays.toString(arr3));
//
//        copy(arr,arr2);
//        arr2[arr.length]=99;
//
//        copy(arr,arr3);
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));

    }


    };

