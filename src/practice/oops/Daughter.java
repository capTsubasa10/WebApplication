package practice.oops;

public class Daughter extends Father {
	
	public void vespaBike()
	{
		System.out.println("Daughter's Bike");
	}
	
	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.vespaBike();
		d.bulletBike();
		d.scorpioCar();
		d.property();
	}

}
