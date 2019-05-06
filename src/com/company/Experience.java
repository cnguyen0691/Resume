package com.company;

public class Experience {
    private String Company;
    private String jobTitle;
    private String jobDescription;
    private String startDate;
    private String endDate;
    public Experience(){

    }

    public Experience(String Company, String jobTitle, String jobDescription, String startDate, String endDate){
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

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
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

    @Override
    public String toString(){
        return  this.Company + "\n "+
                this.jobTitle+"\n "+
                this.jobDescription+ "\n "+
                this.startDate+"\n "+
                this.endDate;
    }

}
