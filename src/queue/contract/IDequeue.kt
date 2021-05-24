package queue.contract

/**
 * Created by ruben.quadros on 23/05/21
 **/
interface IDequeue {
    fun insertAtFront(value: Int)
    fun insertAtRear(value: Int)
    fun deleteFront(): Int
    fun deleteRear(): Int
    fun getFront(): Int
    fun getRear(): Int
    fun isEmpty(): Boolean
    fun isFull(): Boolean
    fun deleteDequeue()
    fun printDequeue()
}