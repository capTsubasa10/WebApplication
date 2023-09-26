package practice.oops;

public class DerivedClass extends BaseClass {

	public void functions() {
		System.out.println("Derived Class Functions");
	}

	public void screenshot() {
		System.out.println(" Child class Screenshot ");
	}

	public static void main(String[] args) {

		DerivedClass d = new DerivedClass();
		d.screenshot();
		d.scrollUp();
		d.functions();

		BaseClass b = new BaseClass();
		b.scrollUp();
		b.functions();
		// b.screenshot();`

		BaseClass d1 = new DerivedClass();
		d1.scrollUp();
		d1.functions();

	}

}
