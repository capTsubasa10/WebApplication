package practice.oops;

public class Father extends GrandFather {

	public void bulletBike() {
		System.out.println("Father's Bike");
	}

	public void scorpioCar() {
		System.out.println("Father's car");
	}

	public static void main(String[] args) {
		Father f = new Father();
		f.bulletBike();
		f.scorpioCar();
		f.property();
	}
}
