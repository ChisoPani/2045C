/*
Title:             address
Desc:              This program prints out house addreses.
Files:             address.java
Semester:          Fall 2021
Author name:       Meelan Pokhrel
Author email:      pokhremn@mail.uc.edu
 */
package addressapp;

public class address {
    private int houseNumber;
    private String street;
    private int apartmentNumber;
    private String city;
    private String state;
    private int zipCode;
    
    //with apartment number
    public address(int aHouseNumber, String aStreet, int aApartmentNumber, String aCity, String aState, int aZipCode){
    houseNumber = aHouseNumber;
    street = aStreet;
    apartmentNumber = aApartmentNumber;
    city = aCity;
    state = aState;
    zipCode = aZipCode;

    }
    
    //without apartment number
    public address(int aHouseNumber, String aStreet, String aCity, String aState, int aZipCode){
    houseNumber = aHouseNumber;
    street = aStreet;
    city = aCity;
    state = aState;
    zipCode = aZipCode;
      
    }
    
    public void printAddress(){
    System.out.println(street);
    System.out.println(city);
    System.out.println(state);
    System.out.println(zipCode);
    
    }
    
    public boolean comesBefore(address anotherAddress){
    return (zipCode < anotherAddress.zipCode);   
    }
}

