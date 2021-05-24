package queue.implementation

import linkedlist.doublylinkedlist.DoublyLinkedList
import linkedlist.doublylinkedlist.Node
import queue.contract.IDequeue

/**
 * Created by ruben.quadros on 23/05/21
 **/
class DequeueLinkedList: IDequeue {

    private val dequeue = DoublyLinkedList()
    private var front: Node? = null
    private var rear: Node? = null

    override fun insertAtFront(value: Int) {
        val newNode = Node(value)
        if (isEmpty()) {
            dequeue.head = newNode
            front = newNode
            rear = newNode
        } else {
            newNode.next = front
            front?.previous = newNode
            front = newNode
            dequeue.head = newNode
        }
    }

    override fun insertAtRear(value: Int) {
        val newNode = Node(value)
        if (isEmpty()) {
            dequeue.head = newNode
            front = newNode
            rear = newNode
        } else {
            rear?.next = newNode
            newNode.previous = rear
            rear = newNode
        }
    }

    override fun deleteFront(): Int {
        if (isEmpty()) {
            println("Cannot delete value at front as dequeue is empty (DLL)")
            return -1
        }
        val data = front!!.data
        front = front?.next
        if (front == null) {
            rear = null
            dequeue.head = null
        } else {
            front?.previous = null
            dequeue.head = front
        }
        return data
    }

    override fun deleteRear(): Int {
        if (isEmpty()) {
            println("Cannot delete value at rear as dequeue is empty (DLL)")
            return -1
        }
        val data = rear!!.data
        rear = rear?.previous
        if (rear == null) {
            front = null
            dequeue.head = null
        } else {
            rear?.next = null
        }
        return data
    }

    override fun getFront(): Int {
        if (isEmpty()) {
            println("Cannot get element at front as dequeue is empty (DLL)")
            return -1
        }
        return front!!.data
    }

    override fun getRear(): Int {
        if (isEmpty()) {
            println("Cannot get element at rear as dequeue is empty (DLL)")
            return -1
        }
        return rear!!.data
    }

    override fun isEmpty(): Boolean {
        return dequeue.head == null || front == null
    }

    override fun isFull(): Boolean {
        return false
    }

    override fun deleteDequeue() {
        dequeue.head = null
        front = null
        rear = null
    }

    override fun printDequeue() {
        if (isEmpty()) {
            println("Cannot print as dequeue is empty (DLL)")
            return
        }
        print("Dequeue values (array): ")
        var temp = front
        while (temp != null) {
            print("${temp.data} ")
            temp = temp.next
        }
        print("\n")
    }
}