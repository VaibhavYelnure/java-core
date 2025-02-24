package com.learning.core.day1session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo4 {
    public List<List<Integer>> findCombinations(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        backtrack(nums, k, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, k - 1, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
    	ArrayDemo4 arraydemo4 = new ArrayDemo4();
        int[] nums = {1, 2, 3};
        int k = 2;
        List<List<Integer>> combinations = arraydemo4.findCombinations(nums, k);
        System.out.println("Distinct combinations of " + k + " numbers:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
