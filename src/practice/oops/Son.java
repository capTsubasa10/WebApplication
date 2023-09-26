package practice.oops;

public class Son extends Father {

	public void ktmBike() {
		System.out.println("Son's Bike");
	}

	public void swiftCar() {
		System.out.println("Son's Car");
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.ktmBike();
		s.swiftCar();
		s.bulletBike();
		s.scorpioCar();
		s.property();
	}

}
