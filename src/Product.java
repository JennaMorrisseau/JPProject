//code by Jenna Morrisseau
//abstract class Product that has everything each item should have
//version 1 - 9.30.18


import java.util.Date;

public abstract class Product implements Item{

    int serialNumber;
    String manufacturer;
    Date manufacturedOn;
    String name;

    int currentProductionNumber;


    //method to set the serial number
    public void setProductionNumber(int num){
        serialNumber = currentProductionNumber;
    }

    //method to set the name passed to the variable manufacturer
    public void setName(String name) {
        manufacturer = name;
    }

    //method that gets the name defined in Item
    public String getName() {
        setName(Item.manufacturer);             //use class name. variable name
        return manufacturer;
    }


    //method to get date
    public String getManufactureDate() {
        manufacturedOn = new Date();            //initialize manufacturedOn
        return manufacturedOn.toString();       //use the Date class to get the date and format it properly

    }


    //method to get the serial number
    public int getSerialNumber() {
        setProductionNumber(currentProductionNumber);
        return serialNumber;
    }

    Product(String name) {
        this.name = name;           //sets name passed to the variable name
       currentProductionNumber++;   //increases each time
    }

    public String toString() {
        return "Manufacturer : " + getName()  + "\n" +
                "Serial Number : " + getSerialNumber() + "\n" +
                "Date : " + getManufactureDate() + "\n" +
                "Name : " + name;

    }


}
