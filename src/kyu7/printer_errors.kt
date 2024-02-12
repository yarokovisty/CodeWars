package kyu7

fun printerError(s: String) = "${s.count { it !in 'a'..'m' }}/${s.length}"