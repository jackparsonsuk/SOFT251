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
public class LevitationSpell implements ICommand {

    private Reciver receiver;
    
    public LevitationSpell(Reciver reciver){
    this.receiver = reciver;
    }
    
    
    
    @Override
    public void execute() {
       
        
        receiver.setFloatInAir(true);
        
        
    }

    @Override
    public void undo() {
       receiver.setFloatInAir(false);
    }
    
}
