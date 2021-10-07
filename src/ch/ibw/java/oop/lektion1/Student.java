package ch.ibw.java.oop.lektion1;

import java.util.Date;

public class Student {
    public static final int MATHEMATIKSTUDIUM = 1;
    public static final int INFORMATIKSTUDIUM = 2;
    public static final int ARCHITEKTURSTUDIUM = 3;
    public static final int WIRTSCHAFTLICHESSTUDIUM = 4;
    public static final int BIOLOGIESTUDIUM = 5;
    public static final int GESCHICHTSSTUDIUM = 6;
    public static final int GERMANIKSTUDIUM = 7;
    public static final int POLITOLOGIESTUDIUM = 8;
    public static final int PHYSIKSTUDIUM = 9;
    public static final int MAENNLICH = 1;
    public static final int WEIBLICH = 2;

    private String name;
    private int number;
    private int birthYear;
    private int fach;
    private int gender;
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
        setNumberOfStudents();
        setSubject(subject);
    }

    public static int getNumberOfStudents(){
        return numberOfStudents;
    }

    public static void setNumberOfStudents() {
        numberOfStudents++;
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
        if(isValidNumber()){
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
        if(isValidBirthYear()){
            this.birthYear = birthYear;
        }
        System.out.println("No valid birthday!");
        return this;
    }

    private boolean isValidNumber(){
        return number%2 != 0 && number >= 10000 && number <= 99999;
    }

    private boolean isValidBirthYear(){
        return birthYear >= 1930 && birthYear <= 2022;
    }
}
