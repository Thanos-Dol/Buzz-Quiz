package com.company;

import java.util.ArrayList;

public class Bet extends Question {

    public Bet(String qc,String nq,ArrayList<String> na,String nca,int qi, int qp)
    {

        super(qc,nq,na,nca,qi);
        this.questionPoints=qp;

    }

}
