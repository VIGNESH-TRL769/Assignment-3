package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Student
{
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    float gpa;
    public final String name;
    String Grade;
    Student(String name,float gpa,String Grade)
    {
        this.name=name;
        this.gpa=gpa;
        this.Grade=Grade;
    }
    public void update(float value)
    {
        gpa=value;
        if(value>=9)
        {
            Grade="O";
        }
        else if(value>=8)
        {
            Grade="A+";

        }
        else if(value>=7)
        {
            Grade="A";

        }
        else if(value>=6)
        {
            Grade="B+";

        }
        else if(value>=5)
        {
            Grade="B";

        }
        else
        {
            Grade="F";

        }
        LOGGER.log(Level.INFO,"---Updated Successfully---");

    }
    public String display()
    {
        String dublicate=String.valueOf(gpa);
        return name+" has a "+dublicate+" GPA "+" and GRADE is "+Grade;
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
        LOGGER.log(Level.INFO,"Enter the GradeLevel:");
        String grade=input.next();
        Student student=new Student(name,gpa,grade);
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
