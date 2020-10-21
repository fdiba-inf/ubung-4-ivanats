package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char arraySize = scanner.next.Int();

        char [] array = new char [arraySize];
        char [] array2 = new char [ arraySize];
         
         for ( int i = 0; i < array.length; i++) {
           array[i] =(char) scanner.nextLine().charAt(0);
         }
         for ( int i = 0; i < array.length; i++) { 
           array2 [i] = array[array.length - 1 - i];
         }
        
        System.out.println(array2);
    }

}
