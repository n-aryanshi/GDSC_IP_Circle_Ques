class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
    	for(int i=0; i<N;i++){
    	    
    	    if(A[i]>minValue){
    	        minValue=A[i];
    	    }
    	    
    	    if(A[i]<maxValue){
    	        maxValue=A[i];
    	    }
    	    
    	}
    	
    	int sum = minValue + maxValue;
    	return sum;
    }
}
