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
public class Protected implements IState {

    
    @Override
    public void protect(Reciver reciver) {
       System.out.println("Already protected, cant protect again");
       reciver.setState(this);
    }

    @Override
    public void unprotect(Reciver reciver) {
        System.out.println("unprotecting");
        reciver.setState(new Unprotected());
    }

    @Override
    public void printState() {
         System.out.println("I am protected!");
    }



    
}
