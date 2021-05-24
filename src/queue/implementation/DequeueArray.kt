package queue.implementation

import queue.contract.IDequeue

/**
 * Created by ruben.quadros on 23/05/21
 **/
class DequeueArray: IDequeue {

    companion object {
        const val MAX = 5
    }

    private val dequeue: Array<Int> = Array(MAX) { -1 }
    private var front = -1
    private var rear = -1
    private var size = dequeue.size

    override fun insertAtFront(value: Int) {
        if (isFull()) {
            println("Cannot insert value $value at front as dequeue is full (array)")
            return
        }
        when {
            isEmpty() -> {
                front = 0
                rear = 0
            }
            front == 0 -> {
                front = size-1
            }
            else -> {
                front -= 1
            }
        }
        dequeue[front] = value
    }

    override fun insertAtRear(value: Int) {
        if (isFull()) {
            println("Cannot insert value $value at rear as dequeue is full (array)")
            return
        }
        when {
            isEmpty() -> {
                rear = 0
                front = 0
            }
            rear == size - 1 -> {
                rear = 0
            }
            else -> {
                rear += 1
            }
        }
        dequeue[rear] = value
    }

    override fun deleteFront(): Int {
        if (isEmpty()) {
            println("Cannot delete value at front as dequeue is empty (array)")
            return -1
        }
        val data = dequeue[front]
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

    override fun deleteRear(): Int {
        if (isEmpty()) {
            println("Cannot delete value at rear as dequeue is empty (array)")
            return -1
        }
        val data = dequeue[rear]
        when (rear) {
            front -> {
                rear = -1
                front = -1
            }
            0 -> {
                rear = size - 1
            }
            else -> {
                rear -= 1
            }
        }
        return data
    }

    override fun getFront(): Int {
        if (isEmpty()) {
            println("Cannot get element at front as dequeue is empty (array)")
            return -1
        }
        return dequeue[front]
    }

    override fun getRear(): Int {
        if (isEmpty()) {
            println("Cannot get element at rear as dequeue is empty (array)")
            return -1
        }
        return dequeue[rear]
    }

    override fun isEmpty(): Boolean {
        return front == -1
    }

    override fun isFull(): Boolean {
        return (front == 0 && rear == size - 1) || (front == rear + 1)
    }

    override fun deleteDequeue() {
        front = -1
        rear = -1
    }

    override fun printDequeue() {
        if (isEmpty()) {
            println("Cannot print as dequeue is empty (array)")
            return
        }
        print("Dequeue values (array): ")
        for (i in 0 until size) {
            print("${dequeue[i]} ")
        }
        print("\n")
    }
}