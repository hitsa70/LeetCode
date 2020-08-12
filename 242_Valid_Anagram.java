// target to bring them in a same form and shape and compare using java inbuilt function 

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
