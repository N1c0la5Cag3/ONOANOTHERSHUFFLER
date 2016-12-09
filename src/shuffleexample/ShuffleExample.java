/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shuffleexample;
import java.util.*;
/**
 *
 * @author luoos2514
 */
public class ShuffleExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       /*Generates an and fills an int array with the values between 1 and 10
       in ascending order*/
       int[] pleaseShuffle = new int [10];
       for(int i = 1; i <= pleaseShuffle.length; i++){
           pleaseShuffle[i-1] = i;
       }
       
       //Displays unshuffled array
       System.out.println("Original Array: ");
       displayArray(pleaseShuffle);
       System.out.println();
       
       //Shuffles the array and records how long it took to shuffle (millis)
       long startShuffle = System.currentTimeMillis();
       pleaseShuffle = shuffler(pleaseShuffle);
       long elapsedTimeMillis = System.currentTimeMillis()-startShuffle;
       
       //Displays shuffled array as well as how long the shuffling took (millis)
       System.out.println("\nShuffled Array: ");
       displayArray(pleaseShuffle);
       System.out.println("\n\nTime Taken (milliseconds): " + elapsedTimeMillis);
    }
    
    /**
     * Shuffles the values of an int array into a random order
     * PRE: int array is inputed and contains at least 2 elements
     * POST: int array's elements are shuffled into a random order
     */
    static int[] shuffler(int[] imArray ){
        Random rand = new Random();
        
        /*Loops through each element in the array (except the element at index 
        0) to make sure that each value is shuffled at least once*/
        for (int i = imArray.length - 1; i > 0; i--){
            
            //Generates random int between 0 and number of unshuffled elements
            int index = rand.nextInt(i+1);
            
            /*Takes the element at the specified random index, then swaps that 
            element with the last unshuffled element in the array*/
            int toSwap = imArray[index];
            imArray[index] = imArray[i];
            imArray[i] = toSwap;
        }
        
        /*Returns the same array that was inputed, but now with its elements in
        a random order*/
        return imArray;
    }
    
    /**
     * Displays all elements of an int array, in order of ascending indexes
     * PRE: int array with at least 1 element is inputted
     * POST: all elements of the array are displayed in the output window
     */
    static void displayArray(int[] displrray){
        for (int i = 0; i < displrray.length; i++){
           System.out.print(displrray[i] + " ");
        }
    }
}
