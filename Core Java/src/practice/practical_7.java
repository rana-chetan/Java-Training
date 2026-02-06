package practice;

import java.util.Scanner;

// Loops In Java (1.while loops, 2.for loops, 3.do while loops)

public class practical_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        //while loop (1) - print n natural numbers
//        System.out.print("Enter a number: ");
//
//        int num = sc.nextInt();
//        int a = 1;
//
//        while (a <= num) {
//            System.out.println(a);
//            a++;
//        }

//        //while loop (2) - sum of n natural numbers
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//
//        int t = 1;
//        int sum = 0;
//
//        while (t <= num) {
//            sum = sum + t;
//            t++;
//        }
//
//        System.out.println(sum);

//        //while loop (3) - print multiplication table of a given number
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//        int a = 1;
//
//        while (a <= 10) {
//            System.out.println(num * a);
//            a++;
//        }

        // --------------------------------for loop---------------------------------

//        //for loop (1) - print sum of n natural numbers
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= num; i++) {
//            sum = sum + i;
//        }
//
//        System.out.println(sum);

//        //for loop (2) - print n to 1 numbers
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//
//        for (int i = num; i >= 1; i--) {
//            System.out.println(i);
//        }

        // --------------------------------do while loop---------------------------------

//        //do while - print 10 to 20 numbers
//        int num = 10;
//
//        do {
//            System.out.println(num);
//            num++;
//        } while (num <= 20);

        // -------------------------------Control Statements---------------------------------
        // break Keyword

//        // Using for loop
//        int num = 1;
//
//        for (int i = num; true; i++) {
//
//            if ((i % 5 == 0) && (i % 7 == 0)) {
//                System.out.println("Ans Is: " + i);
//                break;
//            }
//        }

//        // Using while loop
//
//        int num = 1;
//
//        while (true) {
//
//            if ((num % 5 == 0) && (num % 7 == 0)) {
//                System.out.println("Found ans is: " + num);
//                break;
//            }
//
//            num++;
//        }

        // continue keyword

//        // Using for loop
//        for (int i = 1; i <= 50; i++) {
//
//            if (i % 3 == 0) {
//                continue;
//            }
//
//            System.out.println(i);
//        }

        // Using while loop
        int i = 1;

        while (i <= 50) {

            if (i % 3 == 0) {
                i++;
                continue;
            } else {
                System.out.println(i);
            }

            i++;
        }

    }
}
