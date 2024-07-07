package com.leetcode.kotlin.test

import com.leetcode.kotlin.main.Solution1
import org.jetbrains.annotations.TestOnly

@TestOnly
fun testTwoSum1() {
    val solution = Solution1()
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = solution.twoSum(nums, target)
    assert(result.contentEquals(intArrayOf(0, 1)))
}

@TestOnly
fun testTwoSum2() {
    val solution = Solution1()
    val nums = intArrayOf(3, 2, 4)
    val target = 6
    val result = solution.twoSum(nums, target)
    assert(result.contentEquals(intArrayOf(1, 2)))
}

fun main() {
    testTwoSum1()
    testTwoSum2()
    println("Two Sum tests passed")
}