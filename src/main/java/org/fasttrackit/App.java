package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )


       {Car car = new Car();
        car.name = "Dacia";
        car.color = "White";
        car.doorCount = 4;
        car.mileage = 7.5;
        car.running = true;

        double carTravelDistance
                = car.accelarate(100, 2);




        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        car.engine = engine;


        car.engine.manufacturer = "BMW";
        engine.manufacturer ="Microsoft";


        Car car2 = new Car();
        car2.name = "Abc";


    }
}
