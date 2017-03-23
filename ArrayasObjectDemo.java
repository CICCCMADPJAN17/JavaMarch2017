
package demo;

import java.util.Scanner;

public class ArrayasObjectDemo {
    public static void main(String[] args) {
        Student[] StudentArray = new Student[5];
//        StudentArray[0] = new Student();
//        StudentArray[1] = new Student();
//        StudentArray[0].name = "Kaori";
//        StudentArray[1].name = "Nobuki";
//        System.out.println(StudentArray[0].name);
//        System.out.println(StudentArray[1].name);
        
        for(int i=0; i<5; i++)
        {
            StudentArray[i] = new Student();
            StudentArray[i].name = "ABC";
        }
        for(int i=0; i<5; i++)
        {
            System.out.println("student "+ i + " is "+ StudentArray[i].name);
        }
        
    }
    
}

 class Student{
    String name;
    int marks;
}