class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] copied = Arrays.copyOf(arr, n);
        HashMap <Integer,Integer> hm = new HashMap<>();
        Arrays.sort(copied);
        int [] res = new int[n];
        int rank = 1;
        for(int i = 0;i<n;i++){
            if(!hm.containsKey(copied[i])){
                hm.put(copied[i],rank);
                rank++;
            }
        }
        for(int i =0;i<n;i++){
            res[i] = hm.get(arr[i]);
        }
        return res;
    }
}