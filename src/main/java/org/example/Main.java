package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Student
{
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public  float gpa;
    public final String name;
    public String  grade;
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
        LOGGER.log(Level.INFO,"---Updated Successfully---");

    }
    public String display()
    {
        String dublicate=String.valueOf(gpa);
        return name+" has a "+dublicate+" GPA "+" and grade is "+ grade;
    }
}
public class Main
{
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        float gpa;
        LOGGER.log(Level.INFO,"Enter the Student Name");
        String name=input.nextLine();
        while(true)
        {
            LOGGER.log(Level.INFO, "Enter the GPA:");
            gpa = input.nextFloat();
            if(gpa>0 && gpa<=10)
            {
                break;
            }
            else
            {
                LOGGER.log(Level.INFO,"Please enter Valid GPA");
            }

        }
        LOGGER.log(Level.INFO,"Enter the gradeLevel:");
        String grade=input.next();
        Student student=new Student(name,gpa, grade);
        int temp=0;
        do {

            LOGGER.log(Level.INFO,"\n1.Update\n2.CheckData\n3.Exit\nEnter the Choice:");
            int key = input.nextInt();
            switch (key) {
                case 1 -> {
                    LOGGER.log(Level.INFO,"Enter the GPA:");
                    float value = input.nextFloat();
                    if(value>0 && value<=10)
                        student.update(value);
                    else
                        LOGGER.log(Level.INFO,"please enter valid GPA");

                }
                case 2 ->  {String content=student.display();LOGGER.log(Level.INFO,content);}
                default -> {temp = 1; LOGGER.log(Level.INFO,"---Thank You---");}
            }

        } while (temp != 1);




    }
}
