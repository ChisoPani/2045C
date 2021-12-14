/*
Title:             RectangleApp
Desc:              This program calculates area and circumference of a rectangle.
Files:             Rectangle.java
Semester:          Fall 2021
Author name:       Meelan Pokhrel
Author email:      pokhremn@mail.uc.edu
 */
package RectangleApp;

public class Rectangle {
   
    int x;
    int y;
    int width;
    int height;
    int area = width*height;
    
    
       Rectangle (int aX, int aY, int aWidth, int aHeight){
        this.x = aX;
        this.y = aY;
        this.height = aHeight;
        this.width = aWidth;   
       }
       
       int circumference(){
       return 2*width+2*height;
       }
       int area(){
       return width*height;
       }
}
