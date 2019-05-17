/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.test;

import com.jsoftware.test.api.IQuestionFactory;
import com.jsoftware.test.api.IQuestionSet;
import com.jsoftware.test.impl.FillInBlanks;
import com.jsoftware.test.impl.MultipleChoice;
import com.jsoftware.test.impl.QuestionFactory;
import com.jsoftware.test.impl.ShortAnswerQuestion;
import com.jsoftware.test.impl.TrueFalseQuestion;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ratna
 */
public class TestTaker {
       public static void main(String[]args) throws IOException{
  
       IQuestionFactory QuestionF = new QuestionFactory();
  
       Scanner s = new Scanner(System.in);
       boolean tf;
       int answer;
       int correct = 0;
       int question = 0;
       String FIB, SA, nm;
      
       
       IQuestionSet QuestionS = QuestionF.load("question.ser");
       
      
       System.out.print("Enter 1 to take a whole test or 2 to take a sample test" + "\nYour choice: ");
       int choice = s.nextInt(); 
       
       System.out.print("\nWelcome to the TestTaker program! \nWhat test would you like to take? ");
       nm = s.nextLine();
       
       System.out.println("\nTest loaded successfully! \n");
      
       System.out.println("The test starts now! \n");
       if(choice==1){
           for(int i=0; i<QuestionS.size(); i++){
               System.out.println(i + ") " + QuestionS.getQuestion(i).getQuestion());
               question++;
              
               if(QuestionS.getQuestion(i) instanceof FillInBlanks){
                   System.out.println("\nFill in blank question\n");
                   System.out.print("Your answer: ");
                   s.nextLine();
                   FIB = s.nextLine();
                   String[] keywords = (FIB.split(" "));
                  
                   if(((FillInBlanks)QuestionS.getQuestion(i)).checkAnswer(keywords)==true){
                       correct++;
                       System.out.println("You got it!");
                   }
                   else{
                       System.out.println("Wrong!");
                   }
               }
              
              
               if(QuestionS.getQuestion(i) instanceof MultipleChoice){
                   System.out.println("\nMultiple Choice Question\n");
                  
                  
                   
                   System.out.println(((MultipleChoice) QuestionS.getQuestion(i)).getQuestion());
                  
                   String[] name = ((MultipleChoice) QuestionS.getQuestion(i)).getChoices();
                  
                   for(int i1=0; i1<4; i1++){
                       System.out.println(i1 + ")" + name[i1]);
                  
                  
                   }
                   System.out.print("What is your answer? ");
                   answer = s.nextInt();
                   if(((MultipleChoice)QuestionS.getQuestion(i)).checkAnswer(answer)==true){
                       correct++;
                       System.out.println("You got it!");
                   }
                   else{
                       System.out.println("Wrong!");
                   }
                  
               }
              
               if(QuestionS.getQuestion(i) instanceof ShortAnswerQuestion){
                   System.out.println("\nShort Answer question\n");
                   System.out.println(((ShortAnswerQuestion) QuestionS.getQuestion(i)).getQuestion());
                   System.out.print("Short answer: ");
                   s.nextLine();
                   SA = s.nextLine();
                  
                  
                   if(((ShortAnswerQuestion)QuestionS.getQuestion(i)).checkAnswer(SA)==true){
                       correct++;
                       System.out.println("You got it!");
                   }  
                   else{
                       System.out.println("Wrong!");
                   }
               }
              
               if(QuestionS.getQuestion(i) instanceof TrueFalseQuestion){
                   System.out.println("\ntrue/false question\n");
                   tf = s.nextBoolean();
                   if(((TrueFalseQuestion)QuestionS.getQuestion(i)).checkAnswer(tf)==true){
                       correct++;
                       System.out.println("You got it!");
                   }
                   else{
                       System.out.println("Wrong!");
                   }
               }      
           }
       }
       if(choice==2){
       System.out.print("\nWelcome to the TestTaker program! \nWhat test would you like to take? ");
       nm = s.nextLine();
       
       System.out.println("\nTest loaded successfully! \n");
           System.out.print("How many questions would you like? There are " + QuestionS.size() + " total questions: ");
           int option = s.nextInt();
           s.nextLine();
           System.out.println("The test starts now!");
          
           for(int i=0; i<option; i++){
               IQuestionSet X = QuestionS.randomSample(option);
               System.out.println(i + ") " + X.getQuestion(i));
               question++;
              
              
               if(X instanceof FillInBlanks){
                   System.out.println("Fill in blank question");
                   System.out.println(X.getQuestion(i));
                   System.out.print("Your answer: ");
                   FIB = s.nextLine();
                   String[] keywords = (FIB.split(" "));
                  
                   if(((FillInBlanks) X).checkAnswer(keywords)==true){
                       correct++;
                       System.out.println("You got it!");
                   }
                   else{
                       System.out.println("Wrong!");
                   }
               }
              
              
               if(X instanceof MultipleChoice){
                   System.out.println("Multiple Choice");
                   String[] name = (((MultipleChoice) X).getChoices());
                  
                   for(int i1=0; i1<4; i1++){
                       System.out.println(i1 + ")" + name[i1]);              
                   }
                  
                   System.out.print("What is your answer? ");
                   answer = s.nextInt();
                   if(((MultipleChoice) X).checkAnswer(answer)==true){
                       correct++;
                       System.out.println("You got it!");
                   }  
                   else{
                       System.out.println("Wrong!");
                   }
               }
              
               if(X instanceof ShortAnswerQuestion){
                   System.out.println("Short Answer question");
                   System.out.print("Short answer: ");
                   s.nextLine();
                   SA = s.nextLine();
                                      
                   if(((ShortAnswerQuestion) X).checkAnswer(SA)==true){
                       correct++;
                       System.out.println("You got it!");
                   }  
                   else{
                       System.out.println("Wrong!");
                   }
               }
              
               if(X instanceof TrueFalseQuestion){
                   System.out.println("true/false");
                   tf = s.nextBoolean();
                   if(((TrueFalseQuestion) X).checkAnswer(tf)==true){
                       correct++;
                       System.out.println("You got it!");
                   }
                   else{
                       System.out.println("Wrong!");
                   }
               }      
           }
       }
       System.out.println("Total amount correct: " + correct);
       System.out.println("Total amount of questions: " + question);
   }
}
