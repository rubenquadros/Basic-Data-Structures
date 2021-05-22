package stack

import java.util.*

/**
 * Created by ruben.quadros on 21/05/21
 **/
class StackOperations {

    private var stack: Stack<Int> = Stack()
    private var tempStack: Stack<Int> = Stack()

    /**
     * @param value
     * push a value into the stack
     */
    fun push(value: Int) {
        stack.push(value)
    }

    /**
     * reverse a stack
     * cannot reverse if the stack is empty
     */
    fun reverseStack() {
        if (!stack.isEmpty()) {
            val temp = stack.pop()
            reverseStack()
            insertFromBottom(temp)
        }
    }

    /**
     * sort a given stack using recursion
     * cannot sort if stack is empty
     */
    fun sortStackRecursion() {
        if (!stack.isEmpty()) {
            val temp = stack.pop()
            sortStackRecursion()
            sortedInsert(temp)
        }
    }

    /**
     * sort a stack using a temporary stack in descending order
     */
    fun sortStack() {
        while (!stack.isEmpty()) {
            val temp = stack.pop()
            while (!tempStack.isEmpty() && temp < tempStack.peek()) {
                stack.push(tempStack.pop())
            }
            tempStack.push(temp)
        }
    }

    /**
     * sort a stack using a temporary stack in ascending order
     */
    fun sortStackAscending() {
        while (stack.isNotEmpty()) {
            val temp = stack.pop()
            while (tempStack.isNotEmpty() && temp > tempStack.peek()) {
                stack.push(tempStack.pop())
            }
            tempStack.push(temp)
        }
    }

    /**
     * @param array
     * sort an array using stacks
     */
    fun sortArray(array: Array<Int>) {
        if (array.isEmpty()) {
            println("Cannot sort an empty array")
            return
        }
        print("Array elements: ")
        for (i in array.indices) {
            print("${array[i]} ")
            stack.push(array[i])
        }
        print("\n")
        sortStackAscending()
        var j = 0
        print("Sorted array: ")
        while (!tempStack.isEmpty()) {
            val data = tempStack.pop()
            print("$data ")
            array[j] = data
            j++
        }
        print("\n")
    }

    /**
     * @param array
     * @param deleteCount
     * delete an array element if next element in array is greater than previous element
     * if array[i+1] < array[i+2]
     */
    fun deleteArrayElements(array: Array<Int>, deleteCount: Int) {
        if (array.isEmpty()) {
            println("Cannot delete elements in an empty array")
            return
        }
        print("Array elements: ")
        for (i in array.indices) {
            print("${array[i]} " )
        }
        print("\n")
        stack.push(array[0])
        var count = 0
        for (j in 1 until array.size) {
            while (stack.isNotEmpty() && count < deleteCount && stack.peek() < array[j]) {
                stack.pop()
                count++
            }
            stack.push(array[j])
        }
        var arrayCount = stack.size
        val deleteArray: Array<Int> = Array(arrayCount) { -1 }
        while (stack.isNotEmpty()) {
            deleteArray[--arrayCount] = stack.pop()
        }
        print("Elements after deletion: ")
        for (k in deleteArray.indices) {
            print("${deleteArray[k]} ")
        }
        print("\n")
    }

    /**
     * @param input
     * reverse each word of a string
     */
    fun reverseStringLetters(input: String) {
        if (input.isEmpty()) {
            println("Cannot reverse words in an empty string")
            return
        }
        val stack: Stack<Char> = Stack()
        for (i in input.indices) {
            if (input[i] != ' ') {
                stack.push(input[i])
            } else {
                while (stack.isNotEmpty()) {
                    print(stack.pop())
                }
                print(" ")
            }
        }
        while (stack.isNotEmpty()) {
            print(stack.pop())
        }
    }

    /**
     * clear a stack
     */
    fun deleteStack() {
        stack.clear()
        tempStack.clear()
    }

    /**
     * print the values of the stack
     */
    fun printStack() {
        if (stack.isEmpty()) {
            println("Cannot print as stack is empty")
            return
        }
        print("Stack values: ")
        print(stack.toString())
        print("\n")
    }

    /**
     * print the values of sorted temporary stack
     */
    fun printSortedStack() {
        if (tempStack.isEmpty()) {
            println("Cannot print as stack is empty")
            return
        }
        print("Stack values: ")
        print(tempStack.toString())
        print("\n")
    }

    private fun insertFromBottom(value: Int) {
        if (stack.isEmpty()) {
            stack.push(value)
        } else {
            val temp = stack.pop()
            insertFromBottom(value)
            stack.push(temp)
        }
    }

    private fun sortedInsert(value: Int) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value)
        } else {
            val temp = stack.pop()
            sortedInsert(value)
            stack.push(temp)
        }
    }
}