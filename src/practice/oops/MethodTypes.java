package practice.oops;

public class MethodTypes {
	
	int a = 10;
	int b = 5;
	
	public void method1()
	{
		System.out.println("Addition 1 = " + (a+b));
	}
	
	public void method2(String username, String password)
	{
		System.out.println("Addition 2 = " + username + " = " +   password);
	}
	
	public int method3() //method with return type and without parameters
	{
		return a+b;
	}
	
	public int method4(int i, int j)
	{
		return i*j;
	}
	
	public static void main(String[] args) {
		MethodTypes m = new MethodTypes();
		m.method1();
		
		m.method1();
		m.method2("Admin", "admin123");
		m.method2("User123", "52662889");
		System.out.println(m.method3());
		System.out.println(m.method4(7, 9));
		
	}

}
