/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.test;

import com.jsoftware.test.api.IQuestion;
import com.jsoftware.test.api.IQuestionFactory;
import com.jsoftware.test.api.IQuestionSet;
import com.jsoftware.test.impl.QuestionFactory;
import com.jsoftware.test.impl.QuestionSet;
import java.util.Scanner;

/**
 *
 * @author Ratna
 */
public class TestMaker {
      public static void main(String [] args){
              
       IQuestionFactory QuestionF = new QuestionFactory();
       IQuestionSet Question = new QuestionSet(); 
       boolean X;
       String r0, r1, r2, r3, q1, a1, nm;
       int choice, answer, number;
       Scanner s = new Scanner(System.in);
       
         System.out.println();
           
         System.out.print("Welcome to the TesrMaker program! \n\nWhat would you like to call this test? ");
         nm = s.nextLine();
   do{
          
           System.out.println();

           System.out.print("What would you like to do? \n 1) add a multiple-choice quetion \n 2) add a true/false question"
                   + "\n 3) add a fill-in-the-blank question \n 4) add short answer question \n 5) remove a question \n 6) exit program "
                   + "\nYour choice: ");
          
           choice = s.nextInt();
           if(choice==1){
               System.out.print("\nWhat is your multiple-choice question? \n");
               s.nextLine();
               q1 = s.nextLine();
              
               //create new string to hold multiple choices
               String[] a = new String[4];
               System.out.print("\nPlease enter your first choice: ");
               r0=s.next();
               a[0] = (r0);
              
               System.out.print("Please enter your second choice: ");
               r1=s.next();
               a[1] = (r1);
              
               System.out.print("Please enter your third choice: ");
               r2=s.next();
               a[2] = (r2);
              
               System.out.print("Please enter your fourth and last choice: ");
               r3=s.next();
               a[3] = (r3);
              
               System.out.print("What choice was the answer? (Enter #1-4) ");
               answer=s.nextInt();
               answer = answer - 1; 
               IQuestion I = QuestionF.makeMultipleChoice(q1, a, answer);
               //add the question to question set
               Question.add(I);              
           }
           
           //True or False
           if(choice==2){
               System.out.print("\nWhat is your True/False question? \n");
               s.nextLine();
               q1 = s.nextLine();
              
               System.out.print("\nWhat is the answer? (Please enter exactly true or false) \n");
              
               X = s.nextBoolean();
              
               //go into question factory to make the question
               IQuestion I = QuestionF.makeTrueFalse(q1,X);              
               Question.add(I);
           }
           //Fill in the blanks
           if(choice==3){
               System.out.print("\nWhat is your fill in the blank question? \n");
               s.nextLine();
               q1 = s.nextLine();
                      
               System.out.print("\nWhat is the answer? Please separate answers with a comma. \n");
                      
               a1 = s.nextLine();
                                      
               String[] keywords = (a1.split(","));                  
                      
               IQuestion I = QuestionF.makeFillInBlank(q1,keywords);
               Question.add(I);
           }
           //short answer question
           if(choice==4){
               System.out.print("\nWhat is your short answer question? \n");
               s.nextLine();
               q1=s.nextLine();
              
               System.out.print("\nHow many keywords does your short answer question have? \n");
               a1 = s.nextLine();
              
               String[] keywords = new String[4];
               System.out.print("\nWhat is a keyword in your short answer question? ");
               r0=s.next();
               keywords[0] = (r0);
              
               System.out.print("What is a keyword in your short answer question? ");
               r1=s.next();
               keywords[1] = (r1);
              
               System.out.print("What is a keyword in your short answer question? ");
               r2=s.next();
               keywords[2] = (r2);
              
               System.out.print("What is a keyword in your short answer question? ");
               r3=s.next();
               keywords[3] = (r3);
                      
               IQuestion I = QuestionF.makeShortAnswer(q1, keywords);
               Question.add(I);
              
           }
           if(choice==5){              
              
               System.out.print("\nSelect the index of the question you would like to remove. \n");
               for(int i=0; i<Question.size();i++){
                   System.out.println(i + ") " + Question.getQuestion(i).getQuestion());  
               }
              
               System.out.print("Enter number for question that is to be removed? "
                       + "(enter -1 to do nothing): ");
               choice = s.nextInt();
              
               if(choice != -1){
                   Question.remove(choice);
               }
              
               else{
                   continue;
               }
           }

       }while(choice !=6);

       QuestionF.save(Question, "question.ser");
       System.out.println("\nTest saved. \nGoodbye!");
      
      } 
}
