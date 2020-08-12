// target to bring them in a same form and shape and compare using java inbuilt function 
// Runtime: 2 ms, faster than 97.45% of Java online submissions for Valid Anagram.
// Memory Usage: 39.8 MB, less than 66.53% of Java online submissions for Valid Anagram.



class Solution {
    public boolean isAnagram(String s, String t) {
        
   //step 1 storing
    char arr1[]=s.toCharArray();
    char arr2[]=t.toCharArray();
    
    //step 2 sorting 
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    
    //step 3 Storing 
    String s1=new String(arr1);
    String s2=new String(arr2);
    
    //step 4 Checking
    if(s1.equals(s2))
    return true;
    else
    return false;
        
    }
}
