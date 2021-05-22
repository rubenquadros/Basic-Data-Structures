package stack.implementation

import stack.contract.ISpecialStack
import java.util.*

/**
 * Created by ruben.quadros on 22/05/21
 **/
class SpecialStack2: ISpecialStack {

    private val stack: Stack<Int> = Stack()
    private var minimum  = -1
    private val dummy = 9999

    override fun push(value: Int) {
        if (stack.isEmpty() || minimum > value) {
            minimum = value
        }
        stack.push((value * dummy) + minimum)
    }

    override fun pop(): Int {
        if (stack.isEmpty()) {
            minimum = -1
            println("Cannot pop as special stack (optimized with dummy) is empty")
            return  -1
        }
        val value = stack.pop()
        minimum = stack.peek() % dummy
        return value/dummy
    }

    override fun peek(): Int {
        if (stack.isEmpty()) {
            println("Cannot peek as special stack (optimized with dummy) is empty")
            return -1
        }
        return stack.peek()/dummy
    }

    override fun getMinimum(): Int {
        if (stack.isEmpty()) {
            println("Cannot get minimum value as special stack (optimized with dummy) is empty")
            return minimum
        }
        return minimum
    }

    override fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    override fun deleteStack() {
        stack.clear()
    }

    override fun printStack() {
        if (stack.isEmpty()) {
            println("Cannot print as special stack (optimized with dummy) is empty")
            return
        }
        print("Special stack (optimized with dummy) values: ")
        print(stack.toString())
        print("\n")
    }
}