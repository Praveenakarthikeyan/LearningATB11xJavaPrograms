package ex_25_Collection_Framework.LIST;

import java.util.*;

public class Lab121_AL_Student {
    public static void main(String[] args) {
        Student s1 = new Student("Linda",1);
        Student s2 = new Student("Devin",2);
        Student s3 = new Student("Larry",3);

        List<Student> myStudents = new ArrayList();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
class Student {
    private String name;
    private int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Student name: " + this.name);
        System.out.println("Roll Number: " + this.rollNo);
        System.out.println("---------------------------------");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
