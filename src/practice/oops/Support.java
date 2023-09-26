package practice.oops;

public class Support extends AbstractDemo {

	public static void main(String[] args) {
		Support s = new Support();
		s.method1();
		s.method2();

	}

	@Override
	public void method2() {

		System.out.println("Thanks ");

	}

}
