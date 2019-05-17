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
public class Software extends Item{
    
    //data fields
    private String version;
    
    //Constructor
    public Software(String title, double price, String version) {
        super(title, price);
        this.version = version;
    }
    
    //method
     public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
