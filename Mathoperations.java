
package mathoperations;

public class Mathoperations {
    int a=100;
    int b=50;
    int result ;
    void addition()
    {
        result = a + b;
        System.out.println("add is "+ result);
    }
    
    void substraction()
    {
        result = a-b;
        System.out.println("sub is "+ result);
    }
    
     void multiplication()
    {
        result = a*b;
        System.out.println("mul is "+ result);
    }
    
       void division()
    {
        result = a/b;
        System.out.println("div is "+ result);
    }
    public static void main(String[] args) {
        
        Mathoperations m1 = new Mathoperations();
        m1.multiplication();
        m1.division();
    }
    
}
