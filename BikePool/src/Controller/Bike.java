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
public abstract class Bike {
    protected String bikeType = "unknown type";
    public String getType(){
    return bikeType;
    }
    public String assignedTo = "unAssigned";
    public Boolean  available;
}
