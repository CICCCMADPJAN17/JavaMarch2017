
package demo;

public class Whiledemo {
    public static void main(String[] args) {
       
        System.out.println("demo for while loop");
        int i=0; //intialization 1st part
        while(i<5) //condition 2nd part
        {
            System.out.println("Hello for " + i + "time");
            i++; //increment 3rd part
        }
        System.out.println();
        System.out.println();
        
        System.out.println("demo for do...while loop");
        int j=0; //intialization 1st part
        do
        {
            System.out.println("Hello for " + j + "time");
            j++; //increment 2nd part
        }while(j<5); //condition 3rd part
        System.out.println();
        System.out.println();
        
        System.out.println("demo of for loop");
        for(int k=0; k<5; k++){ //intialization 1st part ;condition 2nd part; increment 3rd part
            System.out.println("Hello for " + k + "time");
        }
    }
    
}
