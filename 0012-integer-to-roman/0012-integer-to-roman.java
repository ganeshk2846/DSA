class Solution {
    public String intToRoman(int num) {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            if(num==0) break;

            count = num/values[i];
            if(count>0)
            {
                sb.append(romans[i].repeat(count));
                num %= values[i];
            }
        }
        return sb.toString();
    }
}