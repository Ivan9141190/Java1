package ru.progwards.java1.lessons.bitsworld;

 class CheckBit {

     public static int checkBit(byte value, int bitNumber) {
         int res;
         if (bitNumber == 0) {
             res = 1 + value;}

         else

             res = value << bitNumber + 1;

         return res;
     }
 }

