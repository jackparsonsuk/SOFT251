/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamescenario;

import classes.*;

/**
 *
 * @author jparsons12
 */
public class GameScenario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IState start = new Unprotected();
        Reciver Apple = new Reciver(start);
ICommand invisible = new InivisibiltySpell ( Apple ) ;
Invoker HarryPotter = new Invoker () ;
HarryPotter . setCommand ( invisible ) ;
System . out . println (" Apple is visible : " +
Apple . isVisible () ) ;
Apple.printStae();
Apple.protect();
Apple.printStae();
System . out . println (" Casting spell ... ") ;
HarryPotter . castSpell () ;
System . out . println (" Apple is visible : " +
Apple . isVisible () ) ;
System . out . println (" Reversing spell ... ") ;
HarryPotter . undoSpell () ;
System . out . println (" Apple is visible : " +
Apple . isVisible () ) ;
    }
    
}
