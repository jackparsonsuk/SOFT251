/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bikes;

import Controller.Bike;

/**
 *
 * @author jparsons12
 */
public class TouringBike extends Bike{
    public TouringBike(){
    this.bikeType = "Touring";
    }
    public boolean available(){
    return false;
    }
}
