/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Arrays;

/**
 *
 * @author naimesh
 */
public class Arraysort {
    public static void main(String[] args)
    {
        int[] ar = {4, 6, 1, 8, 3, 9, 7, 4, 2};
 
        // To sort array in ascending order.
        Arrays.sort(ar);
        System.out.println("Sorted array" + Arrays.toString(ar));
 
    }
}
