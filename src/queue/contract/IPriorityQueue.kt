package queue.contract

/**
 * Created by ruben.quadros on 24/05/21
 **/
interface IPriorityQueue {

    fun insert(value: Int, priority: Int)
    fun deleteHighestPriority(): Int
    fun getHighestPriority(): Int
    fun isEmpty(): Boolean
    fun deletePriorityQueue()
    fun printPriorityQueue()

}