import java.util.ArrayList;
import java.util.List;

public class Q77 {
    static List<List<Integer>> ans = new ArrayList<>() ;
        
     public static  List<List<Integer>> combine(int n, int k) {
       ans.clear();
        helper(1, n, k, new ArrayList<>());
        return ans ;
    }
 public static void helper(int index, int n , int k , ArrayList<Integer> current){

    if(current.size() == k){
        ans.add(new ArrayList<>(current));
        return ;
    }

    if(index > n){
        return ; 
    }

    current.add(index);
    helper(index+1, n, k, current);
    current.remove(current.size()-1);
     helper(index+1, n, k, current);

 }

}
