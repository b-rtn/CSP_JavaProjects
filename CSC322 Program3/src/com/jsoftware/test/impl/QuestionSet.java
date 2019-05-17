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
import com.jsoftware.test.api.IQuestion;
import java.io.Serializable;
import com.jsoftware.test.api.IQuestionSet;
import java.util.ArrayList;

public class QuestionSet implements IQuestionSet, Serializable {
    
    ArrayList<IQuestion> list = new ArrayList<>();

    @Override
    public IQuestionSet emptyTestSet() {
       list.clear();
       return this;
    }

    @Override
    public IQuestionSet randomSample(int size) {
        IQuestionSet Ques = new QuestionSet(); 
        
        int[] Qs = new int[size];
        int i = 0;
        
        while(i<size){
            int random = ((int)(Math.random()*size()));
            for(int j = 0; j<size; j++){
                if(random != Qs[j]){
                Ques.add(getQuestion((int)(Math.random()*size())));
                i++;
                }
            }
        }
        return Ques;
    }

    @Override
    public boolean add(IQuestion question) {
        list.add(question);
        return true;
    }

    @Override
    public boolean remove(int index) {
       list.remove(index);
       return true;
    }

    @Override
    public IQuestion getQuestion(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }
    
}
