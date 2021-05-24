package queue.implementation

import queue.contract.IQueue

/**
 * Created by ruben.quadros on 24/05/21
 **/
class QueueDequeue: IQueue {

    private val queue = DequeueLinkedList()

    override fun enqueue(value: Int) {
        queue.insertAtRear(value)
    }

    override fun dequeue(): Int {
        return queue.deleteFront()
    }

    override fun getFront(): Int {
        return queue.getFront()
    }

    override fun getRear(): Int {
        return queue.getRear()
    }

    override fun isFull(): Boolean {
        return queue.isFull()
    }

    override fun isEmpty(): Boolean {
        return queue.isEmpty()
    }

    override fun deleteQueue() {
        queue.deleteDequeue()
    }

    override fun printQueue() {
        queue.printDequeue()
    }
}