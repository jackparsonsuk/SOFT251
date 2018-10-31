/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.*;

/**
 *
 * @author jparsons12
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StockItem objTestItem1 = new PhysicalStockItem("Starcraft Manual");
        StockItem objTestItem3 = new ServiceStockItem("Delivery");
        AnObserver obv = new AnObserver();
        objTestItem1.registerObserver(obv);
        objTestItem3.registerObserver(obv);
        System.out.println("Changing quantity of the physical stock item");
        objTestItem1.setQuantityInStock(22);
        System.out.println("Changing quantity of the service stock item");
        objTestItem3.setQuantityInStock(22);

        
                
    }
    
}

