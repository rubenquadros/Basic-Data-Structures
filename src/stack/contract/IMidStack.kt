package stack.contract

/**
 * Created by ruben.quadros on 22/05/21
 **/
interface IMidStack: IStack {
    fun getMiddle(): Int
    fun deleteMiddle()
}