package defaultPackage;

public class Problem240 {
	
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i = 0; i < m; i++){
            
            if(matrix[i][0] <= target && matrix[i][n - 1] >= target){
                if(binarySearch(matrix[i], target) == true){
                    return true;
                }
            }
        }
        
       return false;
        
    }
    
    public boolean binarySearch(int[] nums, int target){
        
        int low = 0;
        int high = nums.length - 1;
        int mid;
        
        while(low <= high){
            mid = (low + high) / 2;
            if(target == nums[mid]){
                return true;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
