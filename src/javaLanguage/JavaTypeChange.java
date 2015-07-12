package javaLanguage;

public class JavaTypeChange {

	public static void main(String[] args) {

		// char to String
		char c = 'a';
		String str = String.valueOf(c);

		// char array to String
		char data[] = { 's', 'g', 'k' };
		str = new String(data);
		// or
		str = String.valueOf(data);

		// String to char
		c = str.charAt(0);

		// int to String
		int i = 100;
		str = String.valueOf(i);
		// or
		str = Integer.toString(i);
		// or
		str = "" + i;

		// String to int
		i = Integer.parseInt(str);
		// or
		i = Integer.valueOf(str).intValue();

		// double to String
		double d = 16.56;
		str = String.valueOf(d);

		// String to double
		d = Double.parseDouble(str);

		// boolean to String
		boolean b = true;
		str = String.valueOf(b);

		// String to boolean
		b = Boolean.parseBoolean(str);

		// int to char
		int ii = 97;
		char cc = (char) ii;

		// char to int
		ii = (int) cc;
		
		// int to binary
		Integer.toBinaryString(i);
	}

}
