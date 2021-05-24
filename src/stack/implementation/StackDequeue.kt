package stack.implementation

import queue.implementation.DequeueLinkedList
import stack.contract.IStack

/**
 * Created by ruben.quadros on 24/05/21
 **/
class StackDequeue: IStack {

    private val stack = DequeueLinkedList()

    override fun push(value: Int) {
        stack.insertAtRear(value)
    }

    override fun pop(): Int {
        return stack.deleteRear()
    }

    override fun peek(): Int {
        return stack.getRear()
    }

    override fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    override fun deleteStack() {
        stack.deleteDequeue()
    }

    override fun printStack() {
        stack.printDequeue()
    }
}