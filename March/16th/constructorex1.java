class Example{
   //Default constructor
   Example(){
      System.out.println("Default constructor");
   }
   /* Parameterized constructor with 
    * two integer arguments
    */
   Example(int i, int j){
      System.out.print("parameterized constructor");
      System.out.println(" with Two parameters");
   }
   /* Parameterized constructor with 
    * three integer arguments
    */
   Example(int i, int j, int k){
      System.out.print("parameterized constructor");
      System.out.println(" with Three parameters");
   }
   public static void main(String args[]){
      //This will invoke default constructor
      Example obj = new Example();
      /* This will invoke the constructor 
       * with two arguments
       */
      Example obj2 = new Example(12, 12);
      /* This will invoke the constructor 
       * with three arguments
       */
      Example obj3 = new Example(1, 2, 13);		
   }
}