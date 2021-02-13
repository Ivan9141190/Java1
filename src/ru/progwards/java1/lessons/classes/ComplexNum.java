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
    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(a- num.getA(), b - num.getB());
    }

    public ComplexNum mul(ComplexNum num)
    //    умножение комплексных чисел по формуле:
//            (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    { return new ComplexNum(a* num.getA()-b* num.getB(),b* num.getA()+a* num.getB());
    }
    public ComplexNum div(ComplexNum num) {
       int c = num.getA(); int d = num.getB();
    // деление комплексных чисел по формуле:
            return new ComplexNum  ((a*c + b*d)/(c*c+d*d),
                    (b*c - a*d)/(c*c+d*d));
    }
    public static void main (String[]args){

           ComplexNum complexNumA = new ComplexNum(3,4);
           ComplexNum complexNumB = new ComplexNum(1,5) ;

            System.out.println(complexNumA);
            System.out.println(complexNumB);
            System.out.println(complexNumA.add(complexNumB));
        System.out.println(complexNumA.sub(complexNumB));
        System.out.println(complexNumA.mul(complexNumB));
        System.out.println(complexNumA.div(complexNumB));
    }}
