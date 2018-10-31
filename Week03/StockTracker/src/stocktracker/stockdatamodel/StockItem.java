/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;
import java.util.ArrayList;
import utilites.IObserver;
import utilites.ISubject;
/**
 *
 * @author jparsons12
 */
public abstract class StockItem implements ISubject{
    protected String name = "UNKNOWN";
    protected Integer quantityInStock = 0;
    protected Double sellingPrice = 1000.00;
    protected Double costPrice = 1000.00;
    private ArrayList<IObserver> observers = null;
    public StockItem(){
        
    }
    public StockItem(String name){
        this.name = name;
    }
     public StockItem(String name,Integer qty){
        this.name = name;
        this.quantityInStock = qty;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
           this.name = name; 
           notifyObservers();
        }
        
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if (quantityInStock != null && quantityInStock >=0) {
            this.quantityInStock = quantityInStock;
        notifyObservers();
        }
        
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if (sellingPrice != null && sellingPrice >= this.costPrice && sellingPrice >=0) {
            this.sellingPrice = sellingPrice;
            notifyObservers();
        }
        
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        if (costPrice != null && costPrice >=0) {
            this.costPrice = costPrice;
            notifyObservers();
        }
        
    }
    public boolean isInStock(){
        boolean inStock = false;
        if (this.quantityInStock>0) {
            inStock = true;
        }
        return inStock;
    }
    public abstract StockType getItemType();
    @Override
    public Boolean registerObserver(IObserver o){
        Boolean bInAdded = false;
        if (o!=null) {
            if(this.observers == null){
                this.observers = new ArrayList<>();
            }
            bInAdded = this.observers.add(o);
        }
        return bInAdded;
    }
    @Override
    public Boolean removeObserver(IObserver o){
        Boolean bInRemoved = false;
        if(o ==null){
            return bInRemoved;
        }
        bInRemoved = this.observers.remove(o);
        return bInRemoved;
    }
    @Override
    public void notifyObservers(){
        if(this.observers != null && this.observers.size() > 0){
            for(IObserver currentObserver : this.observers){
                currentObserver.update();
            }
        }
    }
}
