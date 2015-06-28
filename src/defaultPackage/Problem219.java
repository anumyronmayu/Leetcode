package defaultPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem219 {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

		for (int i = 0; i < nums.length; i++) {

			if (map.get(nums[i]) == null) {

				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(nums[i], list);

			} else {

				map.get(nums[i]).add(i);

			}

		}

		Set<Map.Entry<Integer, List<Integer>>> entrySet = map.entrySet();

		for (Map.Entry<Integer, List<Integer>> entry : entrySet) {

			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			
			//for(Integer a : entry.getValue()){
				//System.out.println(a);
			//}
			
			for(int j = 0; j < entry.getValue().size() - 1; j++){
				if(Math.abs(entry.getValue().get(j) - entry.getValue().get(j + 1)) <= k){
					return true;
				}
			}

		}

		return false;

	}

	public static void main(String[] args) {
		
		int [] a = {1, 2, 3, 5, 3};
		
		System.out.println(containsNearbyDuplicate(a, 1));

	}

}
