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
public class Item {
    
    private String title;
    private double price;
    
    //Constructor
    public Item(String title, double price) {
        this.title = title;
        this.price = price;
    }

    //Accessor and mutator for title and price

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
