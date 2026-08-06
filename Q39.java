import java.util.ArrayList;
import java.util.List;

public class Q39 {
    
    static List<List<Integer>> ans = new ArrayList<>();
public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans.clear();
        helper( candidates,target , 0 , 0, new ArrayList<>());
        return ans ;
    }

    public static void helper(int[] candidates, int target, int index, int sum, ArrayList<Integer> current){

   if (sum == target){
    ans.add(new ArrayList<>(current));
   }

   if(sum>target){
    return ;
   }

   if(index == candidates.length){
    return;
   }

   current.add(candidates[index]) ; 

   helper(candidates, target, index, sum + candidates[index] , current);

   current.remove(current.size()-1);

   helper(candidates, target, index+1, sum, current);
    }

}
