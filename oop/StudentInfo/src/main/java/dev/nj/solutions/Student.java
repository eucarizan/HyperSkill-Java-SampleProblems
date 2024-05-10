package dev.nj.solutions;

public class Student extends Person {
    int studentID;

    Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nStudent ID: " + studentID;
    }
}
