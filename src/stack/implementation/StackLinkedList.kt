package stack.implementation

import linkedlist.singlylinkedlist.Node
import linkedlist.singlylinkedlist.SinglyLinkedList
import stack.contract.IStack

/**
 * Created by ruben.quadros on 21/05/21
 **/
class StackLinkedList: IStack {

    private var stackNode = SinglyLinkedList()

    override fun push(value: Int) {
        val newNode = Node(value)
        if (stackNode.head == null) {
            stackNode.head = newNode
        } else {
            val temp = stackNode.head
            newNode.next = temp
            stackNode.head = newNode
        }
    }

    override fun pop(): Int {
        if (stackNode.head == null) {
            println("Cannot pop as stack is empty (linked list)")
            return -1
        }
        val data = stackNode.head!!.data
        stackNode.head = stackNode.head?.next
        return data
    }

    override fun peek(): Int {
        if (stackNode.head == null) {
            println("Cannot get top element as stack is empty (linked list)")
            return -1
        }
        return stackNode.head!!.data
    }

    /**
     * reverse a stack
     */
    fun reverse() {
        if (stackNode.head == null) {
            println("Cannot reverse stack as it is empty (linked list)")
            return
        }
        var previous: Node? = stackNode.head
        var current: Node? = stackNode.head?.next
        previous?.next = null
        while (current != null) {
            val next = current.next
            current.next = previous
            previous = current
            current = next
        }
        stackNode.head = previous
    }

    override fun isEmpty(): Boolean {
        return stackNode.head == null
    }

    override fun deleteStack() {
        stackNode.head = null
    }

    override fun printStack() {
        if (stackNode.head == null) {
            println("Cannot print as stack is empty (linked list)")
            return
        }
        var temp = stackNode.head
        print("Stack values (linked list): ")
        while (temp != null) {
            print("${temp.data} ")
            temp = temp.next
        }
        print("\n")
    }
}