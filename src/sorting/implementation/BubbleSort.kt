package sorting.implementation

import sorting.BaseSort

/**
 * Created by ruben.quadros on 04/06/21
 **/
class BubbleSort: BaseSort() {

    /**
     * continuously swaps adjacent elements
     * puts highest element to end repeatedly
     */
    override fun sort(array: Array<Int>) {
        print("Before sorting (bubble sort): ")
        printArray(array)
        for (i in array.indices) {
            for (j in 0 until array.size-1-i) {
                if(array[j] > array[j+1]) {
                    val temp = array[j]
                    array[j] = array[j+1]
                    array[j+1] = temp
                }
            }
        }
        print("After sorting (bubble sort): ")
        printArray(array)
    }

    /**
     * perform bubble sort recursively
     */
    fun sortRecursion(array: Array<Int>) {
        print("Before sorting (bubble sort recursion): ")
        printArray(array)
        bubbleSortRecursion(array, array.size)
        print("After sorting (bubble sort recursion): ")
        printArray(array)
    }

    private fun bubbleSortRecursion(array: Array<Int>, n: Int) {
        if (n == 1) {
            return
        }
        for (i in 0 until n-1) {
            if(array[i] > array[i+1]) {
                val temp = array[i]
                array[i] = array[i+1]
                array[i+1] = temp
            }
        }
        bubbleSortRecursion(array, n-1)
    }

}