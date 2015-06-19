package defaultPackage;

public class Problem11 {
	
	public static int maxArea(int[] height) {
	        
	        int size = height.length;
	        
	        int maxArea = Math.min(height[0], height[size - 1]) * (size - 1);
	        
	        System.out.println(maxArea);
	        
	        int left = 0;
	        
	        int right = size - 1;
	        
	        for(int i = 1; i <= size - 2; i++){
	        	
	        	if(Math.min(height[i], height[size-1]) * (size - 1 - i) > maxArea){
	        		maxArea = Math.min(height[i], height[size-1]) * (size - 1 - i);
	        		left = i;
	        		System.out.println(maxArea + "  Left: " + left + "  Right: " + (size-1));
	        	}
	        	
	        }
	        
	        for(int j = size - 2; j > left; j--){
	        	
	        	if(Math.min(height[left], height[j]) * (j - left) > maxArea){
	        		maxArea = Math.min(height[left], height[j]) * (j - left);
	        		right = j;
	        	}
	        	
	        }
	        
	        return maxArea;
	        
	    }

	public static void main(String[] args) {
		
		int [] a = {5,2,12,1,5,3,4,11,9,4};
		System.out.println(maxArea(a));

	}

}
