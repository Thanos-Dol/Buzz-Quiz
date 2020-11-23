/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package com.company;

import java.util.ArrayList;


public class CategoryControl {
    private Math m;
    private Sports s;
    private History h;
    private Randomizer ran;
    public CategoryControl()
    {
        m=new Math();
        s=new Sports();
        h=new History();
        ran=new Randomizer();
    }
    //επιστρεφει ενα ArrayList με τυχαιες ερωτησεις απο τις 3 κατηγοριες
    public ArrayList<Question> GetQuestions()
    {
        int k;
        int l;
        int j;
        ArrayList<Question> tq = new ArrayList();
        ArrayList<Integer> r1 = new ArrayList();
        ArrayList<Integer> r2 = new ArrayList();
        ArrayList<Integer> r3 = new ArrayList();
        r1=ran.random_number_in_range_without_repeat(1,5);
        r2=ran.random_number_in_range_without_repeat(1,5);
        r3=ran.random_number_in_range_without_repeat(1,5);
        for (k=0;k<6;k++)
        {
            l=ran.random_number_in_range_repeat(1,3);
            if (l==1)
            {
                j=ran.GetInt(r1);
                
                //System.out.println(j);
                //System.out.println(m.GetQuestion(j));
                m.GetQuestion(j).ShuffleAnswers();
                tq.add(m.GetQuestion(j));
                
            }
            else if(l==2)
            {
                j=ran.GetInt(r2);
                
                //System.out.println(j);
                //System.out.println(s.GetQuestion(j));
                s.GetQuestion(j).ShuffleAnswers();
                tq.add(s.GetQuestion(j));
            
            }
            else if (l==3)
            {
                j=ran.GetInt(r3);
                
                //System.out.println(j);
                //System.out.println(h.GetQuestion(j));
                h.GetQuestion(j).ShuffleAnswers();
                tq.add(h.GetQuestion(j));
            
            }
            else
            {
                System.out.println("σφαλμα ΠΑΡΑ ΠΟΛΥ ΜΕΓΑΛΟ!");
            }
                
        }
        return tq;
    }
            
    
}

 */
