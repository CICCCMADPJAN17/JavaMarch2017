package com.company;

import java.util.Scanner;

public class Main {

    String name;
    int year,age;

    private void getdata() {
        Scanner value = new Scanner(System.in);

        System.out.println("Enter Name");
        name = value.nextLine();
        System.out.println("Enter year");
        year = value.nextInt();
        age=2017-year;
        System.out.println("Name is" + name);
        System.out.println("year is" + year);
        System.out.println("age is" + age);

    }

    public static void main(String[] args) {
        // write your code here
        Main P1=new Main();
        P1.getdata();
        Main P2=new Main();
        P2.getdata();
    }
}
