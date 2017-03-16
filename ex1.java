class Overloading
{
    int method(int i, int d)
    {
        return i+d;
    }
	
    int method(int i, int j ,int k)
	{
		return i+j+k;
	}
	
    int method(int i, double d)
    {
        return (int)(i*d);
    }
     
    double method(double i, int d)
    {
        return i+d;
    }
     
     double method(double i, double d)
    {
        return i+d;
    }
	public static void main(String[] args) {  
		Overloading o1 = new Overloading();
		int ans;
		double ans1;
		ans = o1.method(10,10);
		System.out.println("answer is  "+ans);
		ans = o1.method(50,50,50);
		System.out.println("answer is  "+ans);
		ans = o1.method(10,10.50);
		System.out.println("answer is  "+ans);
		ans1 = o1.method(10.50,10);
		System.out.println("answer is  "+ans1);
		ans1 = o1.method(10.5,10.5);
		System.out.println("answer is  "+ans1);
	}
}