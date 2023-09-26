package practice.oops;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Happy Morning Everyone"; // length => n => last index = n-1
		// 012345

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			// System.out.print(str.charAt(i));

			rev = rev + str.charAt(i); // rev = e/ e+n=en/en+o=eno/

			System.out.println(rev);
		}
		System.out.println("Answer is = " + rev);

	}

}
