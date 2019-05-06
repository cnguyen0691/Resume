package com.company;

import java.util.ArrayList;

public class Data {

    private Personal p;
    private ArrayList<Education> e;
    private ArrayList<Experience> job;

   private ArrayList<Skill> s;

// ArrayList<Education> e, ArrayList<Experience> job,
    public Data( Personal p, ArrayList<Skill> s){
      this.p = p;
//      this.e = e;
//            this.job = job;
        this.s = s;
    }
    public Personal getP() {
        return p;
    }

    public void setP(Personal p) {
        this.p = p;
    }

    public ArrayList<Skill> getS() {
        return s;
    }

    public void setS(ArrayList<Skill> s) {
        this.s = s;
    }



    @Override
    public String toString(){
        return "Data: " +getP()+"\t" + getS()+ "\n";
    }


}