/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.impl;

import com.jsoftware.test.api.ITrueFalseQuestion;
import java.io.Serializable;

/**
 *
 * @author Ratna
 */
public class TrueFalseQuestion extends Question implements ITrueFalseQuestion, Serializable {

    private boolean answer;
    
    //Constructor
    public TrueFalseQuestion(String question, boolean answer) {
        super(question);
        this.answer = answer;
    }

    //Check Answer
    @Override
    public boolean checkAnswer(boolean answer) {
       if(answer == answer){
           return true;
       }      
       return false;
    }
    
    //setAnswer method
    public void setAnswer(boolean answer){
        this.answer = answer;
    }
    
    //getAnswer method
    public boolean getAnswer(){
        return answer;
    }
}
