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

  public int getA(){
        return a;
}
    public int getB(){
        return b;
    }
    public ComplexNum add(ComplexNum num) {

        return new ComplexNum(a + num.getA(), b + num.getB());
    }
    public static void main (String[]args){

           ComplexNum getB = new ComplexNum(3,4);
           ComplexNum getA = new ComplexNum(1,5) ;

            System.out.println(getA);
            System.out.println(getB);
            System.out.println(getA.add(getB));
    }}
