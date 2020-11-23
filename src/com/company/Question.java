/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class Question {
    protected int questionID;
    protected ArrayList<String> answers;
    protected String question;
    protected String correctAnswer;
    protected String questionCatergory;
    protected int questionPoints;

    //creator
    public Question(String qc,String nq,ArrayList<String> na,String nca,int qi)
    {
        questionCatergory=qc;
        questionID =qi;
        answers =na;
        question =nq;
        correctAnswer =nca;
        //System.out.println(q);
        //System.out.println(ca);
    }
    //επιστρεφει την απαντηση στη θεση του ArrayList που δινετε
    public String GetAns(int s)
    {
      return  answers.get(s);
    }
    //μπερδευει τις απαντησεις
    public void ShuffleAnswers()
    {
        Collections.shuffle(answers);
    }
    //ελενχει αν η απαντηση που δινετε ειναι σωστη η οχι
    public boolean IsCorrect(String d)
    {
        if (d.equals(correctAnswer))
            return true;
        else
            return false;
    }
    //επιστρεφει την ερωτηση
    public String GetQuestion()
    {
        return question;
    }
    public String GetCategory(){return questionCatergory;}
    public void SetCategory(String qc){questionCatergory=qc;}
    public int GetPoint(){return questionPoints;}
    public void SetPoint(int p){ questionPoints =p;}
    public void DisplayQuestion(){
        System.out.println("Category:" + questionCatergory);
        System.out.println();
        System.out.println(question);
        ShuffleAnswers();
        System.out.println(answers.get(0));
        System.out.println(answers.get(1));
        System.out.println(answers.get(2));
        System.out.println(answers.get(3));

    }



}
