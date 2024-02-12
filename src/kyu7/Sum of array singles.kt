package kyu7

fun repeats(arr: IntArray): Int = arr.filter { item -> arr.count{it == item} == 1 }.sum()