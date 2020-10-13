package main.october.week2

/**
Given two strings A and B of lowercase letters, return true if you can swap two letters in A
so the result is equal to B, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed)
such that i != j and swapping the characters at A[i] and A[j].
For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

Example 1:

Input: A = "ab", B = "ba"
Output: true
Explanation: You can swap A[0] = 'a' and A[1] = 'b' to get "ba", which is equal to B.
Example 2:

Input: A = "ab", B = "ab"
Output: false
Explanation: The only letters you can swap are A[0] = 'a' and A[1] = 'b', which results in "ba" != B.
Example 3:

Input: A = "aa", B = "aa"
Output: true
Explanation: You can swap A[0] = 'a' and A[1] = 'a' to get "aa", which is equal to B.
Example 4:

Input: A = "aaaaaaabc", B = "aaaaaaacb"
Output: true
 **/

fun buddyStrings(A: String, B: String): Boolean {
    if (A.length != B.length)
        return false

    val diff = mutableListOf<Int>()
    if (A == B) {
        val uniqueChar= HashSet<Char>()
        A.forEach {
            uniqueChar.add(it)
        }
        return uniqueChar.size < A.length
    } else {
        A.forEachIndexed { index, _ ->
            if (A[index] != B[index])
                diff.add(index)
        }
        return diff.size == 2 && (A[diff[0]] == B[diff[1]] && A[diff[1]]== B[diff[0]] )
    }
}