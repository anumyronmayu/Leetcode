package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem120 {

	public static int minimumTotal(List<List<Integer>> triangle) {

		List<List<Integer>> results = new ArrayList<List<Integer>>();

		List<Integer> list = new ArrayList<Integer>();

		list.add(triangle.get(0).get(0));
		results.add(list);

		int triangleSize = triangle.size();

		for (int i = 1; i < triangleSize; i++) {

			int current = results.size();

			List<Integer> first = new ArrayList<Integer>();

			first.add(triangle.get(i).get(0) + results.get(i - 1).get(0));

			for (int j = 0; j < current - 1; j++) {

				if (results.get(i - 1).get(j) <= results.get(i - 1).get(j + 1)) {
					first.add(results.get(i - 1).get(j)
							+ triangle.get(i).get(j + 1));
				} else {
					first.add(results.get(i - 1).get(j + 1)
							+ triangle.get(i).get(j + 1));
				}

			}

			first.add(triangle.get(i).get(triangle.get(i).size() - 1)
					+ results.get(i - 1).get(results.get(i - 1).size() - 1));

			results.add(first);
		}
		
		int smallest = Integer.MAX_VALUE;
		
		for(int k = 0; k < triangleSize; k++){
			
			if(results.get(triangleSize - 1).get(k) < smallest){
				
				smallest = results.get(triangleSize - 1).get(k);
				
			}
			
		}

		return smallest;
	}

	public static void main(String[] args) {
		
		

	}

}
