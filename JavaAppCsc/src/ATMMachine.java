
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ratna
 */
public class ATMMachine {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        
        Account[] accounts = new Account[10];
        for (int i = 1; i < 11; i++){
           accounts[i-1] = new Account(i,100.0); 
        }
        
        System.out.print("Enter the account id: ");
        int id = s.nextInt();
        
        while(id >= 1 || id <= 10)
        {
            System.out.println("Main Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Account Information");
            System.out.println("5 Exit (choose a different account)");
            System.out.print("Please make a selecetion: ");
            int n = s.nextInt();
            switch(n)
            {
                case 2:
                System.out.print("Enter the amount to withdraw: ");
                accounts[id - 1].withdraw(s.nextDouble());
               /* withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println(""); */
                break;
 
                case 3:
                System.out.print("Enter the amount to deposit: ");
                accounts[id - 1].deposit(s.nextDouble());
               /* deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println(""); */
                break;
 
                case 1:
                System.out.printf("The balance is $%.1f%n",
                                 accounts[id - 1].getBalance());
                System.out.println("");
                break;
                
                case 4: 
                System.out.println("Account was created on: ");
                System.out.println("Account interest rate is: ");
                System.out.println("Account Balance is: ");
                System.out.println("");
                
                case 5:
                System.exit(0);
            }
            
            System.out.print("Please enter a valid id: ");
            id = s.nextInt();
            System.out.println();
        }
    }   
}
