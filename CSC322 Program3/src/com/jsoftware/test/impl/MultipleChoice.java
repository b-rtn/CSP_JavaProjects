/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.impl;

import com.jsoftware.test.api.IMultipleChoiceQuestion;
import java.io.Serializable;

/**
 *
 * @author Ratna
 */
public class MultipleChoice extends Question implements IMultipleChoiceQuestion, Serializable {
    
    private String[] choices;
    private int answer;

    //Constructor
    MultipleChoice(String question, String[] choices, int answer) {
        super(question);
        this.choices = choices;
        this.answer = answer;
    }

    //CheckAnswer 
    @Override
    public boolean checkAnswer(int index) {
       if(answer == index){
           return true;
       }      
       return false;
    }
    
    //setChoices method
   public void setChoices(String[] choices){
        this.choices = choices;
    }
    
   //getChoices method
    public String[] getChoices(){
    return choices;
    }
    
    //setAnswer method
    public void setAnswer(int answer){
        this.answer = answer;
    }
    
    //getAnswer method
    public int getAnswer(){
        return answer;
    }
    
}
