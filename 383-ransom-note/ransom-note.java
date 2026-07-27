class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap < Character,Integer> need = new HashMap<>();
        int mg = magazine.length();
        int rn = ransomNote.length();
        for(int i = 0;i < mg;i++){
            char m = magazine.charAt(i);
            need.put(m,need.getOrDefault(m , 0) + 1);
        }
        for(int i = 0;i < rn;i++){
            char ch = ransomNote.charAt(i);
            if (!need.containsKey(ch) || need.get(ch) == 0) {
                return false;
            }
            need.put(ch, need.get(ch) - 1);
        }
        return true;
    }
}