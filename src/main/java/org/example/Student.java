package org.example;

import java.util.logging.Logger;

class Student
{
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    float gpa;
    public final String name;
    String  grade;
    Student(String name,float gpa,String  grade)
    {
        this.name=name;
        this.gpa=gpa;
        this. grade= grade;
    }
    public void update(float value)
    {
        gpa=value;
        if(value>=9)
        {
            grade="O";
        }
        else if(value>=8)
        {
            grade="A+";
        }
        else if(value>=7)
        {
            grade="A";
        }
        else if(value>=6)
        {
            grade="B+";
        }
        else if(value>=5)
        {
            grade="B";
        }
        else
        {
            grade="F";
        }
        LOGGER.info("---Updated Successfully---");
    }
    public String display()
    {
        String dublicate=String.valueOf(gpa);
        return name+" has a "+dublicate+" GPA "+" and grade is "+ grade;
    }
}