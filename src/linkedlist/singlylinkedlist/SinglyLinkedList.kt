package linkedlist.singlylinkedlist

/**
 * Created by ruben.quadros on 15/05/21
 **/
data class SinglyLinkedList(
        var head: Node? = null
)

data class Node(
        var data: Int,
        var next: Node? = null
)