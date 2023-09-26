package practice.oops;

public class ChildClass implements FatherInterface, MotherInterface {

	public void officeSetup() {
		System.out.println("Child Property");
	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.officeSetup();
		c.bulletBike();
		c.activaBike();
		c.scorpioCar();

	}

	@Override
	public void activaBike() {
		System.out.println("Mother bike");
	}

	@Override
	public void bulletBike() {
		System.out.println("Father Bullet Bike");
	}

	@Override
	public void scorpioCar() {

		System.out.println("Father and Mother's car");
	}
}