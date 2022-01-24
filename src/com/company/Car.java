package com.company;

public class Car {
    int distance = 180;

    public void start() {
        System.out.println("Начал ехать 13:00");


    }

    public void stop() {
        System.out.println("Закончил ехать 14:00 ");



    }
    public void speed(){
        System.out.println("проехал со скоростью 60км/ч");
    }

    public int drive(int howlong) {
        distance = distance * howlong;

        System.out.println("Был в дороге 1 час = " + howlong +" мин " + " общие ростояние " + distance + "");
        return distance;

    }


}
