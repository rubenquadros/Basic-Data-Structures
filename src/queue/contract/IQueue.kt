package queue.contract

/**
 * Created by ruben.quadros on 23/05/21
 **/
interface IQueue {
    fun enqueue(value: Int)
    fun dequeue(): Int
    fun getFront(): Int
    fun getRear(): Int
    fun isFull(): Boolean
    fun isEmpty(): Boolean
    fun deleteQueue()
    fun printQueue()
}