import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] KEYPAD = {
        "",    
        "",     
        "abc",  
        "def",  
        "ghi",  
        "jkl",  
        "mno",  
        "pqrs", 
        "tuv",  
        "wxyz"  
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        backtrack(result, digits, new StringBuilder(), 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, StringBuilder currentCombination, int index) {
  
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = KEYPAD[digit - '0'];

        for (int i = 0; i < letters.length(); i++) {
            currentCombination.append(letters.charAt(i));       
            backtrack(result, digits, currentCombination, index + 1); 
            currentCombination.deleteCharAt(currentCombination.length() - 1); 
        }
    }
}
