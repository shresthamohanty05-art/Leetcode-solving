import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q42 {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> ans = new ArrayList<>();

      HashMap<String , List<String>> m = new HashMap<>();
       
     for(int i=0; i< strs.length; i++){
      String str = strs[i];

char[] chars = str.toCharArray();
Arrays.sort(chars);

String key = new String(chars);

if(m.containsKey(key)){
 m.get(key).add(str);
}else{
List<String> list = new ArrayList<>();
list.add(str);
m.put(key, list);
}
     }

     ans.addAll(m.values());
     return ans;

    }
}
