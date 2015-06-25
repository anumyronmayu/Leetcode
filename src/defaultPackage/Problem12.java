package defaultPackage;

import java.util.HashMap;

public class Problem12 {

	public static String intToRoman(int num) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "I");
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");

		if (num == 0) {
			return "";
		}

		if (map.get(num) != null) {
			return map.get(num);
		}

		String front = "";

		if (num >= 1001 && num <= 3999) {

			int numM = num / 1000;

			for (int i = 0; i < numM; i++) {
				front += "M";
			}

			return front + intToRoman(num - numM * 1000);

		} else if (num >= 900 && num <= 999) {

			front = "CM";

			return front + intToRoman(num - 900);

		} else if (num >= 501 && num <= 899) {

			front = "D";

			int numC = (num - 500) / 100;

			for (int i = 0; i < numC; i++) {
				front += "C";
			}

			return front + intToRoman(num - 500 - numC * 100);

		} else if (num >= 400 && num <= 499) {

			front = "CD";

			return front + intToRoman(num - 400);

		} else if (num >= 101 && num <= 399) {

			int numC = num / 100;

			for (int i = 0; i < numC; i++) {
				front += "C";
			}

			return front + intToRoman(num - 100 * numC);

		} else if (num >= 90 && num <= 99) {

			front = "XC";

			return front + intToRoman(num - 90);

		} else if (num >= 51 && num <= 89) {

			front = "L";
			int numX = (num - 50) / 10;

			for (int i = 0; i < numX; i++) {
				front += "X";
			}

			return front + intToRoman(num - 50 - numX * 10);
			
		} else if (num >= 40 && num <= 49) {

			front = "XL";

			return front + intToRoman(num - 40);

		} else if (num >= 11 && num <= 39) {
			int numX = num / 10;

			for (int i = 0; i < numX; i++) {
				front += "X";
			}

			return front + intToRoman(num - numX * 10);
			
		} else if (num == 9) {

			return "IX";

		} else if (num >= 6 && num <= 8) {

			front = "V";
			int numI = num - 5;

			for (int i = 0; i < numI; i++) {
				front += "I";
			}
			return front;

		} else if (num == 4) {

			return "IV";

		} else {

			for (int i = 0; i < num; i++) {
				front += "I";
			}

			return front;

		}

	}

	public static void main(String[] args) {

		int num = 55;
		System.out.println(intToRoman(num));

	}

}
