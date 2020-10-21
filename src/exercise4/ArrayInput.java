package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers =  new int [3];
        numbers [0] = 7;
        numbers [1] = -8;
        numbers [2] = 1;
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) { 
             numbers[index] = input.nextInt();
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Numbers: " + numbersAsString);

    }

}

