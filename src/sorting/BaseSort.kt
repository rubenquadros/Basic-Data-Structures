package sorting

/**
 * Created by ruben.quadros on 04/06/21
 **/
abstract class BaseSort {
    /**
     * print the given array
     */
    fun printArray(array: Array<Int>) {
        for(i in array.indices) {
            print("${array[i]} ")
        }
        print("\n")
    }

    abstract fun sort(array: Array<Int>)
}