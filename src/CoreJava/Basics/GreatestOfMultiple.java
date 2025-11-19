package CoreJava.Basics;

import java.util.Scanner;

public class GreatestOfMultiple {

    // Method to find greatest number
    public static int getGreatest(int[] arr) {

        int max = arr[0];   // assume first element is the greatest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];     // update max
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to compare? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int greatest = getGreatest(numbers);

        System.out.println("Greatest number = " + greatest);
    }
}
