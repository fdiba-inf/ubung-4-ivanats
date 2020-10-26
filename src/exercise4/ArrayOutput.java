package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] numbers = new int[size];

        for( int i = 0; i < numbers.length; i++) {
           numbers[i] = input.nextInt();
        }
       
        for (int index = 0; index < numbers.length; index++) {

            for( int l = 0; l <index; l++){
              System.out.print(" ");
            }
            System.out.println(numbers[index]);
        }

        
    }

}
