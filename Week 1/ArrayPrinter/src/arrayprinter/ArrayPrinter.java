/*
Title: ArrayPrinter
Desc: This program will print array
Files: ArrayPrinter.java
Semester: Fall 2021
Author name: Meelan Pokhrel
Author email: pokhremn@mail.uc.edu
Class section: 001
*/

package arrayprinter;

public class ArrayPrinter {

    public static void main(String[] args) {

        int[] TenNumbers = new int[10];  
        for (int index = 0; index < TenNumbers.length; index++) {
            TenNumbers[index] = (int) (Math.random() * 100);
        }
        
        //Prints all elements
        System.out.print("All elements: ");  
        for (int index = 0; index < TenNumbers.length; index++) { 
        System.out.print(TenNumbers[index]+" ");}
        
        
        //Prints first and last element
        System.out.println();
        System.out.println("The first element: " + TenNumbers[0] + " - The last element: " + TenNumbers[TenNumbers.length-1]);
         
        //Prints even indexes
        System.out.print("Elements at even indexes: ");
        for (int index=0; index<TenNumbers.length;index=index+2){
        System.out.print(TenNumbers[index]+" ");}
        
        
        //Prints even numbers
        System.out.println();
        System.out.print("Even elements: ");
        for(int index=0;index<TenNumbers.length;index++){
            if(TenNumbers[index]%2==0){
        System.out.print(TenNumbers[index] + " ");}}
        
        //Prints reverse order
        System.out.println();
        System.out.print("Reverse order: ");
        for(int index=TenNumbers.length-1;index>=0;index--){
        System.out.print(TenNumbers[index]+" ");}
        
        
}
}