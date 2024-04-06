package TRAINING;

public class UpL {
	public String  name() {
		return name();
		
	}
	
	
	
	public static void main(String arg[]) {
		
		String name = "Arunr";
		
		String[] str=name.split(" ");
	
		for(int i=0;i<=name.length();i++) {
			for(int j=i+1;j<=name.length();j++) {
				if(i==j) {
					System.out.println();
					
				}
			}
		}
		
		
		
	}
	
	
	
}


