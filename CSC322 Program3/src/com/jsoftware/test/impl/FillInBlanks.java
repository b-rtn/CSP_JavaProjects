/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.impl;

/**
 *
 * @author Ratna
 */
import java.io.Serializable;
import com.jsoftware.test.api.IFillInBlanksQuestion;

public class FillInBlanks extends Question implements IFillInBlanksQuestion, Serializable {

  
    private String[] answer;
    
    //Constructor
    public FillInBlanks(String question, String[] answer) {
        super(question);
        this.answer = answer;
    }

    //CheckAnswer
    @Override
    public boolean checkAnswer(String[] keywords) {
       for(int i = 0; i<answer.length; i++){
           if(keywords[i].equalsIgnoreCase(answer[i])){
               return true;
           }
       }
       if(answer.length != keywords.length){
            return false;
       } 
       return false;
    } 
}
