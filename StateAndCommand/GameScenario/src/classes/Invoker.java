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
public class Invoker {
    private ICommand command;
    
    public void setCommand(ICommand command){
        this.command = command;
    }
    public void castSpell(){


       command.execute();

        
    
    }
    public void undoSpell(){
        command.undo();
    }
    
}
