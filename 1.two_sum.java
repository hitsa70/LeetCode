/* input array is not sorted*/


import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       
/*         Runtime: 1 ms, faster than 99.97% of Java online submissions for Two Sum.
 Memory Usage: 39.5 MB, less than 82.79% of Java online submissions for Two Sum.   */
        
        HashMap <Integer,Integer>  hitesh =  new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) 
        {
            if (hitesh.containsKey(target - nums[i])) 
            {
                return new int[] {i,hitesh.get(target - nums[i])};
             }
        hitesh.put(nums[i], i);
    }
        
        
        
    /*Runtime: 51 ms, faster than 36.14% of Java online submissions for Two Sum.
Memory Usage: 39.8 MB, less than 58.10% of Java online submissions for Two Sum.*/
        
//     for(int i=0; i < nums.length-1; i++)
//     {
     
        
//      for(int j=i+1; j < nums.length; j++)
//      {
//         if(target==(nums[i]+nums[j]))
//             return new int[] {i,j};
//       }
       
        
//     }
        
        
    return new int[] {0};
    
    }
}
