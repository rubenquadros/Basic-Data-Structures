package stack.implementation

import stack.contract.ISpecialStack
import java.util.*

/**
 * Created by ruben.quadros on 22/05/21
 **/
class SpecialStack3: ISpecialStack {

    private var stack: Stack<Int> = Stack()
    private var minimum = -1

    override fun push(value: Int) {
        when {
            stack.isEmpty() -> {
                stack.push(value)
                minimum = value
            }
            minimum < value -> {
                stack.push(value)
            }
            minimum > value -> {
                stack.push((2 * value) - minimum)
                minimum = value
            }
        }
    }

    override fun pop(): Int {
        if (stack.isEmpty()) {
            minimum = -1
            println("Cannot pop as special stack (optimized) is empty")
            return  -1
        }
        val data = stack.pop()
        if (data < minimum) {
            val min = minimum
            minimum = (2 * minimum) - data
            return min
        }
        return data
    }

    override fun peek(): Int {
        if (stack.isEmpty()) {
            println("Cannot peek as special stack (optimized) is empty")
            return -1
        }
        val data = stack.peek()
        if (data < minimum) {
            return minimum
        }
        return data
    }

    override fun getMinimum(): Int {
        if (stack.isEmpty()) {
            println("Cannot get minimum value as special stack (optimized) is empty")
            return -1
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
            println("Cannot print as special stack (optimized) is empty")
            return
        }
        print("Special stack (optimized) values: ")
        print(stack.toString())
        print("\n")
    }
}