class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        return ((n>>k)%2 == 1);
    }
}