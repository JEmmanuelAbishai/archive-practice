class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder pal = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                pal.append(Character.toLowerCase(ch));
            }
        }
        return palind(pal.toString());
    }

    private boolean palind(String s){
        int lp = 0, rp = s.length() - 1;
        while(lp < rp){
            if(s.charAt(lp) != s.charAt(rp)) return false;

            lp++;
            rp--;
        }

        return true;

    }
}