class Solution {
    public String reverseWords(String s) {
        String[] sntc = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for(int i = sntc.length-1; i >=0; i--){
            ans.append(sntc[i]);
            if(i > 0){
                ans.append(" ");
            }
        }  

        return ans.toString();
    }
}