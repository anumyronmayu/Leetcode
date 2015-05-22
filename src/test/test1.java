package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test1 {
    
    public static void test(String s){
    	
    	for(int i = 1; i < s.length(); i++){
    		
    		if(Math.abs((s.charAt(i) - s.charAt(i - 1))) != Math.abs(s.charAt(s.length() - i) - s.charAt(s.length() - i - 1))){
    			System.out.println("Not Funny");
    		}
    		
    	}
    	
    	System.out.println("Funny");
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i = 0; i < t; i++){
            
            String s = in.next();
            test(s);
        }
    }
}