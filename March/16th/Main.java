package corejava;

public class Main {
        public void Age() {
                int age = 0;
                age = age + 7;
                System.out.println("Age in class method: " + age);
        }

        public static void main(String args[]) {
			    int age=100;
                Main m = new Main();
                m.Age();
				System.out.println("age in main methos "+ age);
        }
}