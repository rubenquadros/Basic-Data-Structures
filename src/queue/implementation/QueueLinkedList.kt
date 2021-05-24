package queue.implementation

import linkedlist.singlylinkedlist.Node
import linkedlist.singlylinkedlist.SinglyLinkedList
import queue.contract.IQueue

/**
 * Created by ruben.quadros on 23/05/21
 **/
class QueueLinkedList: IQueue {

    private val queueNode = SinglyLinkedList()
    private var front: Node? = null
    private var rear: Node? = null

    override fun enqueue(value: Int) {
        val newNode = Node(value)
        if (queueNode.head == null) {
            queueNode.head = newNode
            front = queueNode.head
            rear = queueNode.head
        } else {
            rear?.next = newNode
            rear = newNode
        }

    }

    override fun dequeue(): Int {
        if (queueNode.head == null) {
            println("Cannot dequeue from queue as it is empty (linked list)")
            return -1
        }
        val data = queueNode.head!!.data
        queueNode.head = queueNode.head?.next
        front = queueNode.head
        return data
    }

    override fun getFront(): Int {
        if (front == null) {
            println("Cannot get first element as queue is empty (linked list)")
            return -1
        }
        return front!!.data
    }

    override fun getRear(): Int {
        if (rear == null) {
            println("Cannot get last element as queue is empty (linked list)")
            return -1
        }
        return rear!!.data
    }

    override fun isFull(): Boolean {
        return false
    }

    override fun isEmpty(): Boolean {
        return front == null
    }

    override fun deleteQueue() {
        queueNode.head = null
        front = null
        rear = null
    }

    override fun printQueue() {
        if (queueNode.head == null) {
            println("Cannot print queue as it is empty (linked list)")
            return
        }
        var temp = queueNode.head
        print("Queue values (linked list): ")
        while (temp != null) {
            print("${temp.data} ")
            temp = temp.next
        }
        print("\n")
    }
}