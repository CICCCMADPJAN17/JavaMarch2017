package demo;

import java.util.Scanner;

public class Switchdemo {
public static void main(String args[]) {
        int a ;
        Scanner value  = new Scanner(System.in);
        System.out.println("eneter one number");
        a = value.nextInt();
        switch (a) {
            case 1:
                System.out.println("You chose One");
                break;
            case 2:
                System.out.println("You chose Two");
                break;
            case 3:
                System.out.println("You chose Three");
                break;
            case 4:
                System.out.println("You chose Four");
                break;
            case 5:
                System.out.println("You chose Five");
                break;
            default:
                System.out.println("Invalid Choice. Enter a no between 1 and 5");
                break;
        }
    }
}