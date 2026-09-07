import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        
        int cp = 0;
        int ccp = 0;
        
        while (cp < g.length && ccp < s.length) {
            if (s[ccp] >= g[cp]) {
                cp++;
            }
            ccp++;
        }
        
        return cp;
    }
}
