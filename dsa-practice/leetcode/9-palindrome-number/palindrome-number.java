class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int ld = 0;
        int pal = 0;
        while(n > 0){
            ld = n % 10;
            pal = (pal * 10) + ld;
            n = n / 10;
        }

    
    return x == pal;
    }
}