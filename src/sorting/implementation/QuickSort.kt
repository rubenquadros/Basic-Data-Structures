package sorting.implementation

import sorting.BaseSort

/**
 * Created by ruben.quadros on 05/06/21
 **/
class QuickSort: BaseSort() {

    /**
     * choose a pivot element from array -> array{high}
     * put all elements less than pivot to left side
     * put all elements greater than pivot to right side
     * repeat for array{0} to array{pivot-1} || array{pivot+1} to array{end}
     */
    override fun sort(array: Array<Int>) {
        print("Before sorting (quick sort): ")
        printArray(array)
        var low = 0
        var high = array.size -1
        var top = -1
        val stack: Array<Int> = Array(high-low+1) { -1 }
        stack[++top] = low
        stack[++top] = high
        while (top >= 0) {
            high = stack[top--]
            low = stack[top--]
            val pi = partition(array, low, high)
            if(pi-1 > low) {
                stack[++top] = low
                stack[++top] = pi-1
            }
            if (pi+1 < high) {
                stack[++top] = pi+1
                stack[++top] = high
            }
        }
        print("After sorting (quick sort): ")
        printArray(array)
    }

    /**
     * sort array using quick sort recursively
     */
    fun sortRecursion(array: Array<Int>) {
        print("Before sorting (quick sort recursion): ")
        printArray(array)
        quickSortRecursion(array, 0, array.size-1)
        print("After sorting (quick sort recursion): ")
        printArray(array)
    }

    private fun quickSortRecursion(array: Array<Int>, low: Int, high: Int) {
        if (low < high) {
            val pi = partition(array, low, high)
            quickSortRecursion(array, low, pi-1)
            quickSortRecursion(array, pi+1, high)
        }
    }

    private fun partition(array: Array<Int>, low: Int, high: Int): Int {
        val pivot = array[high]
        var i = low - 1
        for (j in low until high) {
            if(array[j] < pivot) {
                i++
                swap(array, i, j)
            }
        }
        swap(array, i+1, high)
        return i+1
    }

    private fun swap(array: Array<Int>, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}