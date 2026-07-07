class Solution {
    public List<String> powerSet(String s) {
        List <String> list = new ArrayList<>();
        String em = "";
        pow(s,list,em,0);
        Collections.sort(list);
        return list;
    }
    public void pow(String s,List <String> list,String em,int idx) {
        if(idx == s.length()){
            list.add(em);
            return;
        }
        
        pow(s,list,em,idx+1); // not pick
        pow(s,list,em+s.charAt(idx),idx+1); // pick
    }
}