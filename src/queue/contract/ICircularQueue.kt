package queue.contract

/**
 * Created by ruben.quadros on 23/05/21
 **/
interface ICircularQueue {
    fun enqueue(value: Int)
    fun dequeue(): Int
    fun getFront(): Int
    fun getRear(): Int
    fun isEmpty(): Boolean
    fun isFull(): Boolean
    fun deleteQueue()
    fun printQueue()
}