package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {




    public static double volumeBallDouble(double radius){

        final Double π = 3.14;
        Double S = 4/3* π * Math.pow(radius,2);

        System.out.println("Обьем double "+S);
        return S;


    }
    public static float volumeBallFloat(float radius){

        final Double π = 3.14;
        float S =  (float) (4/3* π * radius*radius);

        System.out.println("Обьем float " +S);
        return S;
    }

    public static double calculateAccuracy(double radius){
        Float f =  volumeBallFloat((float)(radius));
        Double d = volumeBallDouble(radius);

        System.out.print("разница double-float " );
        System.out.println(d-f);
        return d-f;
    }


    public static void main(String[] args) {



        calculateAccuracy(6371.2);



    }}

