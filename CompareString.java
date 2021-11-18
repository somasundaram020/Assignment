package string;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "I am Learning Java";
		String b = "I am learning Java";

		if (a == b) {
			System.out.println("same");
		} else
			System.out.println("differ");

		if (a.equals(b)) {
			System.out.println("same");
		} else
			System.out.println("differ");

		if (a.equalsIgnoreCase(b)) {
			System.out.println("same");
		} else
			System.out.println("differ");
		
		/*int c=1;
		int d=2;
		if (c == d) {
			System.out.println("same");
		} else
			System.out.println("differ");*/

	}

}
