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
public class ArrayAddition {
    public static void main(String[] args) {
    int[][] A = new int[2][2];
    int[][] B = new int[2][2];
    int[][] C = new int[2][2];
    int i,j;
    Scanner val = new Scanner(System.in);
    for(i=0; i<2; i++){
        for(j=0; j<2; j++){
            System.out.print("enter the value for A["+i+"]"+"["+j+"]");
            A[i][j]= val.nextInt();
            System.out.println("");
        } 
    }
      for(i=0; i<2; i++){
        for(j=0; j<2; j++){
            System.out.print("enter the value for B["+i+"]"+"["+j+"]");
            B[i][j]= val.nextInt();
            System.out.println("");
        } 
    }
       for(i=0; i<2; i++){
        for(j=0; j<2; j++){
           C[i][j] = A[i][j] + B[i][j];
        } 
    }
        System.out.println("the values in matrix A are");
        for(i=0; i<2; i++){
        for(j=0; j<2; j++){
            System.out.print(A[i][j] + "\t");
        } 
            System.out.println("");
    }
        System.out.println("the values in matrix B are");
        for(i=0; i<2; i++){
        for(j=0; j<2; j++){
            System.out.print(B[i][j] + "\t");
        } 
            System.out.println("");
    }
       System.out.println("the values in matrix C are");
        for(i=0; i<2; i++){
        for(j=0; j<2; j++){
            System.out.print(C[i][j] + "\t");
        } 
            System.out.println("");
    }
    }   
    
}
