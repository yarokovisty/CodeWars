/* Given an array of integers your solution should find the smallest integer. */

fun main() {
    println(findSmallestInt1(listOf(15, -50, 30, 20, 0, -13)))
    println(findSmallestInt2(listOf(15, -50, 30, 20, 0, -13)))
}

fun findSmallestInt1(nums: List<Int>) = nums.minOrNull()

fun findSmallestInt2(nums: List<Int>):Int {
    var min = nums[0]

    for (num in nums) {
        if (num < min) min = num
    }

    return min
}

