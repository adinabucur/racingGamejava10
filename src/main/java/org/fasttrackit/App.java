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
            car.setName("Dacia") ;
            car.setColor("White");
            car.doorCount = 4;
            car.setMileage(7.5);
            car.running = true;

            double carTravelDistance
                    = car.accelarate(100, 2);


        }

    }
}
