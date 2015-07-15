package defaultPackage;

public class Problem9 {

	public boolean isPalindrome(int x) {

		String s1 = String.valueOf(x);

		StringBuffer sb = new StringBuffer(s1);

		String s2 = sb.reverse().toString();

		if (s1.equals(s2)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
