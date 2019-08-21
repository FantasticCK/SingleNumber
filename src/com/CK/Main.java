package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0 ; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}