package com.example.testp2;

public class Planet {
    String name;
    int rotation_period;
    /*int orbital_period;
    int diameter;
    String climate;
    String gravity;
    String terrain;
    int surface_water;
    int population;*/

    public String getName(){
        return name;
    }

    public int getRotation_period(){
        return rotation_period;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRotation_period(int rotation_period){
        this.rotation_period = rotation_period;
    }

    /*---Rajouter des getters et des setters si on veut de nouveaux champs---*/
}
