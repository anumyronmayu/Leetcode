package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class test4 {

	public static void test2() {
		Random ran = new Random();
		Set<Integer> set = new HashSet<Integer>();
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = ran.nextInt(20) + 1;
			set.add(num[i]);
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void Test2() {
		    Random ran = new Random();
		    Set <Integer> set = new HashSet<Integer>();
		    while(set.size()==10?false:true){
		    	int num = ran.nextInt(20)+1;
		    	set.add(num);
		    }
		    Iterator<Integer> it = set.iterator();
		    int count = 0;
		    while(it.hasNext()){
		    	System.out.println("第"+ ++count +"个随机数 =="+it.next());
		    }
		
	}

	public static void main(String[] args) {
		
		Test2();

	}

}
