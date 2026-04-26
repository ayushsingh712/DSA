class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // explain later
        List<List<Integer>> res = new ArrayList<>();
        int start1 = intervals[0][0];
        int end1 = intervals[0][1]; // zero index handled
        for(int i = 1;i < intervals.length;i++){
            int start2 = intervals[i][0]; 
            int end2 = intervals[i][1];
            if(end1 >= start2){ //Merge karna hai
                end1 = Math.max(end1,end2); 
            }else{
                res.add(Arrays.asList(start1,end1));
                start1 = start2;
                end1 = end2; 
            }
        }
        res.add(Arrays.asList(start1,end1));
        int[][] ans = new int[res.size()][2]; // for ans format

        for(int i = 0; i < res.size(); i++){
        ans[i][0] = res.get(i).get(0);
        ans[i][1] = res.get(i).get(1);
        }

        return ans;
    }
}