import java.util.*;
public class Solution{

public List<Integer> f(int[] nums) {

     Set<Integer> set = new HashSet<Integer>();
     String temp = "";
     for(int i=0; i<nums.length; i++){
            if(temp.contains(""+nums[i])){
                set.add(nums[i]);
            }
            temp+=nums[i];
        }
     List<Integer> res = new ArrayList<Integer>(set);
        return res;
    }

}
