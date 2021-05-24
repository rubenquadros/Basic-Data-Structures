package stack.implementation

import stack.contract.IStack
import java.util.*

/**
 * Created by ruben.quadros on 23/05/21
 **/
class StackQueuePop: IStack {

    private var stack: Queue<Int> = LinkedList()
    private var tempQueue: Queue<Int> = LinkedList()

    override fun push(value: Int) {
        stack.add(value)
    }

    override fun pop(): Int {
        if (stack.isEmpty()) {
            println("Cannot pop as stack is empty (queue pop)")
            return -1
        }
        while (stack.size != 1) {
            tempQueue.add(stack.remove())
        }
        val data = stack.remove()
        val temp = stack
        stack = tempQueue
        tempQueue = temp
        return data
    }

    override fun peek(): Int {
        if (stack.isEmpty()) {
            println("Cannot get top element as stack is empty (queue pop)")
            return -1
        }
        return stack.peek()
    }

    override fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    override fun deleteStack() {
        stack.clear()
        tempQueue.clear()
    }

    override fun printStack() {
        if (stack.isEmpty()) {
            println("Cannot print as stack is empty (queue pop)")
            return
        }
        print("Stack values (queue pop): ")
        print(stack)
        print("\n")
    }
}