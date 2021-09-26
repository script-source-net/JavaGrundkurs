package ch.ibw.java.oop.lektion1;

import java.util.Date;

public class Student {
    private String name;
    private int number;
    private int birthYear;
    private String subject;
    private static final String GENDER = "";
    private static int numberOfStudents;

    public Student(String name, int number){
        birthYear = 1987;
        this.name = name;
        this.number = number;
    }

    public Student(String name, int number, int birthYear, String subject) {
        this.name = name;
        setNumber(number);
        setBirthYear(birthYear);
        setNumberOfStudents(1);
        setSubject(subject);
    }

    public static int getNumberOfStudents(){
        return numberOfStudents;
    }

    public static void setNumberOfStudents(int numberOfStudents) {
        Student.numberOfStudents += numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Student setNumber(int number) {
        if(isValidNumber(number)){
            this.number = number;
        } else {
            System.out.println("Number is not valid!");
        }
        return this;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getSubject() {
        return subject;
    }

    public Student setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Student setBirthYear(int birthYear) {
        if(isValidBirthYear(birthYear)){
            this.birthYear = birthYear;
        }
        System.out.println("No valid birthday!");
        return this;
    }

    private boolean isValidNumber(int number){
         return number%2 != 0 && number > 1000 && number < 99999;
    }

    private boolean isValidBirthYear(int birthYear){
        return birthYear > 1930 && birthYear < 2022;
    }
}
