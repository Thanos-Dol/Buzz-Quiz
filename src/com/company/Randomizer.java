/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;


public class Randomizer {
    //επιστρεφει τυχαιο αριθμο απο δοσμενο ευρος με την 
    //δυνατοτητα να επαναλαμβανει τον ιδιο αριθμο αν τυχει
    public int random_number_in_range_repeat(int min,int max)
        {
           return ThreadLocalRandom.current().nextInt(min, max + 1);
        }
    //επιστρεφει ArrayList με τυχαιους αριθμους σε δοσμενο ευρος 
    //ετσι ωστε να μην υπαχει επαναληψη του ιδιου αριθμου
    public ArrayList<Integer> random_number_in_range_without_repeat(int min,int max)
    {
     int f;
     ArrayList<Integer> rn=new ArrayList();
     for (f=min;f<=max;f++)
        {
             rn.add(f);
        }
     Collections.shuffle(rn);
     return rn;
    }
    //Η GetInt περνει εναν Int απο την ArrayList τυχαιων αριθμων και τον αφαιρει απο αυτη.
    public int GetInt(ArrayList<Integer> k)
    {
        int i;
        i=k.get(0);
        k.remove(0);
        return i;
    }
    

}