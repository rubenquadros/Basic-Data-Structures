import linkedlist.circularlinkedlist.DriverOfCircularLinkedList
import linkedlist.singlylinkedlist.DriverOfSinglyLinkedList

/**
 * Created by ruben.quadros on 15/05/21
 **/
class MainClass {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //All operations on a singly linked list
            DriverOfSinglyLinkedList()

            //All operations on a circular linked list
            DriverOfCircularLinkedList()
        }
    }
}