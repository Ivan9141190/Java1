package ru.progwards.java1.lessons.bitsworld;
public class Binary
{
    private byte num;

    public Binary(byte num)
    {
        this.num = num;
    }

    @Override
    public String toString()
    {
        String res = "";

        for (int i = 0; i < 8; i++)
        {
//логическое  & c 1
            res = (((num & 1) == 0) ? "0" : "1") + res;
//Сдвинуть число на 1 бит
            num = (byte) (num >> 1);
        }
//    res = ((((1 << i) & num) == 0) ? "0" : "1") + res;

        return res;
    }

//    public static void main(String[] args)
//    {
//        System.out.println(new Binary((byte) -81).toString());
//        System.out.println(new Binary((byte) 1).toString());
//        System.out.println(new Binary((byte) 127).toString());
//        System.out.println(new Binary((byte) -40).toString());
//        System.out.println(new Binary((byte) -1).toString());
//    }
}



