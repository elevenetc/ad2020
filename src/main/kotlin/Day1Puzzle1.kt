/**
 * Specifically, they need you to find the two entries that sum to 2020 and then multiply those two numbers together.
 */
fun day1Puzzle1(nums: List<Int>): Int {
    val sum = 2020
    val pairs = mutableMapOf<Int, Int>()
    for ((index, a) in nums.withIndex()) {
        val rem = sum - a
        when {
            pairs.containsKey(rem) -> {

                val b = nums[pairs[rem]!!]

                return a * b
            }
            pairs.containsKey(a) -> {
                val b = nums[pairs[a]!!]

                return a * b
            }
            else -> {
                pairs[rem] = index
            }
        }
    }
    return -1
}

fun day1Puzzle1Solution() {
    val input = readLines("data/data-dat-1-puzzle-1.txt").map { it.toInt() }
    val result = day1Puzzle1(input)
    println("day1Puzzle1: $result")
}