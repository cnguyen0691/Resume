package com.company;


public class Recruiter {


    private String key;

    public Recruiter(){

    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    @Override
    public String toString(){
        return this.key;
    }

}
