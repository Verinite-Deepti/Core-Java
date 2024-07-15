package Arrays;

import java.util.HashSet;
import java.util.Set;

public class commonelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] arr1= {"apple","banana","watermelon","gauva","cherry"};
	String[] arr2= {"jackfruit","banana","muskmelon","gauva","pear"};
		
		
		
		
		Set<String> output=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j]) {
					output.add(arr1[i]);
					break;
				}
				
			}
		}
		
		for(String s:output) {
			System.out.println(s);
		}
	}

}
