package sorting.implementation

import sorting.BaseSort

/**
 * Created by ruben.quadros on 05/06/21
 **/
class MergeSort: BaseSort() {

    /**
     * keep splitting the array into 2 parts
     * part 1 -> array{0} to array{mid}
     * part 2 -> array{mid+1} to array{end}
     * keep merging these arrays by sorting
     */
    override fun sort(array: Array<Int>) {
        print("Before sorting (merge sort): ")
        printArray(array)
        var currSize = 1
        val n = array.size
        while (currSize < n) {
            var left = 0
            while (left < n-1) {
                val mid = Math.min(left+currSize-1, n-1)
                val end = Math.min(left+(2*currSize-1), n-1)
                merge(array, left, mid, end)
                left += 2 * currSize
            }
            currSize *= 2
        }
        print("After sorting (merge sort): ")
        printArray(array)
    }

    /**
     * sort array using merge sort recursively
     */
    fun sortRecursion(array: Array<Int>) {
        print("Before sorting (merge sort recursion): ")
        printArray(array)
        sort(array, 0, array.size-1)
        print("After sorting (merge sort recursion): ")
        printArray(array)
    }

    private fun sort(array: Array<Int>, start: Int, end: Int) {
        if (start < end) {
            val mid = start + (end-start)/2
            sort(array, start, mid)
            sort(array, mid+1, end)
            merge(array, start, mid, end)
        }
    }

    private fun merge(array: Array<Int>, start: Int, mid: Int, end: Int) {
        val n1 = mid - start + 1
        val n2 = end - mid
        val leftArray: Array<Int> = Array(n1) { -1 }
        val rightArray: Array<Int> = Array(n2) { -1 }
        for (i in 0 until n1) {
            leftArray[i] = array[i+start]
        }
        for (j in 0 until n2) {
            rightArray[j] = array[mid+j+1]
        }
        var i = 0
        var j = 0
        var k = start
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i]
                i++
            } else {
                array[k] = rightArray[j]
                j++
            }
            k++
        }
        while (i < n1) {
            array[k] = leftArray[i]
            i++
            k++
        }
        while (j < n2) {
            array[k] = rightArray[j]
            j++
            k++
        }
    }
}