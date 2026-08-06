import java.util.ArrayList;
import java.util.List;

/**
  * Q78
  */
 public class Q78 {
 
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
       List<List<Integer>> ans = subsets(nums);
       System.out.println(ans);
    }
 static  List<List<Integer>> ans = new ArrayList<>();
     public static List<List<Integer>> subsets(int[] nums){
        ans.clear();
        helper( nums , 0, new ArrayList<>());
        return ans ;
        
     }

    public static  void helper(int[] nums , int index, ArrayList<Integer> current){
    if(index==nums.length){
        ans.add(new ArrayList<>(current));
        return ;
    }

    current.add(nums[index]);

    helper(nums, index+1, current);

    current.remove(current.size()-1);

    helper(nums, index+1, current);
    }
 }