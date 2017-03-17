
package demo;

public class Constructorex2 {
    int x;
    int y;
    boolean z;
    char c;
    
    Constructorex2(){
        this(10,0,false,' ');
            
    }
    Constructorex2(int x, int y , boolean z){
      this( x, y, z, ' ');
    }
    Constructorex2(int x , int y){
        this(x , y , false, ' ');
    }
    Constructorex2(int x , int y , boolean z, char c){
        this.x = x;
        this.y = y;
        this.z = z;
        this.c = c;
    }
}
