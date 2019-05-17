/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.impl;

import com.jsoftware.test.api.IShortAnswerQuestion;
import java.io.Serializable;

/**
 *
 * @author Ratna
 */
public class ShortAnswerQuestion extends Question implements IShortAnswerQuestion, Serializable {
    
    private String[] keywords;

    public ShortAnswerQuestion(String question, String[] keywords) {
        super(question);
        this.keywords = keywords;
    }

    @Override
    public boolean checkAnswer(String answer) {
       for(int i=0; i<keywords.length; i++){
           if(answer.contains(keywords[i])){
               return true;
           }
       }
       return false;
    }
   
    //Setkeyword and getkeyword
   public void setKeywords(String[] keywords) {
       this.keywords = keywords;
   }
   
   public String[] getKeywords() {
       return keywords;
   }
   
}
