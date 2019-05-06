package com.company;

public class Personal {
    private String Name;
    private String Email;
   private String Phone;


    public Personal(String Name, String Email, String Phone) {
        this.Name = Name;
        this.Email = Email;
        this.Phone=Phone;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }



    @Override
    public String toString(){
        return "Information: " + "\n" + getName()+"\n"+
                getEmail() + "\n" + getPhone();
    }

}