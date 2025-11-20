package CoreJava.numbers;

import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = -num;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number (0 to exit): ");
        num = sc.nextInt();

        while (num != 0) {
            int digits = countDigits(num);
            System.out.println("Total digits = " + digits);
            System.out.println("--------------------------------");
            System.out.print("Enter another number OR press 0 to exit: ");
            num = sc.nextInt();
        }
        System.out.println("Program terminated.");
    }
}
