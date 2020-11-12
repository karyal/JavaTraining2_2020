package library_classes;

import java.util.List;
import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		int nums1[] = {2, 3, 4, 5, 1, 2, 6};
		int nums2[] = {2, 3, 4, 5, 1, 2, 6};
		
		//Array to List
		List list1 = Arrays.asList(nums1);
		//System.out.println(nums.length);
		//System.out.println(list1.size());
		
		//int binarySearch(byte[] a, byte key)
		int n = 4;
		int res1 = Arrays.binarySearch(nums1, n);
		//System.out.println(res1);
		
		//int compare(byte[] a, byte[] b)		
		int res2 = Arrays.compare(nums1, nums2);
		//System.out.println(res2);
		
		//boolean equals(int[] a, int[] a2)
		boolean res3 = Arrays.equals(nums1, nums2);
		System.out.println(res3);
		
		//int hashCode(int[] a)
		int hash_code1 = Arrays.hashCode(nums1);
		System.out.println(hash_code1);
		int hash_code2 = Arrays.hashCode(nums2);
		System.out.println(hash_code2);
		if (hash_code1 == hash_code2) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
		
		//void sort(int[] a)
		print_array(nums1);
		Arrays.sort(nums1);
		print_array(nums1);
		
		//String		toString(int[] a)
		String tmp_str = Arrays.toString(nums1);
		System.out.println(tmp_str);
	}
	
	public static void print_array(int nums[]) {
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
}
