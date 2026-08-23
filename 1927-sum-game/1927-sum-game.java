class Solution {
    public boolean sumGame(String num) {
        int lqc,rqc,sumL,sumR;
        lqc=rqc=sumL=sumR=0;
        int n=num.length();
        for(int i=0;i<n;i++)
        {
            char ch=num.charAt(i);
            if(i < n/2)
            {
                if(ch=='?')
                    lqc++;
                else
                    sumL += ch - '0';
            }
            else
            {
                if(ch=='?')
                    rqc++;
                else
                    sumR += ch - '0';
            }
        }

        return (sumL-sumR) != 9 * (rqc-lqc) /2.0;
    }
}