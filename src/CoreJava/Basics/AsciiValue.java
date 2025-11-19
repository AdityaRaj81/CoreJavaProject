package CoreJava.Basics;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to find its ASCII value: ");
        int ch = sc.next().charAt(0);

        while (ch != '0') {
            int asciiValue = ch;
            System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
            System.out.println("----------------------------------");
            System.out.print("Enter another character OR press '0' to exit: ");
            ch = sc.next().charAt(0);
        }
        System.out.println("Program terminated.");
    }
}
