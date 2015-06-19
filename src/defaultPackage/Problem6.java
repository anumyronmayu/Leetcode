package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {

	public static String convert(String s, int numRows) {
		
		if(numRows == 1){
			return s;
		}

		List<StringBuffer> list = new ArrayList<StringBuffer>();

		for (int i = 0; i < numRows; i++) {
			StringBuffer sb = new StringBuffer();
			list.add(sb);
		}
		
		int round = (int) Math.ceil(s.length() / ((numRows - 1) * 2.0));
		

		int index = 0;

		for (int i = 0; i < round - 1; i++) {

			for (int j = 0; j < numRows; j++) {
				list.get(j).append(s.charAt(index));
				index++;
			}

			for (int k = numRows - 2; k >= 1; k--) {
				list.get(k).append(s.charAt(index));
				index++;
			}

		}

		for (int j = 0; j < numRows; j++) {
			if (index < s.length()) {
				list.get(j).append(s.charAt(index));
				index++;
			}

		}

		for (int k = numRows - 2; k >= 1; k--) {
			if (index < s.length()) {
				list.get(k).append(s.charAt(index));
				index++;
			}
		}
		
		String b = "";
		
		for (int i = 0; i < list.size(); i++) {
			b += list.get(i).toString();
		}

		return b;

	}

	public static void main(String[] args) {

		String s = "A";
		int numRows = 1;
		System.out.println(convert(s, numRows));

	}

}
