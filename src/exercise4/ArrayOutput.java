package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter numbers: ");

        for( int i = 0; i < numbers.length; i++) {
           numbers[index] = input.nextInt();
        }
       
        for (int index = 0; index < numbers.length; index++) {

            for( int i = 0; i <index; i++){
              System.out.print(" ");
            }
            System.out.println(numbers[index]);
        }

        
    }

}
