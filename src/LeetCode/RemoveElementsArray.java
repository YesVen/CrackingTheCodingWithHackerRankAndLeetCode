/**
 * 	Given an array and a value, remove all instances of that value in place and return the new length.

	Do not allocate extra space for another array, you must do this in place with constant memory.
	
	The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	
	Example:
	Given input array nums = [3,2,2,3], val = 3
	
	Your function should return length = 2, with the first two elements of nums being 2.
 */

package LeetCode;

public class RemoveElementsArray {

	public static int removeElement(int[] nums, int val) {
        
        int i=0;
        while(i<nums.length && nums[i]!=val){
            i++;
        }
        
        if(i<nums.length-1){
            for(int j =i+1; j<nums.length; j++){
                if(nums[j]!=val){
                    int temp = nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    i++;
                }
            }
        }
        if(i==nums.length){
            return nums.length;
        }else{
            return i;
        }
    }
}
