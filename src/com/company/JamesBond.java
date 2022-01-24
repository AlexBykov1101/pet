package com.company;

public class JamesBond extends Car {



        @Override
        public int drive ( int howlong){
            distance = distance * howlong;

            System.out.println("Был в дороге 1 час = " + howlong + " мин " + " общие ростояние " + distance + "");
            System.out.println("далеко уехал !!!");
            return distance;


        }

}

