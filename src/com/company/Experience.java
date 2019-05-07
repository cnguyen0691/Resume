package com.company;

import java.util.ArrayList;

public class Experience {
    private String Company;
    private String jobTitle;
    private ArrayList<String> jobDescription;
    private String startDate;
    private String endDate;
    public Experience(){

    }

    public Experience(String Company, String jobTitle, ArrayList<String> jobDescription, String startDate, String endDate){
        this.Company= Company;
        this.jobTitle=jobTitle;
        this.jobDescription=jobDescription;
        this.startDate=startDate;
        this.endDate=endDate;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getJobDescription() {
        return jobDescription;
    }

    public void addDescr(String descr){
        jobDescription.add(descr);
    }

    public void setJobDescription(ArrayList<String> jobDescription) {
        this.jobDescription = jobDescription;
    }


    @Override
    public String toString(){
        return  getCompany() + "\n "+
                getJobTitle()+"\n "+
                getJobDescription()+ "\n "+
                getStartDate()+"\n "+
                getEndDate();
    }

}
