package defaultPackage;

import java.util.HashMap;

public class Problem202 {

	public HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public boolean isHappy(int n) {

		if (map.get(n) != null) {
			return false;
		}

		String s = String.valueOf(n);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += Math.pow(Integer.parseInt(s.substring(i, i + 1)), 2);
		}

		if (sum == 1) {
			return true;
		} else {
			map.put(n, 1);

			return isHappy(sum);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
