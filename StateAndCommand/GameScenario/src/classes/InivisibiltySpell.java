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
public class InivisibiltySpell implements ICommand {
    private Reciver receiver;
    
    public InivisibiltySpell(Reciver receiver){
    this.receiver = receiver;
    }
    
    @Override
    public void execute(){
    receiver.setVisible(false);
    }
    @Override
    public void undo(){
    receiver.setVisible(true);
    }
}
