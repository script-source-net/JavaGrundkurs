package ch.ibw.java.oop;

import ch.ibw.java.oop.lektion1.*;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wieviele Studenten sollen erstellt werden?");
        int countStud = sc.nextInt();
        Student[] students = new Student[countStud];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Vorname: ");
            String preName = sc.next();
            String fullName = name + " " + preName;
            System.out.println("Geburtsjahr: ");
            int birthDay = sc.nextInt();
            System.out.println("Matr. Nr.: ");
            int matrNr = sc.nextInt();
            System.out.println("Studienfach:");
            String subject = sc.next();
            var student = new Student(fullName, matrNr, birthDay, subject );
            students[i] = student;
        }
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Name/Vorname:");
        student.setName(sc.next());
        System.out.println("Nummer eingeben: ");
        student.setNumber(sc.nextInt());
         */
        for (Student s:students){
            System.out.println("***************" +
                    "\nName/Vorname: " + s.getName() +
                    "\nGeburtsjahr: " + s.getBirthYear() +
                    "\nMatrikelnummer: " + s.getNumber() +
                    "\nStudienfach: " + s.getSubject());
        }
        System.out.println("*******************" +
                "\nAnzahl Studenten: " + Student.getNumberOfStudents());
        /*
        System.out.println("Name/Vorname: " + student.getName() +
                "\nMatrikelnummer: " + student.getNumber() +
                "\nAnzahl Studenten: " + Student.getNumberOfStudents());

         */
        var student = new Student("Test test",12345);
        System.out.println(student.getBirthYear());
    }
}
