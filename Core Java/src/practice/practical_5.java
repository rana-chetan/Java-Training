package practice;

// Operators in Java
// Arithmetic, Assignment, Comparison, Logical and Bitwise Operators

public class practical_5 {

    public static void main(String[] args) {

        int p = 9;
        int q = 10;

//        //Arithmetic Operators (+, -, *, /, %)
//        System.out.println(p + q);
//        System.out.println(p - q);
//        System.out.println(p * q);
//        System.out.println(p / q);
//        System.out.println(p % q);

//        //Assignment Operator (=, +=, -=, *=, /=, %=)
//        int p = 10, q = 30;
//
//        p += q; // p = p + q
//        p -= q; // p = p - q
//        p *= q; // p = p * q
//        p /= q; // p = p / q
//        p %= q; // p = p % q
//
//        p = q;
//        System.out.println(p);

//        //Comparison Operators (==, !=, >, <, >=, <=)
//        int p = 10, q = 20;
//
//        System.out.println(p == q);
//        System.out.println(p != q);
//        System.out.println(p > q);
//        System.out.println(p < q);
//        System.out.println(p >= q);
//        System.out.println(p <= q);

//        //Logical Operators (&&, ||, !)
//        System.out.println(p < q && p <= q); //true
//        System.out.println(p == q || p < q); //true
//        System.out.println(!(p < q)); //false

        //Bitwise Operator (|, &, ^, ~, <<, >>)
        System.out.println(p | q); //11
        System.out.println(p & q); //8
        System.out.println(p ^ q); //3
        System.out.println(p << 2); //36
        System.out.println(p >> 1); //4
    }
}
