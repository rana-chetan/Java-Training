package practice;

import java.util.Scanner;

// Conditional Statements In Java
//1) if else
//2) if else-if
//3) switch case

public class practical_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        //if else (Check The input Number is odd or even)
//        System.out.print("Enter a Number: ");
//        int num = sc.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println(num + " Is a Even Number");
//        } else {
//            System.out.println(num + " Is a Odd Number");
//        }

//        //if else-if (Check The age group)
//        System.out.print("Enter a age: ");
//        int age = sc.nextInt();
//
//        if (age <= 12) {
//            System.out.println("Child");
//        } else if (age > 12 && age < 18) {
//            System.out.println("Teenage");
//        } else {
//            System.out.println("Adult");
//        }

//        //Nested if-else
//        System.out.print("Enter a Number Between 0 To 100: ");
//        int num = sc.nextInt();
//
//        if (num < 100) {
//            if (num < 50) {
//                System.out.println("Less Then 50");
//            } else if (num > 50) {
//                System.out.println("More Then 50");
//            } else {
//                System.out.println("Equal To 50");
//            }
//        } else if (num == 100) {
//            System.out.println("Equal To 100");
//        } else {
//            System.out.println("Sorry The Number Is Above Range");
//        }

        //Switch case
        System.out.print("Enter a Number Between 1 To 7: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Condition");
        }

    }
}
