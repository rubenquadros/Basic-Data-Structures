package queue.implementation

import queue.contract.ICircularQueue

/**
 * Created by ruben.quadros on 23/05/21
 **/
class CircularQueueArray: ICircularQueue {

    companion object {
        const val MAX = 5
    }

    private val circularQueue: Array<Int> = Array(MAX) { -1 }
    private var front = -1
    private var rear = -1
    private var size = circularQueue.size

    override fun enqueue(value: Int) {
        if (isFull()) {
            println("Cannot insert value $value in circular queue as it is full (array)")
            return
        }
        if (isEmpty()) {
            front = 0
            rear = 0
        } else if (rear == size - 1 && front != 0) {
            rear = 0
        } else {
            rear += 1
        }
        circularQueue[rear] = value
    }

    override fun dequeue(): Int {
        if (isEmpty()) {
            println("Cannot dequeue as circular queue is empty (array)")
            return -1
        }
        val data = circularQueue[front]
        when (front) {
            rear -> {
                front = -1
                rear = -1
            }
            size - 1 -> {
                front = 0
            }
            else -> {
                front += 1
            }
        }
        return data
    }

    override fun getFront(): Int {
        if (isEmpty()) {
            println("Cannot get element at front as circular queue is empty (array)")
            return -1
        }
        return circularQueue[front]
    }

    override fun getRear(): Int {
        if (isEmpty()) {
            println("Cannot get element at rear as circular queue is empty (array)")
            return -1
        }
        return circularQueue[rear]
    }

    override fun isEmpty(): Boolean {
        return front == -1
    }

    override fun isFull(): Boolean {
        return (front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))
    }

    override fun deleteQueue() {
        front = -1
        rear = -1
    }

    override fun printQueue() {
        if (isEmpty()) {
            println("Cannot print circular queue as it is empty (array)")
            return
        }
        print("Circular queue values (array): ")
        if (rear >= front) {
            for (i in front..rear) {
                print("${circularQueue[i]} ")
            }
        } else {
            for (i in front until size) {
                print("${circularQueue[i]} ")
            }
            for (i in 0..rear) {
                print("${circularQueue[i]} ")
            }
        }
        print("\n")
    }
}