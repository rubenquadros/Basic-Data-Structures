package queue.implementation

import linkedlist.circularlinkedlist.CircularLinkedList
import linkedlist.circularlinkedlist.Node
import queue.contract.ICircularQueue

/**
 * Created by ruben.quadros on 23/05/21
 **/
class CircularQueueLinkedList: ICircularQueue {

    private val circularQueue = CircularLinkedList()
    private var front: Node? = null
    private var rear: Node? = null

    override fun enqueue(value: Int) {
        val newNode = Node(value)
        if (isEmpty()) {
            circularQueue.head = newNode
            front = newNode
        } else {
            rear?.next = newNode
        }
        rear = newNode
        newNode.next = front
    }

    override fun dequeue(): Int {
        if (isEmpty()) {
            println("Cannot dequeue as circular queue is empty (CLL)")
            return -1
        }
        val data = front!!.data
        front = front?.next
        if (front == null) {
            rear = null
        } else {
            rear?.next = front
            circularQueue.head = front
        }
        return data
    }

    override fun getFront(): Int {
        if (isEmpty()) {
            println("Cannot get element at front as circular queue is empty (CLL)")
            return -1
        }
        return front!!.data
    }

    override fun getRear(): Int {
        if (isEmpty()) {
            println("Cannot get element at rear as circular queue is empty (CLL)")
            return -1
        }
        return rear!!.data
    }

    override fun isEmpty(): Boolean {
        return circularQueue.head == null || front == null
    }

    override fun isFull(): Boolean {
        return false
    }

    override fun deleteQueue() {
        circularQueue.head = null
        front = null
        rear = null
    }

    override fun printQueue() {
        if (isEmpty()) {
            println("Cannot print circular queue as it is empty (CLL)")
            return
        }
        print("Circular queue values (CLL): ")
        var temp = front
        do {
            print("${temp?.data} ")
            temp = temp?.next
        } while (temp != front)
        print("\n")
    }
}