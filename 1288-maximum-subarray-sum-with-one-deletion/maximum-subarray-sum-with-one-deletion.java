class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int power = 0;
        int no_power = arr[0];
        int res = arr[0];
        for(int i = 1; i<n;i++){
            int v1 = arr[i];
            int v2 = no_power + arr[i];
            int v3 = power + arr[i];
            int v4 = no_power;
            res = Math.max(res,Math.max(Math.max(v1,v2),Math.max(v3,v4)));
            no_power = Math.max(v1,v2);
            power = Math.max(v3,v4);
        }
        return res;
    }
}