package org.example.Chapters.`1`

// O(n) time

fun main(args: Array<String>) {
    val myList = intArrayOf(1, 3, 5, 7, 9)

    println( binarySearch(myList, 3).toString())
}

fun binarySearch(array: IntArray, target: Int): Int? {
    var low = 0
    var high = array.size - 1

    while (low <= high) {
        val mid = (low + high) / 2
        val guess = array[mid]

        if (guess == target) {
            return mid
        } else if (guess > target) {
            high = mid - 1
        } else if (guess < target) {
            low = mid + 1
        }
    }
    return null
}
