package defaultPackage;

public class Problem27 {

	public static int removeElement(int[] nums, int val) {

		int i = 0;
		int j = nums.length - 1;
		
		if(nums.length == 0){
			return 0;
		}
		
		if(nums.length == 1){
			if(nums[0] == val){
				return 0;
			}else{
				return 1;
			}
		}

		while (i < j) {

			if (nums[i] == val) {

				while (nums[j] == val) {

					if (j == 0) {
						return 0;
					}

					j--;

				}

				// System.out.println("i: " + i);
				// System.out.println("j: " + j);

				int temp;
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;

			}

			i++;

		}

		return i;
	}

	public static void main(String[] args) {
		// int [] nums = {3, 4, 3, 6, 90, 23, 3, 245, 3};
		int[] nums = { 2 };
		System.out.println(removeElement(nums, 3));

	}

}
