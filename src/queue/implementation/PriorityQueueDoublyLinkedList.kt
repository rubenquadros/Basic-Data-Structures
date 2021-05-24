package queue.implementation

import queue.contract.IPriorityQueue

/**
 * Created by ruben.quadros on 24/05/21
 **/
class PriorityQueueDoublyLinkedList: IPriorityQueue {

    private val priorityQueue = PriorityQueueDLL()

    override fun insert(value: Int, priority: Int) {
        val newNode = DNode(data = value, priority = priority)
        when {
            priorityQueue.head == null -> {
                priorityQueue.head = newNode
            }
            priorityQueue.head!!.priority > priority -> {
                newNode.next = priorityQueue.head
                priorityQueue.head?.previous = newNode
                priorityQueue.head = newNode
            }
            else -> {
                var temp = priorityQueue.head
                while (temp?.next != null && temp.next!!.priority < priority) {
                    temp = temp.next
                }
                newNode.next = temp?.next
                newNode.previous = temp
                if (temp?.next != null) {
                    temp.next?.previous = newNode
                }
                temp?.next = newNode
            }
        }
    }

    override fun deleteHighestPriority(): Int {
        if (priorityQueue.head == null) {
            println("Cannot delete highest priority as priority queue is empty (DLL)")
            return -1
        }
        val data = priorityQueue.head!!.priority
        priorityQueue.head = priorityQueue.head?.next
        priorityQueue.head?.previous = null
        return data
    }

    override fun getHighestPriority(): Int {
        if (priorityQueue.head == null) {
            println("Cannot get highest priority as priority queue is empty (DLL)")
            return -1
        }
        return priorityQueue.head!!.data
    }

    override fun isEmpty(): Boolean {
        return priorityQueue.head == null
    }

    override fun deletePriorityQueue() {
        priorityQueue.head = null
    }

    override fun printPriorityQueue() {
        if (priorityQueue.head == null) {
            println("Cannot print priority queue as it is empty (DLL)")
            return
        }
        print("Forward direction: ")
        var temp = priorityQueue.head
        var last = priorityQueue.head
        while (temp != null) {
            print("P: ${temp.priority} V: ${temp.data} ")
            last = temp
            temp = temp.next
        }
        print("\n")
        print("Backward direction: ")
        while (last != null) {
            print("P: ${last.priority} V: ${last.data} ")
            last = last.previous
        }
        print("\n")
    }
}