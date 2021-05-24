package queue.implementation

import queue.contract.IQueue
import java.util.*

/**
 * Created by ruben.quadros on 23/05/21
 **/
class QueueStackEnq: IQueue {

    private val queue: Stack<Int> = Stack()
    private val tempStack: Stack<Int> = Stack()

    override fun enqueue(value: Int) {
        while (queue.isNotEmpty()) {
            tempStack.push(queue.pop())
        }
        queue.push(value)
        while (tempStack.isNotEmpty()) {
            queue.push(tempStack.pop())
        }
    }

    override fun dequeue(): Int {
        if (queue.isEmpty()) {
            println("Cannot dequeue from queue as it is empty (stack enq)")
            return -1
        }
        return queue.pop()
    }

    override fun getFront(): Int {
        if (queue.isEmpty()) {
            println("Cannot get first element as queue is empty (stack enq)")
            return -1
        }
        return queue.peek()
    }

    override fun getRear(): Int {
        return -1
    }

    override fun isFull(): Boolean {
        return false
    }

    override fun isEmpty(): Boolean {
        return queue.isEmpty()
    }

    override fun deleteQueue() {
        queue.clear()
        tempStack.clear()
    }

    override fun printQueue() {
        if (queue.isEmpty()) {
            println("Cannot print queue as it is empty (stack enq)")
            return
        }
        print("Queue values (stack enq): ")
        print(queue.toString())
        print("\n")
    }
}