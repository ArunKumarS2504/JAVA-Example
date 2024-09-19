package Arrays;

public class missingElement {
    
    
    public static void main(String arg[]){
        
    	int num[] = {1,2,3,2,3,4,5,9,8,6,6};
    	int n = num.length;
    	for(int i=0;i<n-1;i++) {
    		for(int j=i+1;j<n;j++) {
    			if(num[i]>num[j]) {
    				int temp = num[i];
    				num[i] = num[j];
    				num[j] = temp;
    			}
    		}
    	}
    
    	int unique = 0;
    	
    	for(int i=0;i<n-1;i++) {
    		if(num[i] != num[i+1]) {
    			num[unique] = num[i];
    			unique++;
    		}
    	}
    	
    	num[unique] = num[n-1];
    	unique++;
    	System.out.print("Array without Duplicates : ");
    	for(int i=0;i<unique;i++) {
    		System.out.print(num[i]+" ");
    	}
    	//output should be = 1,2,3,4,5    
    }
}
