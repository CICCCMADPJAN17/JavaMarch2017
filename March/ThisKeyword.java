
package demo;

public class ThisKeyword {
    public static void main(String args[]){
        Someclass s1 = new Someclass();
        s1.display();
        System.out.println(" object s1 " + s1);
        Someclass s2 = new Someclass();
        s2.display();
        System.out.println(" object s1 " + s2);
    }
    
}

class Someclass{
    int no = 1;
    public void display()
    {
        int no= 5;
        System.out.println("value of no "+ no);
        System.out.println("value of this "+ this);
    }
}
