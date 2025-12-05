package CoreJava.numbers;

import java.util.Scanner;

public class HarshadNumber {

    public static boolean isHarshadNumber(int num) {

        int sum = 0;
        int temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }

        return num % sum == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (isHarshadNumber(num)) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }

        input.close();
    }
}
