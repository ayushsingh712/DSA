class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length()-1;
        return check(s,left,right);
    }
    public static boolean check(String s,int left , int right){
        if(left >= right) return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
        return check(s,left+1,right-1);
    }
}