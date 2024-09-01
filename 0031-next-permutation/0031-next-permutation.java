
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        
        // Step 1: Find the first decreasing element from the end
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        
        // Step 2: If there was a decreasing element, find the element to swap with
        if (ind != -1) {
            for (int i = nums.length - 1; i > ind; i--) {
                if (nums[i] > nums[ind]) {
                    swap(nums, i, ind);
                    break;
                }
            }
        }
        
        // Step 3: Reverse the sequence after the index `ind`
        reverse(nums, ind + 1, nums.length - 1);
        
       
    }
    
    // Method to swap two elements in the array
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    // Method to reverse the array from start to end
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
