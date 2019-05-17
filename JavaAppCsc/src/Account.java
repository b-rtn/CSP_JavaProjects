
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ratna
 */
public class Account {
    
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    public Account(){
        
    }
    
  public Account(int newId, double newBalance) {
  
      id = newId;
      balance = newBalance;
      
  }
  
  public Account(int newId, double newBalance, double newAnnualInterestRate){
      id = newId;
      balance = newBalance;
      annualInterestRate = newAnnualInterestRate;
  }
  
  //accessor/mutator methods for id, balance, and annualInterestRate
  public int getId(){
     return id;
  }
  
  public double getBalance(){
    return balance;
  }
  
  public double getAnnualInterestRate(){
      return annualInterestRate;
  }
  
  public void setId(int newId){
      id = newId;
  }
  
  public void setBalance(double newBalance){
      balance = newBalance;
  }
  
  public void setAnnualInterestRate(double newAnnualInterestRate){
      annualInterestRate = newAnnualInterestRate;
  }
  
  //accessor method for dateCreated
  public void setDateCreated(Date newDateCreated){
      dateCreated = newDateCreated;
  }
  
  //withdraw method
  double withdraw(double amount){
      return balance -= amount;
  }
  
  //deposit method
  double deposit(double amount){
      return balance += amount;
  }
}
