package queue

import java.util.*

/**
 * Created by ruben.quadros on 23/05/21
 **/
class QueueOperations {

    private val queue: Queue<Int> = LinkedList()

    /**
     * @param value
     * add values into queue
     */
    fun enqueue(value: Int) {
        queue.add(value)
    }

    /**
     * remove top element from queue
     * cannot remove if queue is empty
     */
    fun dequeue(): Int {
        if (queue.isEmpty()) {
            println("Cannot dequeue as queue is empty")
            return -1
        }
        return queue.remove()
    }

    /**
     * reverse the values in queue using stack
     * cannot reverse if queue is empty
     */
    fun reverseQueueStack() {
        if (queue.isEmpty()) {
            println("Cannot reverse queue as it is empty (stack)")
            return
        }
        val stack: Stack<Int> = Stack()
        while (queue.isNotEmpty()) {
            stack.push(queue.remove())
        }
        while (stack.isNotEmpty()) {
            queue.add(stack.pop())
        }
    }

    /**
     * reverse the values in queue using recursion
     */
    fun reverseQueueRecursion() {
        if (queue.isEmpty()) {
            return
        }
        val data = queue.remove()
        reverseQueueRecursion()
        queue.add(data)
    }

    /**
     * @param k
     * reverse the first k elements of a queue
     * cannot reverse if given k is out of bounds of queue
     */
    fun reverseFirstK(k: Int) {
        if (queue.isEmpty()) {
            println("Cannot reverse first $k elements of queue as it is empty")
            return
        }
        if (k > queue.size || k <= 0) {
            println("Given value $k is out of bounds of queue")
            return
        }
        val stack: Stack<Int> = Stack()
        for (i in 1..k) {
            stack.push(queue.remove())
        }
        while (stack.isNotEmpty()) {
            queue.add(stack.pop())
        }
        for (j in 1..(queue.size-k)) {
            val temp = queue.remove()
            queue.add(temp)
        }
    }

    /**
     * interleave first half of queue with seond half
     * cannot interleave if queue is empty
     */
    fun interleaveQueue() {
        if (queue.isEmpty()) {
            println("Cannot interleave first half of queue with second half as it is empty")
            return
        }
        val stack: Stack<Int> = Stack()
        val halfSize = queue.size / 2
        var temp = -1
        for (i in 0 until halfSize) {
            stack.push(queue.remove())
        }
        while (stack.isNotEmpty()) {
            queue.add(stack.pop())
        }
        for (j in 0 until halfSize) {
            temp = queue.remove()
            queue.add(temp)
        }
        for (k in 0 until halfSize) {
            stack.push(queue.remove())
        }
        while (stack.isNotEmpty()) {
            queue.add(stack.pop())
            temp = queue.remove()
            queue.add(temp)
        }
    }

    /**
     * sort a given queue in ascending order
     */
    fun sortQueue() {
        if (queue.isEmpty()) {
            println("Cannot sort queue as it is empty")
            return
        }
        var sortIndex = queue.size - 1
        for (i in 0 until queue.size) {
            val minIndex = getMinIndex(sortIndex)
            sortMin(minIndex)
            sortIndex--
        }
    }

    /**
     * clear all elements of queue
     */
    fun deleteQueue() {
        queue.clear()
    }

    /**
     * print the values of queue
     */
    fun printQueue() {
        if (queue.isEmpty()) {
            println("Cannot print queue as it is empty")
            return
        }
        println(queue.toString())
    }

    private fun getMinIndex(sortIndex: Int): Int {
        var minIndex = -1
        var currMin = Int.MAX_VALUE
        for (i in 0 until queue.size) {
            val min = queue.remove()
            if (min < currMin && i <= sortIndex) {
                currMin = min
                minIndex = i
            }
            queue.add(min)
        }
        return minIndex
    }

    private fun sortMin(minIndex: Int) {
        var minValue = -1
        for (i in 0 until queue.size) {
            val temp = queue.remove()
            if (i != minIndex) {
                queue.add(temp)
            } else {
                minValue = temp
            }
        }
        queue.add(minValue)
    }
}