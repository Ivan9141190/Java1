package ru.progwards.java1.lessons.arrays;

class ArraySort {

    public static void sort(int[] a) {

       // ArraySort arraySort = new ArraySort();

        //a = new int[]{121, 54, 45, 454, -12, -2222};
        for (int i = 0; i < a.length; i++) {
            int num = a[i];

            for (int j = i - 1; j >= 0; j--) {
                int leftnumber = a[j];

                if (num < leftnumber) {
                    a[j + 1] = leftnumber;
                    a[j] = num;
                } else {
                    break;
                }
            }
       }}}
//        for (int n : a)
//            System.out.println(n);
//    }}


