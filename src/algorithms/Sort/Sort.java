package algorithms.Sort;

/*************************************************************************
 *  Compilation:  javac Sort.java
 *  Execution:    java Sort
 *  Dependencies: Merge.java Insertion.java
 *  Minor modification of the code provided by Prof Robert Sedgewick 
 *  and Prof Kevin Wayne at Princeton University
 *************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Sort {
	
	public static void main(String[] args) {
		
		System.out.println("Please input the number of integers: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        Integer size = 0;
		try {
			size = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Integer [] a = randomInput(size);
        Integer [] b = new Integer[size];
        for (int i = 0; i < size; ++i){
        	b[i] = new Integer(a[i]);
        }
        
		long startTime = System.currentTimeMillis();
		Merge.sort(a);
		long endTime = System.currentTimeMillis();
		System.out.println("Merge run time with " +size + " integers :" + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		Insertion.sort(b);
		endTime = System.currentTimeMillis();
		System.out.println("Insertion run time with " +size + " integers :" + (endTime - startTime));
        
		
	}
	
	//random generate an array with size elements each of which is smaller than 100
    public static Integer [] randomInput(int size){
    	Integer [] ranArray = new Integer[size];
    	
    	Random randomGenerator = new Random();
        for (int idx = 0; idx < size; ++idx){
          int randomInt = randomGenerator.nextInt(size);
          ranArray[idx] = randomInt;
        }
        return ranArray;
    }
}
