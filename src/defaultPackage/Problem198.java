package defaultPackage;

public class Problem198 {

	public static int rob(int[] nums) {
		
		if(nums.length == 0){
            return  0;
        }
        
        int [] result = new int[nums.length + 1];
		
		result[0] = 0;
		result[1] = nums[0];
				
		for(int i = 2; i < result.length; i++){
			
			if(result[i - 1] > (result[i - 2] + nums[i - 1])){
				result[i] = result[i - 1];
			}else{
				result[i] = result[i - 2] + nums[i - 1];
			}
			
		}
		
		return result[result.length - 1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
