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
public class Book extends Item{
    
    private String author;
    private String edition;
    private String publisher;
    private int pubYear;
    
    //Constructor
    public Book(String title, double price, String author, String edition, String publisher, int pubYear) {
        super(title, price);
        this.author = author;
        this.edition = edition;
        this.publisher = publisher;
        this.pubYear = pubYear;
    }

    //Accessor/mutator
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }
    
}
