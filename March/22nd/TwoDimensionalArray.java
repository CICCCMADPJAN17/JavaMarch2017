/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author naimesh
 */
public class TwoDimensionalArray {
    
    public static void main(String[] args) {
    int[][] arry = new int[2][2];
    int i,j;
    Scanner val = new Scanner(System.in);
    for(i=0; i<2; i++){
        for(j=0; j<2; j++){
            System.out.print("enter the value for arry["+i+"]"+"["+j+"]");
            arry[i][j]= val.nextInt();
            System.out.println("");
        } 
    }
        System.out.println("the values in matrix are");
        for(i=0; i<2; i++){
        for(j=0; j<2; j++){
            System.out.print(arry[i][j] + "\t");
        } 
            System.out.println("");
    }
    }   
    }
