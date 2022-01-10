package arrays

// Suppose you have a long flowerbed in which some of the plots are planted and some are not
// However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
// Given a flowerbed (represented as an array containing booleans), return if a given number of
// new flowers can be planted in it without violating the no-adjacent-flowers rule.
//
// Input: [1, 0, 0, 0, 0, 0, 1, 0, 0]
//
//  3 => true (3 cannot be planted)
//  4 => false (4 cannot be planted)
//
// Input: [1, 0, 0, 1, 0, 0, 1, 0, 0]
//
//  1 => true
//  2 => false
//
// Input: [0]
//
//  1 => true
//  2 => false

class Flowers {
    fun canPlaceFlowers(flowerbed: List<Int>, numberOfNewFlowers: Int): Boolean {
        var counter = 0
        val newFlowerbed = flowerbed.toMutableList()
        for (i in 0 until newFlowerbed.size) {
            val current = newFlowerbed[i]
            counter = if (current == 0) {
                if (hasPreviousValue(i) && hasNextValue(newFlowerbed, i)) {
                    val previous = newFlowerbed[i - 1]
                    val next = newFlowerbed[i + 1]
                    if (previous == 0 && next == 0) {
                        newFlowerbed[i] = 1
                        counter + 1
                    } else {
                        counter
                    }
                } else if (hasNextValue(newFlowerbed, i) && newFlowerbed[i + 1] == 0) {
                    newFlowerbed[i] = 1
                    counter + 1
                } else if (hasPreviousValue(i) && newFlowerbed[i - 1] == 0) {
                    newFlowerbed[i] = 1
                    counter + 1
                } else {
                    newFlowerbed[i] = 1
                    counter + 1
                }
            } else {
                counter
            }
        }
        return counter == numberOfNewFlowers
    }

    private fun hasPreviousValue(i: Int): Boolean = i > 0

    private fun hasNextValue(flowerbed: List<Int>, i: Int): Boolean = i < flowerbed.size - 1
}
