package sorting.implementation

import sorting.BaseSort

/**
 * Created by ruben.quadros on 04/06/21
 **/
class SelectionSort: BaseSort() {

    /**
     * uses 2 sub arrays
     * 1 - sorted sub-array
     * 2 - unsorted sub-array
     * every iteration minimum element from unsorted sub-array is moved to sorted sub-array
     */
    override fun sort(array: Array<Int>) {
        print("Before sorting (selection sort): ")
        printArray(array)
        for (i in array.indices) {
            var minIndex = i
            for (j in i+1 until array.size) {
                if(array[j] < array[minIndex]) {
                    minIndex = j
                }
            }
            val temp = array[minIndex]
            array[minIndex] = array[i]
            array[i] = temp
        }
        print("After sorting (selection sort): ")
        printArray(array)
    }
}