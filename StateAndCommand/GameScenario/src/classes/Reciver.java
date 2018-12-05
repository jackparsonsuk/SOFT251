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
public class Reciver {
    private boolean floatInAir = false;
    private boolean visible = true;
    private IState state = new Unprotected();
    public Reciver(IState state){
    this.state = state;
    }
    public void setState(IState state){
    this.state = state;
    }
    public void protect(){
    state.protect(this);
    }
    public void unprotect(){
    state.unprotect(this);
    }
    public void printStae(){
    this.state.printState();
    }

    
    
    public boolean isFloatInAir(){
    return floatInAir;
    }
    public void setFloatInAir(boolean floatInAir)
    {
    
    this.floatInAir = floatInAir;
    }
    public boolean isVisible(){
    return visible;
    }
    public void setVisible(boolean visible){
    this.visible = visible;
    }
    
    
    }

