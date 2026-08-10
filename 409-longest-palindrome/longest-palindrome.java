class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character,Integer> h = new HashMap<>();
        int n = s.length();
        int count = 0;
        boolean odd = false;
        for(int i = 0;i < n;i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0) + 1);
        }
        for(Map.Entry<Character,Integer> entry : h.entrySet()){
            int freq = entry.getValue();
            if(freq % 2 == 0){
                count = count + freq;
            } else {
                odd = true;
                int use = freq - (freq % 2);
                count = count + use;
            }
        }
        if(odd) count++;
        return count;
    }
}