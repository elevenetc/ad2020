import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class Test {
    @Test
    fun test() {
        assertEquals(40000, day1Puzzle1(listOf(2000, 20)))
        assertEquals(40000, day1Puzzle1(listOf(20, 2000)))
        assertEquals(514579, day1Puzzle1(listOf(1721, 979, 366, 299, 675, 1456)))

        day1Puzzle1Solution()
    }
}