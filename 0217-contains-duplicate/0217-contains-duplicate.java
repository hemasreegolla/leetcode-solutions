import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Create a HashSet to store elements from the array
        HashSet<Integer> seenNumbers = new HashSet<>();

        //Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            //Check if the element is already in the HashSet
            if (seenNumbers.contains(nums[i])) {
                return true; // duplicate found
            }
            // add the element to the Hashset
            seenNumbers.add(nums[i]);
        }

        return false; // no duplicates found
    }
}  
    