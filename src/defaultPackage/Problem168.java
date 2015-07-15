package defaultPackage;

public class Problem168 {

	public String convertToTitle(int n) {

		StringBuffer sb = new StringBuffer("");

		while (n > 0) {
			if (n % 26 == 0) {
				sb.append(String.valueOf('Z'));
				n = (n - 26) / 26;
			} else {
				sb.append(String.valueOf((char) ((n % 26) + 'A' - 1)));
				n = n / 26;
			}

		}

		return sb.reverse().toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
