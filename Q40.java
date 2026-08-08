import java.util.ArrayList;
import java.util.List;

public class Q40 {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> ans = new ArrayList<>();

     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans.clear();
        helper(0, 0, candidates, target, new ArrayList<>());
        return ans ;
    }

    public void helper(int index, int sum, int[] candidates, int target, ArrayList<Integer> current){
        if(index == candidates.length){
            return ;
        }

        if(sum>target){
            return;
        }

        if(sum == target){
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(candidates[index]);

        helper(index+1, sum+candidates[index], candidates, target, current);

        current.remove(current.size()-1);

        helper(index+1, sum, candidates, target, current);


    }

}
