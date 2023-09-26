package practice.oops;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "JavaProgram";
		String s2 = new String("SunFlower");
		String s3 = "Hello Java is an software language";
		String s4 = "          Next chapter is Selenium    ";
		String s5 = "apple";
		String s6 = "728329yyegeSTYTEIIEJ728BSDK172ahhbej9G*#)@!jaj@VB";

		System.out.println(s1.charAt(5));

		char x = s2.charAt(4);

		System.out.println(x);

		s1.compareTo("javaprogram");

		System.out.println(s1.concat(s2));

		System.out.println(s2.concat(" Is for sale "));

		System.out.println(s1 + s2);

		String s7 = s5.toUpperCase();

		System.out.println(s7);

		System.out.println(s7.toLowerCase());

		System.out.println(s4);

		System.out.println(s4.trim());

		System.out.println(s2.equals("sunflower"));

		System.out.println(s2.equalsIgnoreCase("sunflower"));

		System.out.println(s1.indexOf('a'));

		System.out.println(s1.indexOf("Pro"));

		System.out.println(s1.lastIndexOf('a'));

		System.out.println(s3.isEmpty());

		System.out.println(s4.length());

		String[] arr = s3.split(" ");

		for (String z : arr) {
			System.out.println(z);
		}

		System.out.println(s2.replace('S', 'X'));

		System.out.println(s6.replaceAll("[^0-9]", ""));

	}

}
