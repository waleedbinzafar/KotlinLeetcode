package com.leetcode.kotlin.main

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
//
//
//Constraints:
//
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//Only one valid answer exists.

class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val diffMap = mutableMapOf<Int, Int>()
        nums.forEachIndexed{ index, int ->
            diffMap[int]?.let { return intArrayOf(it, index) }
            diffMap[target-int] = index
        }
        return intArrayOf()
    }

    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i + 1..nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

}



fun main(args: Array<String>){
    val solution = Solution1()
    val nums = intArrayOf(2,7,11,15)
    val target = 9
    println(solution.twoSum(nums, target).contentToString())
    println(solution.twoSumBruteForce(nums, target).contentToString())
}