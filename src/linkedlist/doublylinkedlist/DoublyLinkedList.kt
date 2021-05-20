package linkedlist.doublylinkedlist

/**
 * Created by ruben.quadros on 18/05/21
 **/
data class DoublyLinkedList(
        var head: Node? = null
)

data class Node(
        var data: Int,
        var previous: Node? = null,
        var next: Node? = null
)
