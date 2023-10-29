package org.example.dataAccess;

import org.example.entities.Cars;

public class JdbcCarsDao implements CarsDao{
    @Override
    public void add(Cars cars) {
        System.out.println(cars.getId()+ "-" +cars.getNumberPlate()+ "\n" +
                cars.getBrand() +"\n" +
                cars.getModel()+"\n"+
                cars.getDate()+"?\n"+
                " added to DB with JDBS");

    }


}
