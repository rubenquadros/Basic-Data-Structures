package stack.implementation

import linkedlist.doublylinkedlist.DoublyLinkedList
import linkedlist.doublylinkedlist.Node
import stack.contract.IMidStack

/**
 * Created by ruben.quadros on 22/05/21
 **/
class MidStack: IMidStack {

    private var midStack = DoublyLinkedList()
    private var middle: Node? = null
    private var count = 0

    override fun push(value: Int) {
        val newNode = Node(value)
        if (midStack.head == null) {
            midStack.head = newNode
            middle = newNode
            count++
            return
        }
        newNode.next = midStack.head
        midStack.head?.previous = newNode
        midStack.head = newNode
        count++
        if (count % 2 != 0) {
            middle = middle?.previous
        }
    }

    override fun pop(): Int {
        if (midStack.head == null) {
            println("Cannot pop mid stack as it is empty")
            return -1
        }
        val data = midStack.head!!.data
        if (count % 2 != 0) {
            middle = middle?.next
        }
        midStack.head = midStack.head?.next
        midStack.head?.previous = null
        count--
        return data
    }

    override fun peek(): Int {
        if (midStack.head == null) {
            println("Cannot get top element as mid stack is empty")
            return -1
        }
        return midStack.head!!.data
    }

    override fun getMiddle(): Int {
        if (midStack.head == null) {
            println("Cannot get middle element as stack is empty")
            return -1
        }
        return middle!!.data
    }

    override fun deleteMiddle() {
        if (midStack.head == null) {
            println("Cannot delete middle element as stack is empty")
            return
        }
        if (middle == midStack.head) {
            midStack.head = midStack.head?.next
        }
        if (middle?.previous != null) {
            middle?.previous?.next = middle?.next
        }
        if (middle?.next != null) {
            middle?.next?.previous = middle?.previous
        }
        middle = if (count % 2 != 0) {
            middle?.next
        } else {
            middle?.previous
        }
        count--
    }

    override fun isEmpty(): Boolean {
        return midStack.head == null
    }

    override fun deleteStack() {
        midStack.head = null
    }

    override fun printStack() {
        if (midStack.head == null) {
            println("Cannot print mid stack as it is empty")
            return
        }
        var temp = midStack.head
        print("Mid Stack values: ")
        while (temp != null) {
            print("${temp.data} ")
            temp = temp.next
        }
        print("\n")
    }
}