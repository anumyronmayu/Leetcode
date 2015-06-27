package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {

	public static int reverse(int x) {

		if (x < 0) {
			x = - x;
		}

		int result = 0;

		while (x >= 1) {

			result = 10 * result + x % 10;
			x = x / 10;

		}

		if (x >= 0) {
			return result;
		} else {
			return -1 * result;
		}

	}

	public static void main(String[] args) {

		System.out.println(reverse(13));

	}

}
