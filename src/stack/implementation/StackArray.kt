package stack.implementation

import stack.contract.IStack

/**
 * Created by ruben.quadros on 21/05/21
 **/
class StackArray: IStack {

    companion object {
        const val MAX = 5
    }

    private var top = -1
    private var stack: Array<Int> = Array(MAX) { -1 }

    override fun push(value: Int) {
        if (top >= MAX - 1) {
            println("Cannot push $value as stack overflow (array)")
            return
        }
        stack[++top] = value
    }

    override fun pop(): Int {
        if (top < 0) {
            println("Cannot pop as stack is empty (array)")
            return -1
        }
        return stack[top--]
    }

    override fun peek(): Int {
        if (top < 0) {
            println("Cannot get top element as stack is empty (array)")
            return -1
        }
        return stack[top]
    }

    override fun isEmpty(): Boolean {
        return top < 0
    }

    override fun deleteStack() {
        top = -1
    }

    override fun printStack() {
        if (top == -1) {
            println("Cannot print as stack is empty (array)")
            return
        }
        print("Stack values (array): ")
        for (i in top downTo 0) {
            print("${stack[i]} ")
        }
        print("\n")
    }
}
