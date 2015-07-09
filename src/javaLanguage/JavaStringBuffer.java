package javaLanguage;

public class JavaStringBuffer {

	public static void main(String[] args) {

		// Initiate a string buffer
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer("abc");

		// relationship between string and string buffer
		String s3 = "abc";
		StringBuffer sb1 = new StringBuffer("123");
		StringBuffer sb2 = new StringBuffer(s3);
		String s4 = sb1.toString();
		
		// append
        sb1.append("true"); // sb1 is "123true"
        
        // delete char at a specific index
        sb1. deleteCharAt(1);
        
        // delete substring, include start, not include end
        sb1. delete (1,2);
        
        // insert
        sb1 = new StringBuffer("0123456");
        sb1.insert(4,"false"); // sb1 is 0123false456
        System.out.println(sb1);
        
        // reverse
        sb1.reverse();
        
        // set char at
        sb1.setCharAt(1,'D');
        
        // trim
        sb1.trimToSize();
        
	}

}
