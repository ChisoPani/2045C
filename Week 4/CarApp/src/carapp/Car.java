/*
Title:             carapp
Desc:              This program simulates a car driving and adding fuel, and fuel left.
Files:             Car.java
Semester:          Fall 2021
Author name:       Meelan Pokhrel
Author email:      pokhremn@mail.uc.edu
 */
package carapp;

public class Car {
    double driveDistance;
    double gas;
    double mpg;
    
 Car(double aMpg){
    mpg = aMpg; 
    gas = 0;
}
 
public void drive(double distance){
    driveDistance = driveDistance + distance;
    mpg = gas * mpg / distance;
    gas = gas - (distance / mpg); //gets the gas left
}

public double getGasLevel(){
    return gas;
}    

public void addGas(double addG){
    gas = gas + addG;
}

}
