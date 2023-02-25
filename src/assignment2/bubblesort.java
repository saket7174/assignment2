package assignment2;
import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {3,7,1,5,2,4,9,6};
		System.out.println("Original Array:"+Arrays.toString(nums));
		bubbleSort(nums);
		System.out.println("Sorted Array:"+Arrays.toString(nums));

	}
	public static void bubbleSort(int[]nums) {
		int n=nums.length;
		for (int i=0;i<n-1;i++) {
			for (int j=0;j<n-i-1;j++) {
				if (nums[j]>nums[j+1]) {
					int temp =nums[j];
					nums[j]=nums[j+1];
				nums[j+1]=temp;
			}
		}
	}

}
}
