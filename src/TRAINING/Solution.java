package TRAINING;



class Solution {
	int[] getCumulativeSum (int[] arr) {
		
		if(arr==null || arr.length==0){
			return new int[0];
		}
		int n = arr.length;
		int[] cumulativeSum = new int[n];
		cumulativeSum[0]= arr[0];
		
		for(int i=0;i<n;i++){
			cumulativeSum[i] = cumulativeSum[i-1]+arr[i];
		}
		return cumulativeSum;
	}
	
	public static void main(String arg[]){
		Solution sol = new Solution();
		int[] arr1={1,2,3,4};
		int[] arr2={1,1,1,1,1};
		int[] arr3={1,2,5,7,9};
		int[] cumulativesum1=sol.getCumulativeSum(arr1);
		int[] cumulativesum2=sol.getCumulativeSum(arr2);
		int[] cumulativesum3=sol.getCumulativeSum(arr3);
	
		
		System.out.println(cumulativesum1);
		System.out.println(cumulativesum2);
		System.out.println(cumulativesum3);
		
	}
}

	

	
	
	
	

	



     