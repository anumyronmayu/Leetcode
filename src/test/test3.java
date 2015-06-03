package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
	
	public static void main(String args[]) throws FileNotFoundException{
	
		String file = "/Users/Myron/Documents/eclipse/workspace-luna/pod-discovery/target/test-classes/sample.log";
		Scanner s = new Scanner(new File(file));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()){
		    list.add(s.nextLine());
		}
		s.close();
		
		System.out.println(list.get(0));
		System.out.println(list.get(10));
		System.out.println(list.size());
	}
	
	

}
