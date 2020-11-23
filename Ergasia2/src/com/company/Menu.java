/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Menu {
    Scanner s;
    ArrayList<Question> gameQuestions;
    ArrayList<String> questionCategories;
    public Menu()
    {
        s= new Scanner(System.in , "ISO-8859-7");
        gameQuestions = new ArrayList<>();
        questionCategories = new ArrayList<>();
    }
   /*
       Η λειτουργια Start ξεκιναει το μενου 
       και κατ επεκταση ολο του παιχνιδι
    */
    public void GetQuestions() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("QuizQuestions.csv"));
        String row;
        String q,ca,qc;
        int id=0;
        while ((row =  csvReader.readLine()) != null) {
            String[] data = row.split(";");
            qc=data[0];
            if(!questionCategories.contains(qc))
                questionCategories.add(qc);
            q=data[1];
            ArrayList<String> ans = new ArrayList<>();
            ans.add(data[2]);
            ans.add(data[3]);
            ans.add(data[4]);
            ans.add(data[5]);
            ca=data[6];
            id++;
            Question q1 = new Question(qc,q,ans,ca,id);
            //q1.DisplayQuestion();
        }
        csvReader.close();
    }
    public void Start() throws IOException {
        //Betting bet=new Betting();
        //CorrectAnswer ca=new CorrectAnswer();
        GetQuestions();

        /*
        String name;
        String qca;
        //ArrayList<String> Ans;//Σε αυτο το ArrayList αποθηκευουμε τις απαντησεις σε τυχαια σειρα της ερωτησης που θα κανει το παιχνιδι σε καθε γυρο ξεχωριστα σε 1 παιχνιδι
        Randomizer ran=new Randomizer();
        //CategoryControl cc=new CategoryControl();
        ArrayList<Question> tq = new ArrayList();//Σε αυτο το ArrayList Αποθηκευουμε ολες τις ερωτησεις που θα μπουν σε 1 παιχνιδι
                
        boolean c;
        int f,f1;
        int choice=0;
        int menuchoice=0;
        int roundmod;
        int betmod=0;
        int scorechange;

        System.out.println("Πως λεγεσε;");
        name=this.GetString();
        Player p1=new Player(name);//Εδω περνω ονομα παικτη 1 
        System.out.println("Καλος ηρθες " +p1.GetName()+ " στο ΓΕΝΙΚΟ ΠΑΙΧΝΙΔΙ 0.1.0");
        while (menuchoice!=2)//Εδω ξεκιναει το παιχνιδι 
        {
            System.out.println("1. Ξεκινησε το παιχνιδι");
            System.out.println("2. Εξοδος");
            System.out.println("Πατησε τον αριθμο διπλα απο την επιλογη που θες.");
            menuchoice=this.Getint();
            
            if (menuchoice==1)
            {
                tq=cc.GetQuestions();
                System.out.println("Λοιπον " +p1.GetName()+" μολις ξεκινησες ενα καινουριο παιχνιδι και εχεις σκορ " +p1.GetScore());
                for(f=0;f<6;f++)//Εδω ξεκινανε οι γυροι του παιχνιδιου
                {
                    roundmod=ran.random_number_in_range_repeat(1,2);//επιλογη τυπου παιχνιδιου
                    if(roundmod==2)
                    {
                        System.out.println("Τυπος γυρου: Πονταρισμα");
                    }
                    else
                    {
                        System.out.println("Τυπος γυρου: Σωστη Απαντηση");
                    }
                    System.out.println("Η ερωτηση ειναι η...:");
                    System.out.println(tq.get(f).GetQuestion());
                    if(roundmod==2)
                    {
                        System.out.println("Τι ποσο θα ηθελες να πονταρεις;");
                        System.out.println("1. 250");
                        System.out.println("2. 500");
                        System.out.println("3. 750");
                        System.out.println("4. 1000");
                        System.out.println("Πατα τον αριθμο που υπαρχει διπλα απο το ποσο που θες να πονταρεις.");
                        betmod=this.Getint();//επιλογη ποσου για πονταρισμα
                        while (betmod<1||betmod>4)
                        {
                            System.out.println("Η επιλογη σου ΔΕΝ υπαχει, δοκιμασε ξανα...");
                            System.out.println("Τι ποσο θα ηθελες να πονταρεις;");
                            System.out.println("1. 250");
                            System.out.println("2. 500");
                            System.out.println("3. 750");
                            System.out.println("4. 1000");
                            betmod=this.Getint();
                        }
                    }
                    else
                    {
                        System.out.println("Αν απαντησεις σωστα κερδιζεις 1000 ποντους, αν οχι χανεις 1000 ποντους.");
                    }
                    //System.out.println(" ");
                    System.out.println("οι απαντησεις ειναι οι...:");
                    for(f1=0;f1<=3;f1++)//εμφανηζει τις απαντησεις
                    {
                        System.out.println((f1+1)+ ". " +tq.get(f).GetAns(f1));
                    }
                    System.out.println("Διαλεξε την σωστη απαντηση και πληκτρολογησε τον αριθμο που βρησκετε διπλα της");
                    choice=this.Getint()-1;
                    while (choice<0 || choice>3)
                    {
                      System.out.println("οι απαντησεις ειναι 4 και οι επιλογες ειναι 1, 2, 3 και 4");
                      choice=this.Getint()-1;
                    }
                    c=tq.get(f).IsCorrect(tq.get(f).GetAns(choice));
                    this.isCorrect(c);
                    if (roundmod==1)
                    {
                       scorechange=ca.CorrectAns(c);
                       p1.ChangeScore(scorechange);
                       System.out.println("το ανανεομενο σκορ σου ειναι " +p1.GetScore());
                    }
                    else if(roundmod==2)
                    {
                        scorechange=bet.Bet(c,betmod);
                        p1.ChangeScore(scorechange);
                        System.out.println("το ανανεομενο σκορ σου ειναι " +p1.GetScore());
                    }
            
                }
                tq.clear();//κανουμε clear την arraylist tq για να μπορουμε να δεχτουμε αλλες απαντησεις για καινουργιο παιχνιδι
            }
            else if (menuchoice==2)
            {
                System.out.println("Καλη συνεχεια...");
            }
            else
            {
                System.out.println("αυτη η επιλογη ΔΕΝ υπαρχει...διαλεξε ξανα");
            }
        }
        */

    }


    // Η Getint δεχετε αριθμητικο ινπουτ απο τον χρηστη
    public int Getint()
    {
        int d;
        d=s.nextInt();
        s.nextLine();
        return d;
    }
    // Η GetString δεχετε γραμματικο ινπουτ απο τον χρηστη
    public String GetString()
    {
        String d;
        d=s.nextLine();
        return d;
    }
    
    // βγαζει σωστη απαντηση αν η μεταβλητη εισοδου ειναι τρου αλλιως βγαζει λαθος απαντηση
    public void isCorrect(boolean d)
    {
        if (d)
            System.out.println("Σωστη απαντηση");
        else
            System.out.println("Λαθος απαντηση");
    }
}