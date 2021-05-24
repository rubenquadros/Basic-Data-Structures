package queue.implementation

import queue.contract.IQueue

/**
 * Created by ruben.quadros on 23/05/21
 **/
class QueueArray: IQueue {

    companion object {
        const val MAX = 5
    }

    private val queueArray: Array<Int> = Array(MAX) { -1 }
    private var capacity = queueArray.size
    private var front = 0
    private var rear = capacity - 1
    private var queueSize = 0

    override fun enqueue(value: Int) {
        if (isFull()) {
            println("Cannot add value $value in queue as it is full (array)")
            return
        }
        rear = (rear + 1) % capacity
        queueArray[rear] = value
        queueSize++
    }

    override fun dequeue(): Int {
        if (isEmpty()) {
            println("Cannot dequeue from queue as it is empty (array)")
            return -1
        }
        val data = queueArray[front]
        front = (front + 1) % capacity
        queueSize--
        return data
    }

    override fun getFront(): Int {
        if (isEmpty()) {
            println("Cannot get first element of queue as it is empty (array)")
            return -1
        }
        return queueArray[front]
    }

    override fun getRear(): Int {
        if (isEmpty()) {
            println("Cannot get last element of queue as it is empty (array)")
            return -1
        }
        return queueArray[rear]
    }

    override fun isFull(): Boolean {
        return queueSize == capacity
    }

    override fun isEmpty(): Boolean {
        return queueSize == 0
    }

    override fun deleteQueue() {
        front = 0
        rear = capacity-1
        queueSize = 0
    }

    override fun printQueue() {
        if (isEmpty()) {
            println("Cannot print queue as it is empty (array)")
            return
        }
        print("Queue values (array): ")
        for (i in front..rear) {
            print("${queueArray[i]} ")
        }
        print("\n")
    }
}