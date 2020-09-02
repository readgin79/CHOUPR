package leetcode.sort.mergesortedarray;

import java.util.Arrays;

public class Solution {
/*
 * 1.
 * Input:
   nums1 = [1,2,3,0,0,0], m = 3
   nums2 = [2,5,6],       n = 3
	
   Output: [1,2,2,3,5,6]
   
   2.
   Input:
   nums1 = [1,2,3,4,0,0,0], m = 4
   nums2 = [2,5,6],       n = 3
	
   Output: [1,2,2,3,4,5,6]
   
   [5,4,8,4,5]->[4,5,8,4,5]
 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m; i<m+n; i++) {
        	nums1[i] = nums2[i-m];
        }
        int temp;
        for(int i=0; i<nums1.length; i++) {
        	for(int j=i+1; j<nums1.length; j++) {
        		if(nums1[i]>nums1[j]) {
        			temp = nums1[i];
        			nums1[i] = nums1[j];
        			nums1[j] = temp;
        		}
        	}
        }
        
        for(int number: nums1) {
        	System.out.println(number);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3,4,0,0,0};
		int nums2[] = {2,5,6};
		Solution solution = new Solution();
		solution.merge(nums1, 4, nums2, 3);
	}

}
