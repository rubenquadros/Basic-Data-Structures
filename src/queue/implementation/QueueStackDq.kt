package queue.implementation

import queue.contract.IQueue
import java.util.*

/**
 * Created by ruben.quadros on 23/05/21
 **/
class QueueStackDq: IQueue {

    private val queue: Stack<Int> = Stack()
    private val tempStack: Stack<Int> = Stack()

    override fun enqueue(value: Int) {
        queue.push(value)
    }

    override fun dequeue(): Int {
        if (queue.isEmpty() && tempStack.isEmpty()) {
            println("Cannot dequeue from queue as it is empty (stack dq)")
            return -1
        }
        if (tempStack.isEmpty()) {
            while (queue.isNotEmpty()) {
                tempStack.push(queue.pop())
            }
        }
        val data = tempStack.pop()
        if (tempStack.isEmpty()) {
            deleteQueue()
        }
        return data
    }

    override fun getFront(): Int {
        if (queue.isEmpty() && tempStack.isEmpty()) {
            println("Cannot get first element as queue is empty (stack dq)")
            return -1
        }
        return tempStack.peek()
    }

    override fun getRear(): Int {
        return -1
    }

    override fun isFull(): Boolean {
        return false
    }

    override fun isEmpty(): Boolean {
        return queue.isEmpty() && tempStack.isEmpty()
    }

    override fun deleteQueue() {
        queue.clear()
        tempStack.clear()
    }

    override fun printQueue() {
        if (queue.isEmpty() && tempStack.isEmpty()) {
            println("Cannot print queue as it is empty (stack dq)")
            return
        }
        print("Queue values (stack dq): ")
        if (tempStack.isEmpty()) {
            print(queue.toString())
        } else {
            print(tempStack.toString())
        }
        print("\n")
    }
}