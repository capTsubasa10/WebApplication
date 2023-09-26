package practice.oops;

public class Myself {

	public static void main(String[] args) {
		Friend f = new Friend();
		// System.out.println(f.locker);

		// f.locker = 5000;

		// System.out.println(f.locker);

		System.out.println(f.getLocker());

		f.setLocker(7600);

		System.out.println(f.getLocker());

	}

}
