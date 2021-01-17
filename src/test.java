public class test {
    public static String sayHello(String greeting, String name) {
        String res = greeting + ", " + name +"!";
        return res;


    }


    public static void main(String[] args) {
        String greeting = "Привет";
        String name = "Долли";
        sayHello(greeting, name);
System.out.println(sayHello( greeting, name));
    }
}