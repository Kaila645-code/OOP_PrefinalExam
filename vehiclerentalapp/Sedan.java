/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Sedan extends Vehicle {

    public Sedan(String vehicleID, String brand, String model, int year, int RentalDays, double dailyRate, double insuranceFee) {
        super(vehicleID,"Sendan", model, year, RentalDays);
    }

    @Override
    public double calculaterentfee() {
        return ( RentalDays * dailyRate ) + insuranceFee;
    }
    
}
