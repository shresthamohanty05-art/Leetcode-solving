import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> ans = new ArrayList<>();

     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(0, 0, candidates, target, new ArrayList<>());
        return ans ;
    }

    public void helper(int index, int sum, int[] candidates, int target, ArrayList<Integer> current){

        if(sum>target){
            return;
        }

        if(sum == target){
            ans.add(new ArrayList<>(current));
            return;
        }

for(int i = index ; i<candidates.length ; i++){


    if(i>index && candidates[i] == candidates[i-1]){
        continue;
    }

    current.add(candidates[i]);
    helper(i+1, sum + candidates[i], candidates, target, current);
    current.remove(current.size()-1);
}


    }

}
