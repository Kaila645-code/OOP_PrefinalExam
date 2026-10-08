/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        {
            vehicles[0] = new Vehicles("SDOO1", "toyota", "Vios", 2024, 3, "Sedan", 5, 000.00);
            vehicles[1] = new Vehicles("VN001", "t0yota", "HiAce", 2023, 2, "Sedan", 5, 000.00);
            vehicles[2] = new Vehicles("MC001", "t0yota", "Vios", 2024, 3, "Sedan", 5, 000.00);
        }
        System.out.println("===============DINA AND GAT RENT A RIDE SERVICE VEHICLE RENTAL SYSTEM");
        System.out.println("");

        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicleInfo();
        }

    }

}
//papasara nalang me sir please huhu. 
//my favorite major teacher