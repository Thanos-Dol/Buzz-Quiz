/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.ArrayList;
import java.util.HashMap;


public class Betting {
    private HashMap<Integer,Integer> b;
    /*
    Η Betting επιστρεφει το ποσο 
    των ποντων που θα παρει ο παικτης 
    αναλογα με το ποσο που πονταρε
    και με το αν νικησε η οχι.
    */
    public Betting()
    {
     //   b=new ArrayList();
        b=new HashMap<>();
        b.put(1,250);
        b.put(2,500);
        b.put(3,750);
        b.put(4,1000);
    }
    public int Bet(boolean ba,int bb)
    {
        int score;
        if(ba)
        {
            score=b.get(bb);
            //System.out.println(score);
            return score;
        }
        else
        {
            score=b.get(bb);
            //System.out.println(score);
            score=score*(-1);
            //System.out.println(score);
            return score;
        }
    }
    
}
