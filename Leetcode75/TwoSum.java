package Leetcode75;
import java.util.*;
public class TwoSum
{
//        int[] twoSumBruteForce(int[] nums, int target) {
//
//            for (int i = 0; i < nums.length; i++) {
//                for (int j = 0; j < nums.length; j++) {
//                    if (nums[i] + nums[j] == target)
//                        return new int[]{i, j};
//                }
//            }
//            throw new IllegalArgumentException("No two sum solution");
//        }
        int[] twoSumHashing(int[] nums, int target)
        {

            // Create a HashMap
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++)
            {


                int diff_value = target - nums[i];

                // Search the hashmap for complement, if found, we got our pair
                if (map.containsKey(diff_value))
                {
                    return new int[]{map.get(diff_value), i};
                }

                // Put the element in hashmap for subsequent searches.
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }

}

