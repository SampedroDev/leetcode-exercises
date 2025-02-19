package Learn;

import java.util.ArrayList;
import java.util.List;

public class TheLeetCodeBeginnersGuide {

    // https://leetcode.com/problems/running-sum-of-1d-array/description/
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    nums = new int[]{i, j};
                }
            }
        }
        return nums;
    }

    // https://leetcode.com/problems/richest-customer-wealth/description/
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        int maximumWealthTemp = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
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
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                list.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                list.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i + 1));
            }
        }
        return list;
    }

    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
    public int numberOfSteps(int num) {
        int steps = 0;
        do {
            if (num % 2 != 0) {
                num = num - 1;
                steps++;
            }
            if (num != 0) {
                num = num / 2;
                steps++;
            }
        } while (num != 0);
        return steps;
    }

    // https://leetcode.com/problems/middle-of-the-linked-list/description/
    public ListNode createListNode(int n){
        if (n <= 0) return null;
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= n; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        return head;
    }
    public void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        count = count/2;
        for (int i = 0; i < count; i++) {
            head = head.next;
        }
        return head;
    }

}

// Definition for singly-linked list. (Exercise 876)
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
