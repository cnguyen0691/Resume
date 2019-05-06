package com.company;

public class Skill {
    private String skills;
    private String progiciency;

    public Skill(){

    }
    public Skill(String skills, String progiciency){
        this.skills= skills;
        this.progiciency=progiciency;
    }
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getProgiciency() {
        return progiciency;
    }

    public void setProgiciency(String progiciency) {
        this.progiciency = progiciency;
    }

    @Override
    public String toString(){
        return this.skills + ": "+
                this.progiciency;
    }
}
