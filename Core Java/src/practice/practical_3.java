package practice;

// Type Casting in Java

public class practical_3 {

    public static void main(String[] args) {

        //(int -> double) Automatically by JVM
        int num = 200;
        System.out.println(num);

        double a = num;
        System.out.println(a);

        //(double -> int) Forcefully by Programmer
        double num1 = 200.0;
        System.out.println(num1);

        int a1 = (int) num1;
        System.out.println(a1);
    }
}
