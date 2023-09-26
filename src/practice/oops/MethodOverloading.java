package practice.oops;

public class MethodOverloading {

	int a = 10, b = 5;

	public void addition() {
		System.out.println("Addition 1 = " + (a + b));
	}

	public void addition(int x, int y) {
		System.out.println("Addition 2 = " + (x + y));
	}

	public void addition(int x, int y, int z) {
		System.out.println("Addition 3 = " + (x + y + z));
	}

	public void addition(double x, int y, int z) {
		System.out.println("ADdition 4 = " + (x + y + z));

	}

	public void addition(int x, double z, int y) {
		System.out.println("Addition 5 = " + (x + y + z));
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.addition();
		m.addition(30, 59);
		m.addition(45, 55, 65);
		m.addition(22.89, 12, 18);
		m.addition(23, 66.90, 8);

	}

}
