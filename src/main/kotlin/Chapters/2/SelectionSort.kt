package Chapters.`2`

// O(n * n) or O(n2)

fun main() =
    print(selectionSort(mutableListOf(23, 15, 2, 52, 3, 1, 58)))


fun findSmallest(arr: List<Int>): Int{
    var smallest = arr[0]
    var smallestIndex = 0

    for (i in 0 until arr.size -1){
      if (arr[i] < smallest){
          smallest = arr[i]
          smallestIndex = i
      }
    }
    return smallestIndex
}

fun selectionSort(arr: MutableList<Int>): List<Int>{
    val newArray = mutableListOf<Int>()

    for (j in 0 until arr.size ){
        val smallest = findSmallest(arr)
        newArray.add(arr.removeAt(smallest))
    }
    return newArray
}

