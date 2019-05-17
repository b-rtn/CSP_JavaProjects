/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsoftware.test.impl;

import com.jsoftware.test.api.IQuestion;
import com.jsoftware.test.api.IQuestionFactory;
import com.jsoftware.test.api.IQuestionSet;
import java.io.IOException;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Ratna
 */
public class QuestionFactory implements IQuestionFactory, Serializable {

    @Override
    public IQuestion makeMultipleChoice(String question, String[] choices, int answer) {
        IQuestion q = new MultipleChoice(question, choices, answer);
        return q;
    }

    @Override
    public IQuestion makeTrueFalse(String question, boolean answer) {
        IQuestion q = new TrueFalseQuestion(question, answer);
        return q;
    }

    @Override
    public IQuestion makeFillInBlank(String question, String[] answers) {
        IQuestion q = new FillInBlanks(question, answers);
        return q;
    }

    @Override
    public IQuestion makeShortAnswer(String question, String[] keywords) {
       IQuestion q = new ShortAnswerQuestion(question, keywords);
       return q;
    }

    @Override
    public IQuestionSet load(String filename) throws IOException {
        
        try{
            FileInputStream fs = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fs);
            Object o = in.readObject();
            if (o instanceof IQuestionSet) return (IQuestionSet) o;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
            return null;
    }

    @Override
    public boolean save(IQuestionSet testSet, String filename) {
        
        try{
            FileOutputStream fs = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fs);
            out.writeObject(testSet);
            out.close();      
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public IQuestionSet makeEmptyQuestionSet() {
       return null;
    }
    
}
