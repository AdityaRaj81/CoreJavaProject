package CoreJava.numbers;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void printFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int num = input.nextInt();
        System.out.print("The factors of " + num + " are: ");
        printFactors(num);
        input.close();
    }
}
