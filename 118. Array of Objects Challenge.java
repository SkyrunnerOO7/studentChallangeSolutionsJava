package com.company;

import java.awt.*;
import java.lang.*;
import java.util.*;

class Student
{
    private String rollNo;
    private String name;
    private String dept;
    private String subjects[] = new String[5];

    public Student(String rollNo,String name,String dept,String subjects[])
    {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.subjects = subjects;
    }

    public void getSubjects(String ...Subjects)
    {
        for(int i = 0; i < subjects.length; i++)
        {
            subjects = Subjects;
        }
    }


    public String toString()
    {
        String subs = "";
        for(String S: subjects)
            subs+=(S+" ");
        return rollNo+" "+name+" "+dept+" "+subs;
    }
}

public class Main{

    public static void main(String args[]){

        Student s[] = new Student[2];
        s[0] = new Student("0005CS191077", "Punit pawar","Cs",new String[]{"Maths","Algo","ds","os","Se"});
        s[1] = new Student("0005CS191067","Anurag sahu","Cs",new String[]{"Maths","Algo","ds","os","Se"});

        for(Student X: s)
        {
            System.out.println(X);
        }
    }
}
