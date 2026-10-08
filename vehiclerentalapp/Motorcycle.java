/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Motorcycle extends Vehicle {

    public Motorcycle(String vehicleID, String brand, String model, int year, int RentalDays, double dailyRate, double helmetFee) {
        super(vehicleID, brand, model, year, RentalDays);
    }

    @Override
    public double calculaterentfee() {
        return(RentalDays * dailyRate) + helmetFee;
    }
    
}
