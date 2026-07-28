class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap <Character,Integer> have = new HashMap<>();
        HashMap <Character,Integer> need = new HashMap<>();
        for (char ch : text.toCharArray()) {
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }
        need.put('b',1);
        need.put('a',1);
        need.put('l',2);
        need.put('o',2);
        need.put('n',1);

        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : need.entrySet()) {
            char ch = entry.getKey();
            int required = entry.getValue();
            int available = have.getOrDefault(ch, 0);
            ans = Math.min(ans, available / required);
        }
        return ans;
    }
}