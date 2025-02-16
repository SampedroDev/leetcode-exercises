import Learn.TheLeetCodeBeginnersGuide;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TheLeetCodeBeginnersGuide theLeetCodeBeginnersGuide = new TheLeetCodeBeginnersGuide();

        // Exercise 1480. Running Sum of 1D Array
        int[] numbers = {1,2,5,7,8};
        System.out.println(Arrays.toString(theLeetCodeBeginnersGuide.twoSum(numbers, 7)));

        // Exercise 1672. Richest customer wealth
        int[][] accounts = {{1,2,3},{5,5,5}};
        System.out.println(theLeetCodeBeginnersGuide.maximumWealth(accounts));

        // Exercise 412. Fizz Buzz
        System.out.println(theLeetCodeBeginnersGuide.fizzBuzz(15));

        // Exercise 1342. Number of Steps to Reduce a Number to Zero
        System.out.println(theLeetCodeBeginnersGuide.numberOfSteps(14));

    }
}