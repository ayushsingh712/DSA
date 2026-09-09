class Solution {
    public long countCommas(long n) {

        long ans = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n) {
            long next = start * 1000;
            long end = Math.min(n, next - 1);
            long numbers = end - start + 1;
            ans += numbers * commas;

            start = next;
            commas++;
        }
        return ans;
    }
}