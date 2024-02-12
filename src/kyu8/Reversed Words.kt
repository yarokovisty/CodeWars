package kyu8

object Reverse{
    fun reverseWords(str:String) = str.split(" ").reversed().joinToString(" ")
}