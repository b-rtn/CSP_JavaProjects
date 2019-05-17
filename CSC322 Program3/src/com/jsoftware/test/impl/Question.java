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
import com.jsoftware.test.api.IQuestion;

public class Question implements IQuestion, Serializable{
    //Instantio
    private String question;
    
    public Question(String question){
    this.question = question;
    }
    
    //Setter
    private void setQuestion(String question){
    this.question = question;
    }
    
    //getter
    public String getQuestion(){
        return question;
    }   
    
}
