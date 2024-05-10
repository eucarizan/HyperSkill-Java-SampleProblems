package dev.nj.solutions;

public class StudentInfo {
    public static String printStudentInfo(String name, int age, int studentID) {
        Student st = new Student(name, age, studentID);
//        return "Name: " + st.getName() +
//                "\nAge: " + st.getAge() +
//                "\nStudent ID: " + st.getStudentID();
        return st.toString();
    }
}
