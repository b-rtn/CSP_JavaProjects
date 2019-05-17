/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2onlinestore;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ratna
 */
public class OnlineStore {
    private static final String FILE_PATH = "C:\\Users\\Ratna\\Documents\\NetBeansProjects\\Concordia\\Program2OnlineStore\\Week2Project.txt";

    private ItemInventory itemInventory;
    
    public void start() throws IOException{
        //Load method
        itemInventory = ItemInventory.load(FILE_PATH);
        
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            //Main menu.
            System.out.println("Welcome to eMart");
            System.out.println("1) Show all items.");
            System.out.println("2) Show only music CDs.");
            System.out.println("3) Show only books.");
            System.out.println("4) Show only software.");
            System.out.println("5) Exit program.");
            System.out.print("Your Choice[1-5]: ");
            
            int n = scanner.nextInt();
            
            if(n==5)
                break;
            //header.
            printHeader();
            
            //Switch statement to allow the user to enter the seletion of their choice 
            //and display the ouptput.
            switch (n){
                case 1:
                    for (ItemEntry itemEntry:itemInventory.getEntries()) {
                        printItem(itemEntry);
                    }
                    break;
                    
                case 2:
                    for (ItemEntry itemEntry:itemInventory.getEntries()) {
                        if(itemEntry.getItem() instanceof MusicCD){
                            printItem(itemEntry);
                        }
                    }
                    break;

                case 3:
                    for (ItemEntry itemEntry:itemInventory.getEntries()) {
                        if(itemEntry.getItem() instanceof Book){
                            printItem(itemEntry);
                        }
                    }
                    break;

                case 4:
                    for (ItemEntry itemEntry:itemInventory.getEntries()) {
                        if(itemEntry.getItem() instanceof Software){
                            printItem(itemEntry);
                        }
                    }
                    break;

                default:
                    //Prompts user to enter the valid option
                    System.out.println("Invalid option. Please select the valid option.");

            }
        }
    }

    //Heading
    private void printHeader() {
        System.out.printf("%-30s %10s %10s %10s\n", "Title", "Type", "Price", "Quantity");
    }
    //Rows
    private void printItem(ItemEntry itemEntry){
        Item item = itemEntry.getItem();
        System.out.printf("%-30s %10s %10.2f %10d\n", item.getTitle(),
                OnlineStore.getType(item), item.getPrice(), itemEntry.getQuantity());
    }

    //static method to get the name of itemType.
    private static String getType(Item item) {
        if(item instanceof Book)
            return "book";
        if(item instanceof MusicCD)
            return "music";
        if(item instanceof Software)
            return "software";
        return "unknown";
    } 
}
