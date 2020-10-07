package main.april.week4

import kotlin.math.max


/**
Given two strings text1 and text2, return the length of their longest common subsequence.

A subsequence of a string is a new string generated from the original string with
some characters(can be none) deleted without changing the relative
order of the remaining characters. (eg, "ace" is a subsequence of "abcde" while "aec" is not).
A common subsequence of two strings is a subsequence that is common to both strings.

If there is no common subsequence, return 0.
 */



fun LCS(text1: String, text2: String): Int {

    if (text1.isEmpty() || text2.isEmpty()) return 0
    val arr = Array(text1.length + 1) { IntArray(text2.length + 1) }
    for (i in 0 until text1.length) {
        for (j in 0 until text2.length) {
            if (text1[i] == text2[j]) {
                arr[i + 1][j + 1] = arr[i][j] + 1
            } else {
                arr[i + 1][j + 1] = max(arr[i + 1][j], arr[i][j + 1])
            }
        }
    }
    Int.MAX_VALUE
    return arr[text1.length][text2.length]

}


//    return arr[text1.length()][text2.length()]
//    // Base case either one of strings is zero
//    if(text1.isEmpty() || text2.isEmpty() )
//        return 0
//    else
//    {
//        if(text1[text1.length-1]==text2[text2.length-1])
//        {
//            return 1 + LCS(text1.substring(0,text1.length-2),text2.substring(0,text1.length-2))
//        }else
//        {
//
//           return maxOf(LCS(text1.substring(0,text1.length-2),text2.substring(0,text1.length-3)),
//                LCS(text1.substring(0,text1.length-3),text2.substring(0,text1.length-2)))
//        }

    //}
//}

//}