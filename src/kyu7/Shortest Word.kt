package kyu7

fun findShort(s: String) = s.split(" ").minOfOrNull { it.length }