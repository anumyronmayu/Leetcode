package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {

	public static int reverse(int x) {

		int y;

		if (x < 0) {
			y = -x;
		} else if (x > 0) {
			y = x;
		} else {
			return 0;
		}

		List<Integer> list = new ArrayList<Integer>();

		while ((int)y / 10 > 0) {

			list.add(y % 10);

			y = (int) (y / 10);

		}

		int z = 0;

		for (Integer i : list) {

			z = 10 * z + i;

		}

		if (x < 0) {
			return -z;
		} else {
			return z;
		}

	}

	public static void main(String[] args) {
		
		System.out.println(reverse(10));

	}

}
