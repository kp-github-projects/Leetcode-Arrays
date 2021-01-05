//Max findMaxConsecutiveOnes:

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur = 0;
        int lar = 0;
        
        for (int i : nums)
        {
            if (i == 1){
                cur++;
            }else {
                cur = i;
            }
            if (cur>lar){
                lar = cur;
            }
        }
        return lar;
    }
}