/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;


public class Player {
    private String name;
    private int score;
    private int wins;
    public Player(String n)
    {
        wins=0;
        name=n;
        score=1000;
    }
    //προσθετει τον αριθμο που δινετε στο γενικο σκορ του παικτη
    public void ChangeScore(int ch)
    {
        score+=ch;
    }
    //επιστρεφει το σκορ του παικτη
    public int GetScore()
    {
        return score;
    }
    //επιστρεφει το ονομα του παικτη
    public String GetName()
    {
        return name;      
    }

    public  void SetWins(){this.wins++;}
    public  int GetWins(){return wins;}
}
