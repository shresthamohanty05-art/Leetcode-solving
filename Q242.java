import java.util.HashMap;

public class Q242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 1;
        for(int i=0; i<s.length() ; i++){
       char ch = s.charAt(i);
      if(map.containsKey(ch)){
         map.put(ch, map.get(ch)+1);
      }else{
        map.put(ch, count);
      }
        }
 for (int i = 0; i < t.length(); i++) {
    char cha = t.charAt(i);
    if (!map.containsKey(cha)) {
        return false;
    }
    int c = map.get(cha);
    map.put(cha, c - 1);
}

for (int value : map.values()) {
    if (value != 0) {
        return false;
    }
}

return true;
}


}
