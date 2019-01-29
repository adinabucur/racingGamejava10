package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Engine engine = new Engine();

        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        {
            Car car = new Car(engine);
            car.setName("Dacia");
            car.setColor("White");
            car.doorCount = 4;
            car.setMileage(7.5);
            car.running = true;

            double carTravelDistance
                    = car.accelarate(100, 2);


            //Example of static variables unique for the all application
            Vehicle vehicle1 = new Vehicle();
  //          vehicle1.vehicleCount =++;

            Vehicle vehicle2 = new Vehicle();
            Vehicle vehicle3 = new Vehicle();
  //          vehicle2.vehicleCount = 2;


            System.out.println ("Value from vehicle 1: " + vehicle1.vehicleCount);
            System.out.println ("Value from vehicle 2: " + vehicle1.vehicleCount);
            System.out.println ("Value from Vehicle class: " + Vehicle.vehicleCount);

        }
    }
}
