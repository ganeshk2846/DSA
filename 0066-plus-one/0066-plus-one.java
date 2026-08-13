class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        while(digits[i]==9 && i>0)
            digits[i--]=0;
        
        //digits[i] += 1;
        if(i==0 && digits[i]==9)
        {
            int newDigits[] = new int[digits.length+1];
            newDigits[0]=1;
            return newDigits;
        }

        digits[i]++;
        return digits;
    }
}