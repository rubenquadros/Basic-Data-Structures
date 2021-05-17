package linkedlist.circularlinkedlist

/**
 * Created by ruben.quadros on 17/05/21
 **/
data class CircularLinkedList(
        var head: Node? = null
)

data class Node(
        var data: Int,
        var next: Node? = null
)