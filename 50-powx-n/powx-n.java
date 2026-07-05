class Solution {
    public double myPow(double x, int n) {
        int N = n;
        if (n < 0) {
            x = 1/x;
            N = -N;
        }   
        return Pow(x,N);
    }
    public double Pow(double a, int b){
        if(b == 0) return 1;
        double call = Pow(a,b/2);
        if(b % 2 == 0) return call * call;
        else return call * call * a;
    }
}