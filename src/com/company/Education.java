package com.company;

public class Education {
    private String degree;
    private String university;
    private String major;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;

    public Education(){
    }

    @Override
    public String toString(){
        return this.getDegree()+"\n"+
                this.getUniversity() + "\n" +
                this.getMajor()+ "\n" +
                this.getYear()+ "\n";
    }

}