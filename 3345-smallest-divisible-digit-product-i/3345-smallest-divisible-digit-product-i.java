class Solution {
    public int smallestNumber(int n, int t) {
        
        while(product(n)%t != 0)
        {
            n++;
        }
        return n;
    }
    public int product(int a)
    {
        int prod=1;
        while(a!=0)
        {
            prod *= a%10;
            a /= 10;
        }
        return prod;
    }
}