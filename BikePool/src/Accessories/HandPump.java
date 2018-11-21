/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accessories;

import Controller.Bike;
import Controller.BikeDecorator;

/**
 *
 * @author jparsons12
 */
public class HandPump  extends BikeDecorator{
    
    public HandPump(Bike bike) {
        super(bike);
    }
    public String getType(){
    return bike.getType()+ ", With HandPump";
    }
}
