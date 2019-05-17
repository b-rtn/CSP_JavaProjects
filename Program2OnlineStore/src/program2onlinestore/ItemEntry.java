/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2onlinestore;

/**
 *
 * @author Ratna
 */
public class ItemEntry {
   
    //data fields
    private Item item;
    private int quantity;
    
    //Constructor
    public ItemEntry(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    //methods
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    } 
}
