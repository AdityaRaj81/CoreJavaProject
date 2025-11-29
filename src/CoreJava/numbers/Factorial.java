package CoreJava.numbers;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int number){
        if(number == 0 || number == 1){
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = input.nextInt();

        System.out.println("Factorial of " + num + " is: " + factorial(num));
        input.close();
    }
}
