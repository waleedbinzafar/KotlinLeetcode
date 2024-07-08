package com.leetcode.kotlin.main

class Solution2 {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length<2){return s.length}
        val start=0
        val substrings = mutableListOf<String>()
        for (i in start..s.length-1) {
            val occurrenceList=mutableListOf<Char>()
            for (index in i..s.length-1) {
                if (s[index] in occurrenceList){
                    substrings.add(s.slice(i..index-1))
                    break
                } else {
                    occurrenceList.add(s[index])
                }
                if (index==s.length-1){
                    substrings.add(s.slice(i..index))
                }
            }
        }
        return substrings.maxOfOrNull { it.length }!!
    }
}

fun main() {
//    val string = "abcabcdbb"
    val string = "au"
    val solution = Solution2()
    println(string.length)
    println(solution.lengthOfLongestSubstring(string))
}