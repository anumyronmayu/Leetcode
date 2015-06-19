package defaultPackage;

public class Problem58 {

	public static int lengthOfLastWord(String s) {

		if (s.equals("")) {
			return 0;
		}

		int length = 0;

		int flag = s.length() - 1;

		while (flag >= 0 && s.charAt(flag) == ' ') {
			flag--;
		}

		while (flag >= 0 && s.charAt(flag) != ' ') {
			flag--;
			length++;
		}

		return length;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
