package defaultPackage;

public class Problem35 {

	public int searchInsert(int[] nums, int target) {
        int i = 0;
        
        if(nums.length == 0) return 0;
        
        while(i < nums.length && nums[i] <= target){
            if(nums[i]==target){
                return i;
            }
            i++;
        }
        
        return i;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
