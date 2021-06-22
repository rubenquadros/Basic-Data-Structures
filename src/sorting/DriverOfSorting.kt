package sorting

import sorting.implementation.*

/**
 * Created by ruben.quadros on 04/06/21
 **/
class DriverOfSorting {
    init {

        print("\n")
        println("=============== SORTING ================")
        println("\n")

        //sort array using selection sort
        //40 30 50 100 20 10 60
        //10 30 50 100 20 40 60
        //10 20 50 100 30 40 60
        //10 20 30 100 50 40 60
        //10 20 30 40 50 100 60
        //10 20 30 40 50 100 60
        //10 20 30 40 50 60 100
        val selectionSort = SelectionSort()
        selectionSort.sort(arrayOf(40, 30, 50, 100, 20, 10, 60))

        //sort array using bubble sort
        //40 30 50 100 20 10 60
        //30 40 50 20 10 60 100
        //30 40 20 10 50 60 100
        //30 20 10 40 50 60 100
        //20 10 30 40 50 60 100
        //10 20 30 40 50 60 100
        val bubbleSort = BubbleSort()
        bubbleSort.sort(arrayOf(40, 30, 50, 100, 20, 10, 60))
        bubbleSort.sortRecursion(arrayOf(40, 30, 50, 100, 20, 10, 60))

        //sort array using insertion sort
        //40, 30, 50, 100, 20, 10, 60
        //40, 40, 50, 100, 20, 10, 60
        //30, 40, 50, 100, 20, 10, 60
        //30, 40, 50, 100, 100, 10, 60
        //30, 40, 50, 50, 100, 10, 60
        //30, 40, 40, 50, 100, 10, 60
        //30, 30, 40, 50, 100, 10, 60
        //20, 30, 40, 50, 100, 10, 60
        //20, 30, 40, 50, 100, 100, 60
        //20, 30, 40, 50, 50, 100, 60
        //20, 30, 40, 40, 50, 100, 60
        //20, 30, 30, 40, 50, 100, 60
        //20, 20, 30, 40, 50, 100, 60
        //10, 20, 30, 40, 50, 100, 60
        //10, 20, 30, 40, 50, 100, 100
        //10, 20, 30, 40, 50, 60, 100
        val insertionSort = InsertionSort()
        insertionSort.sort(arrayOf(40, 30, 50, 100, 20, 10, 60))
        insertionSort.sortRecursion(arrayOf(40, 30, 50, 100, 20, 10, 60))

        //sort array using merge sort
        //40, 30, 50, 100, 20, 10, 60
        //a1 -> 40, 30, 50, 100 || a2 -> 20, 10, 60
        //a3 -> 40, 30 | a4 -> 50, 100 || a5 -> 20, 10 | a6 -> 60
        //a7 -> 40 | a8 -> 30 | a9 -> 50 | a10 -> 100 || a11 -> 20 | a12 -> 10 | a6 -> 60
        //30, 40 | 50, 100 || 10, 20 | 60 (start merging)
        //30, 40, 50, 100 || 10, 20, 60 (keep merging)
        //10, 20, 30, 40, 50, 60, 100 (final merge)
        val mergeSort = MergeSort()
        mergeSort.sort(arrayOf(40, 30, 50, 100, 20, 10, 60))
        mergeSort.sortRecursion(arrayOf(40, 30, 50, 100, 20, 10, 60))

        //sort array using quick sort
        //40, 30, 50, 100, 20, 10, 60
        //40, 30, 50, 20, 10, 60, 100
        //10, 30, 50, 20, 40, 60, 100
        //10, 30, 20, 40, 50, 60, 100
        //10, 20, 30, 40, 50, 60, 100
        val quickSort = QuickSort()
        quickSort.sort(arrayOf(40, 30, 50, 100, 20, 10, 60))
        quickSort.sortRecursion(arrayOf(40, 30, 50, 100, 20, 10, 60))
    }
}