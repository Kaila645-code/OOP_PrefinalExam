/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public abstract class Vehicle {

    protected String vehicleID;
    protected String brand;
    protected String model;
    protected int year;
    protected int RentalDays;
    public double dailyRate;
    public double insuranceFee;
    public double driverFee;
    public double helmetFee;

    public double getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(double driverFee) {
        this.driverFee = driverFee;
    }

    public double getHelmetFee() {
        return helmetFee;
    }

    public void setHelmetFee(double helmetFee) {
        this.helmetFee = helmetFee;
    }

    public double getDailyLife() {
        return dailyRate;
    }

    public void setDailyLife(double dailyLife) {
        this.dailyRate = dailyLife;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRentalDays(int rentalDays) {
        this.RentalDays = rentalDays;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getRentalDays() {
        return RentalDays;
    }

    public Vehicle(String vehicleID, String brand, String model, int year, int rentalDays) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.RentalDays = rentalDays;
    }

    public abstract double calculaterentfee();

    public static int getVehicleCount() {
        return 3;
    }
    
    
    

    public void displayVehicleInfo() {
        System.out.println("===============Vehicle Information===============");
        System.out.println("VehicleID:" + vehicleID);
        System.out.println("Brand:" + brand);
        System.out.println("Model:" + model);
        System.out.println("Year:" + year);
        System.out.println("RentalDays:" + RentalDays);
        System.out.println("DailyLife:" + (double) dailyRate );
        System.out.println("InsuranceFee:" + (double) insuranceFee);
        System.out.println("DriverFee:" + (double) driverFee);
        System.out.println("HelmetFee:" + (double) helmetFee);
        
     
        
        
    }

}
