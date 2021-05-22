package stack.contract

/**
 * Created by ruben.quadros on 21/05/21
 **/
interface IStack {
    fun push(value: Int)
    fun pop(): Int
    fun peek(): Int
    fun isEmpty(): Boolean
    fun deleteStack()
    fun printStack()
}