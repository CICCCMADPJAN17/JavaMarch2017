/**
 * Created by mmatsuhisa on 2017-03-16.
 */
class Shape {
    int r,i,w,h;

    void draw(int r){
        System.out.print("A circle");
    }
    void draw(int i,int w){
        System.out.print("A rectungle");
    }
    void draw(int i,int w,int h){
        System.out.print("A 3D object");
    }

    void draw(double i,int w,int h){
        System.out.print("A 3D object with double value");
    }
    public static void main(String[] args) {
        Shape s= new Shape();
        s.draw(10,50,60);
    }

}
