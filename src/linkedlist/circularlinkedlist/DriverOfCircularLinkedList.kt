package linkedlist.circularlinkedlist

/**
 * Created by ruben.quadros on 17/05/21
 **/
class DriverOfCircularLinkedList {
    init {
        val circularLinkedListOperations = CircularLinkedListOperations()

        //try to print empty circular linked list
        circularLinkedListOperations.printCircularLinkedList()

        //try to insert a node after a given node in an empty circular linked list
        circularLinkedListOperations.insertNodeAfter(1, 2)

        //insert nodes at the front of a circular linked list
        circularLinkedListOperations.insertNodeAtFront(5)
        circularLinkedListOperations.insertNodeAtFront(4)
        circularLinkedListOperations.insertNodeAtFront(3)
        circularLinkedListOperations.insertNodeAtFront(2)
        circularLinkedListOperations.insertNodeAtFront(1)
        circularLinkedListOperations.printCircularLinkedList()

        //insert nodes at the end of a circular linked list
        circularLinkedListOperations.deleteCircularLinkedList()
        circularLinkedListOperations.insertNodeAtEnd(6)
        circularLinkedListOperations.insertNodeAtEnd(7)
        circularLinkedListOperations.insertNodeAtEnd(8)
        circularLinkedListOperations.insertNodeAtEnd(9)
        circularLinkedListOperations.printCircularLinkedList()

        //insert node after a given node in circular linked list
        circularLinkedListOperations.insertNodeAfter(10, 1)
        circularLinkedListOperations.insertNodeAfter(6,2)
        circularLinkedListOperations.insertNodeAfter(9, 10)
        circularLinkedListOperations.printCircularLinkedList()

        //split a circular linked list
        circularLinkedListOperations.deleteCircularLinkedList()
        circularLinkedListOperations.splitCircularLinkedList()
        circularLinkedListOperations.insertNodeAtFront(5)
        circularLinkedListOperations.splitCircularLinkedList()
        circularLinkedListOperations.insertNodeAtFront(4)
        circularLinkedListOperations.insertNodeAtFront(3)
        circularLinkedListOperations.insertNodeAtFront(2)
        circularLinkedListOperations.insertNodeAtFront(1)
        circularLinkedListOperations.printCircularLinkedList()
        circularLinkedListOperations.splitCircularLinkedList()

        //insert a node in sorted form in a circular linked list
        circularLinkedListOperations.deleteCircularLinkedList()
        circularLinkedListOperations.sortedInsert(5)
        circularLinkedListOperations.insertNodeAtEnd(6)
        circularLinkedListOperations.insertNodeAtEnd(8)
        circularLinkedListOperations.insertNodeAtEnd(9)
        circularLinkedListOperations.insertNodeAtEnd(10)
        circularLinkedListOperations.sortedInsert(4)
        circularLinkedListOperations.sortedInsert(15)
        circularLinkedListOperations.sortedInsert(7)
        circularLinkedListOperations.sortedInsert(12)
        circularLinkedListOperations.sortedInsert(8)
        circularLinkedListOperations.sortedInsert(4)
        circularLinkedListOperations.printCircularLinkedList()

        //check if linked list is circular
        circularLinkedListOperations.isLinkedListCircular()
        circularLinkedListOperations.deleteCircularLinkedList()
        circularLinkedListOperations.isLinkedListCircular()
        circularLinkedListOperations.createSinglyLinkedList()
        circularLinkedListOperations.isLinkedListCircular()

        //delete a node in the circular linked list
        circularLinkedListOperations.deleteCircularLinkedList()
        circularLinkedListOperations.deleteNode(5)
        circularLinkedListOperations.insertNodeAtFront(10)
        circularLinkedListOperations.insertNodeAtFront(8)
        circularLinkedListOperations.insertNodeAtFront(7)
        circularLinkedListOperations.insertNodeAtFront(5)
        circularLinkedListOperations.insertNodeAtFront(2)
        circularLinkedListOperations.printCircularLinkedList()
        circularLinkedListOperations.deleteNode(20)
        circularLinkedListOperations.deleteNode(2)
        circularLinkedListOperations.deleteNode(10)
        circularLinkedListOperations.deleteNode(7)
        circularLinkedListOperations.printCircularLinkedList()

        //get length of the circular linked list
        circularLinkedListOperations.deleteCircularLinkedList()
        circularLinkedListOperations.getLength()
        circularLinkedListOperations.insertNodeAtFront(1)
        circularLinkedListOperations.insertNodeAtFront(2)
        circularLinkedListOperations.insertNodeAtFront(3)
        circularLinkedListOperations.insertNodeAtFront(4)
        circularLinkedListOperations.printCircularLinkedList()
        circularLinkedListOperations.getLength()

        //josephus circle
        circularLinkedListOperations.josephusCircle(14, 2)

        //convert singly linked list to circular linked list
        circularLinkedListOperations.deleteCircularLinkedList()
        circularLinkedListOperations.convertSinglyToCircular()
        circularLinkedListOperations.createSinglyLinkedList()
        circularLinkedListOperations.isLinkedListCircular()
        circularLinkedListOperations.convertSinglyToCircular()
        circularLinkedListOperations.isLinkedListCircular()

        //swap first and last nodes in a circular linked list
        circularLinkedListOperations.deleteCircularLinkedList()
        circularLinkedListOperations.swapFirstAndLastNodes()
        circularLinkedListOperations.insertNodeAtFront(5)
        circularLinkedListOperations.swapFirstAndLastNodes()
        circularLinkedListOperations.insertNodeAtFront(4)
        circularLinkedListOperations.insertNodeAtFront(3)
        circularLinkedListOperations.insertNodeAtFront(2)
        circularLinkedListOperations.insertNodeAtFront(1)
        circularLinkedListOperations.printCircularLinkedList()
        circularLinkedListOperations.swapFirstAndLastNodes()
        circularLinkedListOperations.printCircularLinkedList()

        //swap first and last values of nodes in a circular linked list
        circularLinkedListOperations.deleteCircularLinkedList()
        circularLinkedListOperations.swapFirstAndLastValues()
        circularLinkedListOperations.insertNodeAtFront(25)
        circularLinkedListOperations.swapFirstAndLastValues()
        circularLinkedListOperations.insertNodeAtFront(24)
        circularLinkedListOperations.insertNodeAtFront(23)
        circularLinkedListOperations.insertNodeAtFront(22)
        circularLinkedListOperations.insertNodeAtFront(21)
        circularLinkedListOperations.insertNodeAtFront(20)
        circularLinkedListOperations.printCircularLinkedList()
        circularLinkedListOperations.swapFirstAndLastValues()
        circularLinkedListOperations.printCircularLinkedList()
    }
}