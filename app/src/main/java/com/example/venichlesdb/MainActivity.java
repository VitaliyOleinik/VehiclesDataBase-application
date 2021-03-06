package com.example.venichlesdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DataBaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataBaseHandler dataBaseHandler = new DataBaseHandler(this);

        Log.d("Cars count:", String.valueOf(dataBaseHandler.getCarsCount()));

//        dataBaseHandler.addCar(new Car("Toyota","30 000 $"));
//        dataBaseHandler.addCar(new Car("Mercedes","50 000 $"));
//        dataBaseHandler.addCar(new Car("RollsRays","1 000 000 $"));
//        dataBaseHandler.addCar(new Car("Cadillac","120 000 $"));
//
//        dataBaseHandler.addCar(new Car("Mazda","3 000 $"));
//        dataBaseHandler.addCar(new Car("Honda","25 000 $"));
//        dataBaseHandler.addCar(new Car("Skoda","12 000 $"));
//        dataBaseHandler.addCar(new Car("Hyundai","30 000 $"));

        List<Car> carList = dataBaseHandler.getAllCars();
        /*Car carManipulation = dataBaseHandler.getCar(7);
        dataBaseHandler.deleteCar(carManipulation);*/
        for(Car car : carList){
            Log.d("Car Info", "ID: " + car.getId() + ", Name: " + car.getName() +
                    ", Price: " + car.getPrice());
        }



//        Car car = dataBaseHandler.getCar(1);
//        Log.d("Car Info", "ID: " + car.getId() + ", Name: " + car.getName() +
//                    ", Price: " + car.getPrice());
//        car.setName("Tesla");
//        car.setPrice("250 000 $");
//        dataBaseHandler.updateCar(car);
//        int updatedCarID = dataBaseHandler.updateCar(car);
//        Log.d("Car Info", "ID: " + car.getId() + ", Name: " + car.getName() +
//                ", Price: " + car.getPrice() + ", ID of updated car: " + updatedCarID);



    }
}
