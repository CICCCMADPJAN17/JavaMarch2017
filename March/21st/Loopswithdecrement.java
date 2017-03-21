
package demo;

public class Loopswithdecrement {
    public static void main(String[] args) {
       
        System.out.println("demo for while loop");
        int i=5; //intialization 1st part
        while(i > 0) //condition 2nd part
        {
            System.out.println("Hello for " + i + "time");
            i--; //decrement 3rd part
        }
        System.out.println();
        System.out.println();
        
        System.out.println("demo for do...while loop");
        int j=5; //intialization 1st part
        do
        {
            System.out.println("Hello for " + j + "time");
            j--; //decrement 2nd part
        }while(j > 0); //condition 3rd part
        System.out.println();
        System.out.println();
        
        System.out.println("demo of for loop");
        for(int k=5; k > 0 ; k--){ //intialization 1st part ;condition 2nd part; decrement 3rd part
            System.out.println("Hello for " + k + "time");
        }
    }
    
}
