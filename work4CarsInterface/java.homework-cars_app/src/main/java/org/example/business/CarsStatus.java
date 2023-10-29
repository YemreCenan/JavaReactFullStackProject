package org.example.business;

public class CarsStatus implements ICarsStatus {

    @Override
    public void speed(int speedStatus) {

       if (speedStatus==0){
           System.out.println("Put the car in gear");
       }
        else if (speedStatus<=20){
            System.out.println("Car is in gear status : 1");

        } else if (speedStatus<=40) {
            System.out.println("Car is in gear status :2");

        } else if (speedStatus<=60) {

            System.out.println("Car is in gear status :3");

        } else if (speedStatus<=80) {

            System.out.println("Car is in gear status: 4");

        } else if (speedStatus<=100) {
            System.out.println("Car is in gear status: 5");
        } else if (speedStatus>=250) {
            System.out.println("You exceeded the speed limit calculation not available!!!!!!");
        }

    }

    @Override
    public void fuelTank(double fuelTankStatus) {
        double avgRoad = 17.8;
        double totalRoad = (fuelTankStatus *avgRoad);
        System.out.println(fuelTankStatus + " "+ "With liters of fuel " + " " + totalRoad +" "+"you can drive km");

    }
}
