/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author jparsons12
 */
public class Unprotected implements IState {

    @Override
    public void protect(Reciver reciver) {
       System.out.println("Protecting");
       reciver.setState(new Protected());
    }

    @Override
    public void unprotect(Reciver reciver) {
         System.out.println("Already unprotected, cant unprotect again");
         reciver.setState(this);
    }

    @Override
    public void printState() {
         System.out.println("I am unprotected!");
    }
    
}
