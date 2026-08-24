import java.util.HashMap;
import java.util.HashSet;

class Q217{
    public static void main(String[] args) {
        
    }

    public boolean containsDuplicate(int[] nums){
        // HashMap<Integer, Integer> m = new HashMap<>();
        // for(int num:nums){
        //     if(m.containsKey(num)){
        //        return true;
        //     }else{
        //         m.put(num, 1);
        //     }
        // }
        // return false ;

        HashSet<Integer> set = new HashSet<>();

for (int num : nums) {
    if (set.contains(num)) {
        return true;
    }
    set.add(num);
}

return false;
    }


}