package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a; // действительная часть
    int b; // мнимая часть
    int c;
    int d;
    String num;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;

    }


    @Override
    public String toString() {

        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num1,ComplexNum num2){

        return new ComplexNum(num1.a + num2.a, num1.b + num2.b);
    }
public  ComplexNum sub(ComplexNum num1,ComplexNum num2 ){

        return  new ComplexNum(num1.a - num2.a, num1.b - num2.b);
}

        public static void main (String[]args){
            ComplexNum aa = new ComplexNum(6, 5);
            ComplexNum bb = new ComplexNum(3,4);


            System.out.println(aa);
            System.out.println(bb);

            System.out.println(aa.add(aa,bb));
            System.out.println(aa.sub(bb,aa));
    }
    }
