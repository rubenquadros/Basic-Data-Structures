package stack.implementation

import stack.contract.ISpecialStack
import java.util.*

/**
* Created by ruben.quadros on 22/05/21
**/
class SpecialStack: ISpecialStack {

    private val stack: Stack<Int> = Stack()
    private val minStack: Stack<Int> = Stack()

    override fun push(value: Int) {
        stack.push(value)
        if (minStack.isEmpty()) {
            minStack.push(value)
        } else if (minStack.peek() > value) {
            minStack.push(value)
        }
    }

    override fun pop(): Int {
        if (stack.isEmpty()) {
            println("Cannot pop as special stack is empty")
            return  -1
        }
        if (stack.peek() == minStack.peek()) {
            minStack.pop()
        }
        return  stack.pop()
    }

    override fun peek(): Int {
        if (stack.isEmpty()) {
            println("Cannot peek as special stack is empty")
            return -1
        }
        return stack.peek()
    }

    override fun getMinimum(): Int {
        if (stack.isEmpty()) {
            println("Cannot get minimum value as special stack is empty")
            return -1
        }
        return minStack.peek()
    }

    override fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    override fun deleteStack() {
        stack.clear()
        minStack.clear()
    }

    override fun printStack() {
        if (stack.isEmpty()) {
            println("Cannot print as special stack is empty")
            return
        }
        print("Special stack values: ")
        print(stack.toString())
        print("\n")
    }
}