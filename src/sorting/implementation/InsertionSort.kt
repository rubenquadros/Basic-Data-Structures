package sorting.implementation

import sorting.BaseSort

/**
 * Created by ruben.quadros on 05/06/21
 **/
class InsertionSort: BaseSort() {

    /**
     * uses 2 sub-arrays
     * iterates from 1 to array size
     * checks key = array{i} with previous element array{i-1}
     * if previous element > key then move previous elements one position up
     * put key at correct position (sorted sub-array)
     */
    override fun sort(array: Array<Int>) {
        print("Before sorting (insertion sort): ")
        printArray(array)
        for(i in 1 until array.size) {
            val key = array[i]
            var j = i-1
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j]
                j--
            }
            array[j+1] = key
        }
        print("After sorting (insertion sort): ")
        printArray(array)
    }

    /**
     * sort array using insertion sort recursively
     */
    fun sortRecursion(array: Array<Int>) {
        print("Before sorting (insertion sort recursion): ")
        printArray(array)
        insertionSortRecursion(array, array.size)
        print("After sorting (insertion sort recursion): ")
        printArray(array)
    }

    private fun insertionSortRecursion(array: Array<Int>, n: Int) {
        if (n <= 1) {
            return
        }
        insertionSortRecursion(array, n-1)
        val last = array[n-1]
        var j = n-2
        while (j >= 0 && array[j] > last) {
            array[j+1] = array[j]
            j--
        }
        array[j+1] = last
    }
}