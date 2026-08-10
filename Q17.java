import java.util.ArrayList;
import java.util.List;
public class Q17 {
  StringBuilder current = new StringBuilder();
     public List<String> letterCombinations(String digits) {
       List<String> ans = new ArrayList<>();

       if(digits.length() ==0){
        return ans ;
       }
        helper(digits , 0, current, ans);
        return ans ;
    }

    public void helper(String digits , int index, StringBuilder current, List<String> ans){

        if(index == digits.length()){
        ans.add(current.toString());
             return ; 
        }
        char digit = digits.charAt(index);
        
        String[] mapping = {
            "" , "" , "abc" , "def" , "ghi" , "jkl", "mno" , "pqrs" , "tuv" , "wxyz"

        };

        int value = digit - '0' ;
        String letters = mapping[value];


        for(int i=0 ; i<letters.length() ; i++){
           char ch = letters.charAt(i);

           current.append(ch);

           helper(digits, index+1, current, ans);

           current.deleteCharAt(current.length()-1);

           
        }
    }
}
