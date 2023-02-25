package assignment2;
import java.util.Arrays;

public class subsetchecking {

	public subsetchecking() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ]array1 = {3,7,1,5,2,4,9,6};
		int []array2 = {1,2,4};
		if (isSubset(array1,array2)) {
			System.out.println("Array 2 is a subset of array 1");
			
		}else {
			System.out.println("Array 2 is not a subset of Array 1");
			
		}
		

	}
	public static boolean
	isSubset (int []array1,int[] array2) {
		int array1Size= array1.length;
		int array2Size = array2.length;
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		int i=0,j=0;
		for (;i<array1Size&&j<array2Size;i++)
			if (array1[i]==array2[j]) {
				j++;
				
			}
	
	return(j==array2Size);
	}}

//successful

