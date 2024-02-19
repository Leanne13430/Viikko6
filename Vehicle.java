package main;



public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    protected Engine engine;

   

    
    
    public Vehicle (String type, String manufacturer, String model, int maxSpeed) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;

    }
    

  

    public void listVehicles() {
            System.out.println(type + ": " + manufacturer + " " + model);
            System.out.println("Moottori: " + engine.getMotor() + " " + engine.getPower() + "kW");
            System.out.println("Huippunopeus: " + maxSpeed + "km/h");
            System.out.println("\n");

    }

    


    
}
