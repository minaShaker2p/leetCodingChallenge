package main.october.week3

/*
All DNA is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T', for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

Example 1:

Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]
Example 2:

Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]
 */

fun findRepeatedDnaSequences(s: String): List<String> {
    val map = HashMap<String, Int>()
    val result = mutableListOf<String>()
    val size = s.length - 10
    for (index in 0..size) {
        val substring = s.subSequence(index, index + 10).toString()
        if (map.containsKey(substring)) {
            val value = map[substring] ?: 0
            map[substring] = value + 1
        } else {
            map[substring] = 1
        }
    }
    map.forEach {
        if (it.value > 1)
            result.add(it.key)
    }
    return result
}