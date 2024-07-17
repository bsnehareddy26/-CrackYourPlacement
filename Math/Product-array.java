class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] product = new long[n];
        //Edge case
        if(n == 1) {
            product[0] = 1;
            return product;
        }
        for(int i =0; i < n ;i++) {
            long pro =1;
            for(int j =0; j < n; j++) {
                //if i == n then that is not multiplied to the product
                if(i != j)
                pro *= nums[j];
            }
            product[i] = pro;
        }
        return product;
        
        
	} 
} 
