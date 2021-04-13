public class Биты{


    enum Grade {VERYBAD, BAD, SATISFACTORILY, GOOD, EXCELLENT, NOTDEFINED}

    static Grade intToGrade(int grade){
        Grade grade1 = Grade.VERYBAD;
        Grade grade2 = Grade.BAD;
        Grade grade3 = Grade.SATISFACTORILY;
        Grade grade4 = Grade.GOOD;
        Grade grade5 = Grade.EXCELLENT;
        Grade grade6 = Grade.NOTDEFINED;
switch (grade){
    case 1: return grade1;
    case 2: return grade2;
    case 3: return grade3;
    case 4: return grade4;
    case 5: return grade5;
    default: return grade6;

}
}

    public static void main(String[] args) {
        System.out.println(intToGrade(3));

        byte value = 99;
        byte i = 0b0000001;
       // int result = i & value;
        int result = (value & 0x1) == 1 ? 1 : 0;
//        if (result == 1) System.out.println(1);
//        System.out.println(r);
//if (result == 0) System.out.println(0);
//    }
//}
//
//0*1
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
    }}