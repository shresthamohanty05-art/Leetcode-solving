import java.util.ArrayList;
import java.util.List;

public class Q216 {
    public static void main(String[] args) {
        
    }
   static List<List<Integer>> ans = new ArrayList();
 
   public static List<List<Integer>> combinationSum3(int k, int n) {
         ans.clear();
        helper( 1 , 0, new ArrayList<>(), k, n );
        return ans ;
    }
    
    public static void helper(int index, int sum , ArrayList<Integer> current, int k, int n){
        if(current.size() == k && sum == n){
            ans.add(new ArrayList<>(current));
            return;
        }

        if(sum>n){
            return ;
        }

        if(index>9){
            return ;
        }

        current.add(index);

        helper(index+1, sum +index, current, k, n);

        current.remove(current.size()-1);

        helper(index+1, sum, current, k, n);
    }
}
