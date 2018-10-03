/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author jparsons12
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cm = 100;
        double feet;
        double inches;
        inches = cm / 2.54 ;
        feet = inches / 12;
        inches = (cm / 2.54) % 12;
        
        System.out.println("Cm: " + cm + " Feet: "+ Math.round(feet) + " Inches: " + inches );

        // TODO code application logic here
    }
    
}
