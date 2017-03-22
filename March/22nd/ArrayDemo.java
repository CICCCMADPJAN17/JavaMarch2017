package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[5];
        int i;
        Scanner val = new Scanner(System.in);
        for(i=0 ; i<5 ;i++){
            System.out.println("enter the value for a [" + i +"]\t");
            a[i] = val.nextInt();
        }
        Arrays.sort(a);
        for(i=0 ; i<5 ;i++){
            System.out.print("value for a [" + i +"]\t");
            System.out.println(a[i]);
        }
    }
}

