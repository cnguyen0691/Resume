package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ans = false;
        String resume = "";
        ArrayList<Data> dataList = new ArrayList<Data>();
        //Input resume
        while (!ans) {
            System.out.println("Do you have a resume:(y/n) ");
            resume = input.next();
            //Personal Information
            if (resume.equalsIgnoreCase("n")) {
                System.out.println("Your Name: ");
                String inputName = input.next();
                System.out.println("Email Address: ");
                String inputEmail = input.next();
                System.out.println("Phone number: ");
                String inputPhone = input.next();
                Personal person1 = new Personal(inputName, inputEmail, inputPhone);
                //Education
                System.out.println("Enter number of degrees: ");
                int inputNumDeg = input.nextInt();
                ArrayList<Education> eduList = new ArrayList();
                for (int x = 1; x <= inputNumDeg; x++) {
                    Education edu = new Education();
                    System.out.println("Enter degree" + x + " : ");
                    edu.setDegree(input.next());
                    System.out.println("Enter university" + x + " : ");
                    edu.setUniversity(input.next());
                    System.out.println("Enter major" + x + " : ");
                    edu.setMajor(input.next());
                    System.out.println("Enter year" + x + " : ");
                    edu.setYear(input.nextInt());
                    eduList.add(edu);
                }
                //Experience
                System.out.println("Enter number of job: ");
                int inputNumJob = input.nextInt();
                ArrayList<Experience> job = new ArrayList();
                for (int x = 1; x <= inputNumJob; x++) {
                    Experience exp = new Experience();
                    System.out.println("Enter Name Company" + x + " : ");
                    exp.setCompany(input.next());
                    System.out.println("Enter Job Titile" + x + " : ");
                    exp.setJobTitle(input.next());
                    System.out.println("Enter Job Duty" + x + " : ");
                    exp.setJobDescription(input.next());
                    System.out.println("Enter start year" + x + " : ");
                    exp.setStartDate(input.next());
                    System.out.println("Enter end year" + x + " : ");
                    exp.setEndDate(input.next());
                    job.add(exp);
                }

                //Skill
                System.out.println("Enter number of skills: ");
                int inputNumSkill = input.nextInt();
                ArrayList<Skill> skill = new ArrayList();
                for (int x = 1; x <= inputNumSkill; x++) {
                    Skill sk = new Skill();
                    System.out.println("Enter skill" + x + " : ");
                    sk.setSkills(input.next());
                    System.out.println("Enter proficience" + x + " : ");
                    sk.setProgiciency(input.next());
                    skill.add(sk);
                }
                //Print out Resume
                System.out.println("==========================================");
                System.out.println(person1);
                for (Education eduItem : eduList) {
                    System.out.println("Education: " + "\n" + eduItem);
                }
                for (Experience expItem : job) {
                    System.out.println("Experience: " + "\n" + expItem);

                }
                for (Skill skItem : skill) {
                    System.out.println("Skill: " + "\n" + skItem);

                }
                Data data = new Data(person1, skill);
                dataList.add(data);


            } else if (resume.equalsIgnoreCase("y")) {
                System.out.println("Good Luck");
                break;
            }
        }
        //Allow a person to change their name, e-mail address and/or phone number
        System.out.println("Do you wanna change information?(y/n):");
        String fixResume = input.next();
        String change = "";

        if (fixResume.equalsIgnoreCase("y")) {
            System.out.println("Your Name: ");
            String putName = input.next();
            System.out.println("Do you want to change which information:(Name, Email, Phone): ");
            String c = input.next();
            for (int i = 0; i < dataList.size(); i++) {
                if (putName.equalsIgnoreCase(dataList.get(i).getP().getName())) {
                    if (c.equalsIgnoreCase("name")) {
                        System.out.println("Enter new Name: ");
                        change = input.next();
                        if (dataList.get(i).getP().getName().contains(putName)) {
                            dataList.get(i).getP().setName(change);

                        }
                    } else if (c.equalsIgnoreCase("email")) {
                        System.out.println("Enter new Email: ");
                        String newEmail = input.next();
                        if (dataList.get(i).getP().getName().contains(putName)) {
                            dataList.get(i).getP().setEmail(newEmail);
                        }
                    } else if (c.equalsIgnoreCase("Phone")) {
                        System.out.println("Enter new Phone: ");
                        String newPhone = input.next();
                        if (dataList.get(i).getP().getName().contains(putName)) {
                            dataList.get(i).getP().setPhone(newPhone);
                        }
                    }
                }
                System.out.println(dataList.get(i));
            }

        }  else if (fixResume.equalsIgnoreCase("n")) {
            System.out.println("Thank you");
        }


            //Recruiter looking for candidate
        System.out.print("Are you a recruiter?(y/n): ");
        String keys = input.next();
        Recruiter key = new Recruiter();
        int count = 0;
        if (keys.equalsIgnoreCase("y")) {
            System.out.println("Enter the key: ");
            key.setKey(input.next());

            String keyword = key.getKey();
            HashMap<String, ArrayList<Data>> map = new HashMap<>();
            map.put(keyword, dataList);
            for (Data s : dataList) {
                for (int i = 0; i < s.getS().size(); i++) {
                    if (keyword.equalsIgnoreCase(s.getS().get(i).getSkills())) {
                        System.out.println(s.getP() + "\n" + s.getS());
                        count++;

                    }
                }
            }
            if (count == 0) {
                System.out.println("Not found keyword");
            }
        }
        else {
            System.out.println("Have a good day!");
        }
    }
}









