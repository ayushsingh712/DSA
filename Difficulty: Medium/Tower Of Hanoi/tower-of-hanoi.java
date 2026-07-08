class Solution {
    static int count;
    
    public void Hanoi(int n, char from, char to, char aux) {
        if(n==0) return;
        Hanoi(n-1,from,aux,to);
        count++;
        Hanoi(n-1,to,from,aux);
    }
    public int towerOfHanoi(int n,int from, int to, int aux) {
      count = 0;
      Hanoi(n,'A','B','C');
      return count;
    }
}
