package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	String[] pets = new String[3];
	pets[0]="Fluffy";
	pets[1]= "Scruffy";
	pets[2]= "Rover";
	for (String pet:pets)
    {
        System.out.println(pet);
    }
        List<String> cars = new ArrayList<>();
	    cars.add("Camero");
	    cars.add("Smart");
	    cars.add("Fiero");

        for (String car:cars)
        {
            System.out.println(car);
        }
        System.out.println();
	    cars.add("Model 3");
	    cars.add("Model T");

	    for (String car:cars)
        {
            System.out.println(car);
        }
        System.out.println();
        for(int i = 0; i < cars.size(); i++)
        {
            System.out.println(cars.get(i));
        }
    }
}
