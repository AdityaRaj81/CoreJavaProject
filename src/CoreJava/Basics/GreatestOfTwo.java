package CoreJava.Basics;

import java.util.Scanner;

public class GreatestOfTwo {

    // Method to find greatest number
    public static int getGreatest(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int greatest = getGreatest(num1, num2);

        System.out.println("Greatest number = " + greatest);
    }
}
