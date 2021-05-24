package stack.implementation

import stack.contract.IStack
import java.util.*

/**
 * Created by ruben.quadros on 23/05/21
 **/
class StackQueue: IStack {

    private val stack: Queue<Int> = LinkedList()

    override fun push(value: Int) {
        val size = stack.size
        stack.add(value)
        for (i in 0 until size) {
            val temp = stack.remove()
            stack.add(temp)
        }
    }

    override fun pop(): Int {
        if (stack.isEmpty()) {
            println("Cannot pop as stack is empty (single queue)")
            return -1
        }
        return stack.remove()
    }

    override fun peek(): Int {
        if (stack.isEmpty()) {
            println("Cannot get top element as stack is empty (single queue)")
            return -1
        }
        return stack.peek()
    }

    override fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    override fun deleteStack() {
        stack.clear()
    }

    override fun printStack() {
        if (stack.isEmpty()) {
            println("Cannot print as stack is empty (single queue)")
            return
        }
        print("Stack values (single queue): ")
        print(stack)
        print("\n")
    }
}