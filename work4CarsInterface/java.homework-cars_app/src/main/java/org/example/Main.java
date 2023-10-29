package org.example;

import org.example.business.CarsManager;
import org.example.business.CarsStatus;
import org.example.business.ICarsStatus;
import org.example.dataAccess.JdbcCarsDao;
import org.example.entities.Cars;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {

        String date ;



        LocalDateTime myObj = LocalDateTime.now();

        date = myObj.toString();

        Cars carInfo = new Cars(1,"35 ASB 473","Bmw","1996",date);
        CarsManager carsManager = new CarsManager(new JdbcCarsDao());

        carsManager.add(carInfo);

       ICarsStatus iCarsStatus = new CarsStatus();
       iCarsStatus.speed(40);
       iCarsStatus.fuelTank(45.8);



    }
}