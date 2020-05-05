package com.rajesh.java;

import com.rajesh.kotlin.AccessModifierKt;
import com.rajesh.kotlin.Car;
import com.rajesh.kotlin.Employee;

public class Sample {
    public static void main(String[] args) {
        Employee employee=new Employee("Rajesh", 200);
        Car car1=new Car("Toyota", "Camry",2019);
        Car car2=new Car("Honda", "Civic",2020);
        Car car3=new Car("Toyota", "Corolla",2018);
        Car[] cars=new Car[]{car1, car2, car3};
        AccessModifierKt.printCarModels(cars);
    }
}
