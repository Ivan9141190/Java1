package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a; // действительная часть
    int b; // мнимая часть

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + "+" + b + "i";
    }


    public static void main(String[] args) {
        ComplexNum complexNum = new ComplexNum(1,5);
        System.out.println(complexNum);
    }
}
