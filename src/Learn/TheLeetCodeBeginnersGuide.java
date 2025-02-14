package Learn;

public class TheLeetCodeBeginnersGuide {

    // https://leetcode.com/problems/running-sum-of-1d-array/description/
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length - 1; i++){
            for(int j=i + 1; j<nums.length; j++){
                if(target == nums[i] + nums[j]){
                    nums = new int[]{i,j};
                }
            }
        }
        return nums;
    }

    // https://leetcode.com/problems/richest-customer-wealth/description/
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        int maximumWealthTemp = 0;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                maximumWealthTemp += accounts[i][j];
            }
            if (maximumWealthTemp > maximumWealth) {
                maximumWealth = maximumWealthTemp;
            }
            maximumWealthTemp = 0;
        }
        return maximumWealth;
    }

}
