package Learn;

import java.util.ArrayList;
import java.util.List;

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

        // https://leetcode.com/problems/fizz-buzz/description/
        public List<String> fizzBuzz(int n) {
            List<String> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                if ((i+1) % 3 == 0 && (i+1) % 5 == 0) {
                    list.add("FizzBuzz");
                }else if ((i+1) % 3 == 0) {
                    list.add("Fizz");
                }else if ((i+1) % 5 == 0) {
                    list.add("Buzz");
                }else {
                    list.add(Integer.toString(i+1));
                }
            }
            return list;
        }


}
