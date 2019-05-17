/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2onlinestore;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ratna
 */
public class ItemInventory {
    private ArrayList<ItemEntry>entries;
    
    //Constructor
    private ItemInventory(){
        entries = new ArrayList<>();
    }
    public static ItemInventory load(String fileName) throws IOException{
        //Input stream for file.
        FileInputStream fileInputStream = new FileInputStream(fileName);
        //Read line by line from input stream.
        
        Scanner s = new Scanner(fileInputStream);
        //Create a new instance.
        ItemInventory itemInventory = new ItemInventory();
        //Read inputStream of file until there is a next line.
        while (s.hasNextLine()){
           
            String line = s.nextLine();
            //String split
            String[] parts = line.split("\\|");
            
            String itemType = parts[0];
        
            String title = parts[1];

            double price;
            int quantity;
            //item entry instance for every line.
            ItemEntry itemEntry = null;
            //switch statement for Itemtype
            switch (itemType){
                case "music":
                    //fields of music file
                    price = Double.parseDouble(parts[8]);
                    quantity = Integer.parseInt(parts[9]);

                    String artist = parts[2];
                    //Date
                    Calendar calendar = Calendar.getInstance();
                    String[] datePart = parts[3].split("/");
                    int year = Integer.parseInt(datePart[2]);
                    int month = Integer.parseInt(datePart[0]);
                    int date = Integer.parseInt(datePart[1]);
                    //Date object.
                    calendar.set(year,month,date);
                    Date releaseDate = calendar.getTime();
                    String label = parts[4];
                    String recordedCompany = parts[5];
                    int totalLength = Integer.parseInt(parts[6]);
                    String genres = parts[7];

                    //Creating a music CD and then initialize itemEntry by musicCD and quantity.
                    MusicCD musicCD =
                            new MusicCD(title,price,artist,releaseDate,label,recordedCompany,totalLength,genres);
                    itemEntry = new ItemEntry(musicCD,quantity);
                    break;

                case "software":
                    price = Double.parseDouble(parts[3]);
                    quantity = Integer.parseInt(parts[4]);

                    String version = parts[2];
                    //Creating a software and then initialize itemEntry by software and their quantity.
                    Software software = new Software(title,price,version);
                    itemEntry = new ItemEntry(software,quantity);
                    break;

                case "book":
                    price = Double.parseDouble(parts[6]);
                    quantity = Integer.parseInt(parts[7]);

                    String author = parts[2];
                    String publisher = parts[3];
                    String edition = parts[4];
                    int pubYear = Integer.parseInt(parts[5]);
                    Book book = new Book(title,price,author,edition,publisher,pubYear);
                    //Creating a book and then initialize itemEntry by book and their quantity.
                    itemEntry = new ItemEntry(book,quantity);
                    break;
            }
            //Finally add the item entry to inventory list.
            itemInventory.entries.add(itemEntry);
        }
        //close the scanner.
        s.close();
        //close the input stream.
        fileInputStream.close();
        //return the itemInventory instance.
        return itemInventory;
    }

    //getter method.
    public ArrayList<ItemEntry> getEntries() {
        return entries;
    }
}
