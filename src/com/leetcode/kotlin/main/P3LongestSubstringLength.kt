package com.leetcode.kotlin.main

class Solution2 {
    fun lengthOfLongestSubstring(s: String): Int {
        var start=0
        val substrings = mutableListOf<String>()
        for (i in start..s.length-1) {
            val occurrenceList=mutableListOf<Char>()
            for (index in i..s.length-1) {
                println(occurrenceList)
                if (s[index] in occurrenceList){
                    substrings.add(s.slice(i..index-1))
                    break
                } else {
                    occurrenceList.add(s[index])
                }
            }
        }
        return substrings.maxOfOrNull { it.length }!!
    }
}

fun main() {
    val string = "abcabcdbb"
    val solution = Solution2()
    println(string.length)
    println(solution.lengthOfLongestSubstring(string))
}