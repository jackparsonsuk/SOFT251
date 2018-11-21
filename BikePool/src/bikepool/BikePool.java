/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikepool;

import Accessories.*;
import Bikes.MountainBike;
import Bikes.RoadBike;
import Controller.Bike;

/**
 *
 * @author jparsons12
 */
public class BikePool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bike bikeA = new RoadBike();
        Bike bikeB = new FrontLight(bikeA);
        Bike bikeC = new FrontLight(bikeB);
        System.out.println(bikeA.getType());
        System.out.println(bikeB.getType());
        System.out.println(bikeC.getType());
    }
    
}
