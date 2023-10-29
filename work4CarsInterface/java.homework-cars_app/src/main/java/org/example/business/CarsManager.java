package org.example.business;

import org.example.dataAccess.CarsDao;
import org.example.entities.Cars;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class CarsManager {


   CarsDao carsDao;



   public CarsManager(CarsDao carsDao){
      this.carsDao = carsDao;
   }


   public void add (Cars cars) throws Exception {
      if (cars.getNumberPlate().length() <= 1) {
         throw new Exception("Car must have a number plate");
      }
      if (cars.getBrand().length() <= 1) {
         throw new Exception("Car must have a brand");
      }
      if (cars.getModel().length() <= 1) {
         throw new Exception("Car must have a model name");
      } else{

         carsDao.add(cars);

   }




   }

}
