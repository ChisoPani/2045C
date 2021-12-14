/*
Title: ArrayEditor
Desc: This program will edit array
Files: ArrayEditor.java
Semester: Fall 2021
Author name: Meelan Pokhrel
Author email: pokhremn@mail.uc.edu
Class section: 001
*/

package arrayeditor;

public class ArrayEditor {

    static String getAllElements(int[] input) {
        String output = "";

        for (int index=0;index<input.length;index++) { 
        output=output+input[index] + " ";
        }
        return output;
    }

    static int[] swapFirstLast(int[] input) {

        int[] output = new int[input.length];      
        for (int index=0;index<output.length;index++) { 
        output[index]=input[index];
        }
        output[0]=input[input.length -1];
        output[output.length -1]= input[0];

        return output;
    }

    static int[] replaceEvensWithZeros(int[] input) {
        int[] output = new int[input.length];
        for(int index=0;index<input.length;index++){
            if(input[index]%2==0){
        output[index]=0;}
            else
            output[index] = input[index];
        }
        return output;
    }

    static int largestElement(int[] input) {
        int largest = Integer.MIN_VALUE;
         for (int index=0;index<input.length;index++){
         if(input[index]>largest){
             largest = input[index];}   
         }
        return largest;
    }

    public static void main(String[] args) {
        int[] TenNumbers = new int[10];

        for (int index = 0; index < TenNumbers.length; index++) {
            TenNumbers[index] = (int) (Math.random() * 100);
        }

        System.out.println("All elements: " + getAllElements(TenNumbers));
        System.out.println("After swapping the first and last elements in the array: " + getAllElements(swapFirstLast(TenNumbers)));
        System.out.println("After replacing all even elements with 0:  " + getAllElements(replaceEvensWithZeros(TenNumbers)));
        System.out.println("The largest value: " + largestElement(TenNumbers));

    }

}
