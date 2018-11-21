/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author jparsons12
 */
public abstract class BikeDecorator extends Bike {
    public Bike bike ;
    public BikeDecorator(Bike bike){
        this.bike = bike;
    }
}
