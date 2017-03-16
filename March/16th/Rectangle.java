class Rectangle {
  int length;
  int breadth;

  Rectangle(int len,int bre)
  {
  length  = len;
  breadth = bre;
  }
}

class RectangleDemo {
  public static void main(String args[]) {

  Rectangle r1 = new Rectangle(20,10);

  System.out.println("Length of Rectangle : " + r1.length);
  System.out.println("Breadth of Rectangle : " + r1.breadth);

  }
}