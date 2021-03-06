package linkedlist.doublylinkedlist

/**
 * Created by ruben.quadros on 18/05/21
 **/
class DriverOfDoublyLinkedList {
    init {
        val doublyLinkedListOperations = DoubleLinkedListOperations()

        //try to print an empty doubly linked list
        doublyLinkedListOperations.printDoublyLinkedList()

        //try to delete an empty doubly linked list
        doublyLinkedListOperations.deleteDoublyLinkedList()

        //insert a node at front of the doubly linked list
        doublyLinkedListOperations.insertNodeAtFront(5)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(3)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.insertNodeAtFront(1)
        doublyLinkedListOperations.printDoublyLinkedList()

        //insert a node after a given node in the doubly linked list
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.insertNodeAfter(2, 5)
        doublyLinkedListOperations.insertNodeAtFront(15)
        doublyLinkedListOperations.insertNodeAtFront(14)
        doublyLinkedListOperations.insertNodeAtFront(13)
        doublyLinkedListOperations.insertNodeAtFront(12)
        doublyLinkedListOperations.insertNodeAtFront(11)
        doublyLinkedListOperations.insertNodeAtFront(10)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.insertNodeAfter(20, 6)
        doublyLinkedListOperations.insertNodeAfter(10, 4)
        doublyLinkedListOperations.insertNodeAfter(15, 8)
        doublyLinkedListOperations.insertNodeAfter(12, 3)
        doublyLinkedListOperations.printDoublyLinkedList()

        //insert a node at the end of doubly linked list
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.insertNodeAtEnd(6)
        doublyLinkedListOperations.insertNodeAtEnd(7)
        doublyLinkedListOperations.insertNodeAtEnd(8)
        doublyLinkedListOperations.insertNodeAtEnd(9)
        doublyLinkedListOperations.insertNodeAtEnd(10)
        doublyLinkedListOperations.printDoublyLinkedList()

        //insert a node before a given node in doubly linked list
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.insertNodeBefore(1, 2)
        doublyLinkedListOperations.insertNodeAtFront(25)
        doublyLinkedListOperations.insertNodeAtFront(24)
        doublyLinkedListOperations.insertNodeAtFront(23)
        doublyLinkedListOperations.insertNodeAtFront(22)
        doublyLinkedListOperations.insertNodeAtFront(21)
        doublyLinkedListOperations.insertNodeAtFront(20)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.insertNodeBefore(30, 3)
        doublyLinkedListOperations.insertNodeBefore(20, 5)
        doublyLinkedListOperations.insertNodeBefore(25, 10)
        doublyLinkedListOperations.insertNodeBefore(22, 8)
        doublyLinkedListOperations.printDoublyLinkedList()

        //delete a given node in doubly linked list
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.deleteNode(4)
        doublyLinkedListOperations.insertNodeAtFront(5)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(3)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.insertNodeAtFront(1)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.deleteNode(10)
        doublyLinkedListOperations.deleteNode(1)
        doublyLinkedListOperations.deleteNode(5)
        doublyLinkedListOperations.deleteNode(3)
        doublyLinkedListOperations.printDoublyLinkedList()

        //reverse a doubly linked list using stack
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.reverseDoublyLinkedListStack()
        doublyLinkedListOperations.insertNodeAtFront(15)
        doublyLinkedListOperations.reverseDoublyLinkedListStack()
        doublyLinkedListOperations.insertNodeAtFront(14)
        doublyLinkedListOperations.insertNodeAtFront(13)
        doublyLinkedListOperations.insertNodeAtFront(12)
        doublyLinkedListOperations.insertNodeAtFront(11)
        doublyLinkedListOperations.insertNodeAtFront(10)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.reverseDoublyLinkedListStack()
        doublyLinkedListOperations.printDoublyLinkedList()

        //reverse a doubly linked list by swapping
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.reverseDoublyLinkedList()
        doublyLinkedListOperations.insertNodeAtFront(30)
        doublyLinkedListOperations.reverseDoublyLinkedList()
        doublyLinkedListOperations.insertNodeAtFront(29)
        doublyLinkedListOperations.insertNodeAtFront(28)
        doublyLinkedListOperations.insertNodeAtFront(27)
        doublyLinkedListOperations.insertNodeAtFront(26)
        doublyLinkedListOperations.insertNodeAtFront(25)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.reverseDoublyLinkedList()
        doublyLinkedListOperations.printDoublyLinkedList()

        //find all pairs with given sum
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.findPairSorted(1)
        doublyLinkedListOperations.insertNodeAtFront(9)
        doublyLinkedListOperations.findPairSorted(2)
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.insertNodeAtFront(6)
        doublyLinkedListOperations.insertNodeAtFront(5)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.insertNodeAtFront(1)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.findPairSorted(7)

        //insert a node in doubly linked list in sorted way
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.sortedInsertNode(5)
        doublyLinkedListOperations.sortedInsertNode(3)
        doublyLinkedListOperations.sortedInsertNode(8)
        doublyLinkedListOperations.sortedInsertNode(12)
        doublyLinkedListOperations.sortedInsertNode(10)
        doublyLinkedListOperations.sortedInsertNode(6)
        doublyLinkedListOperations.printDoublyLinkedList()

        //delete a node in doubly linked list at given position
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.deleteNodeAtPosition(10)
        doublyLinkedListOperations.insertNodeAtFront(20)
        doublyLinkedListOperations.insertNodeAtFront(19)
        doublyLinkedListOperations.insertNodeAtFront(18)
        doublyLinkedListOperations.insertNodeAtFront(17)
        doublyLinkedListOperations.insertNodeAtFront(16)
        doublyLinkedListOperations.insertNodeAtFront(15)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.deleteNodeAtPosition(-1)
        doublyLinkedListOperations.deleteNodeAtPosition(20)
        doublyLinkedListOperations.deleteNodeAtPosition(1)
        doublyLinkedListOperations.deleteNodeAtPosition(5)
        doublyLinkedListOperations.deleteNodeAtPosition(2)
        doublyLinkedListOperations.printDoublyLinkedList()

        //find all triplets with given sum (hashing)
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.findTripletsHash(10)
        doublyLinkedListOperations.insertNodeAtFront(9)
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.insertNodeAtFront(6)
        doublyLinkedListOperations.insertNodeAtFront(5)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.insertNodeAtFront(1)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.findTripletsHash(17)

        //find all triplets with given sum (pointers)
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.findTripletsPointers(3)
        doublyLinkedListOperations.insertNodeAtFront(9)
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.insertNodeAtFront(6)
        doublyLinkedListOperations.insertNodeAtFront(5)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.insertNodeAtFront(1)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.findTripletsPointers(17)

        //remove duplicates in a sorted doubly linked list (iterative)
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.removeDuplicatesSortedIterative()
        doublyLinkedListOperations.insertNodeAtFront(12)
        doublyLinkedListOperations.insertNodeAtFront(12)
        doublyLinkedListOperations.insertNodeAtFront(10)
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.insertNodeAtFront(6)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.removeDuplicatesSortedIterative()
        doublyLinkedListOperations.printDoublyLinkedList()

        //remove duplicates in a sorted doubly linked list (pointers)
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.removeDuplicatesSortedPointers()
        doublyLinkedListOperations.insertNodeAtFront(12)
        doublyLinkedListOperations.insertNodeAtFront(12)
        doublyLinkedListOperations.insertNodeAtFront(10)
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.insertNodeAtFront(6)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.removeDuplicatesSortedPointers()
        doublyLinkedListOperations.printDoublyLinkedList()

        //delete all nodes of a given value in doubly linked list
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.deleteAllNodesOfKey(5)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.insertNodeAtFront(5)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.insertNodeAtFront(10)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.deleteAllNodesOfKey(2)
        doublyLinkedListOperations.printDoublyLinkedList()

        //remove duplicates in an unsorted doubly linked list
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.removeDuplicatesUnsorted()
        doublyLinkedListOperations.insertNodeAtFront(12)
        doublyLinkedListOperations.insertNodeAtFront(12)
        doublyLinkedListOperations.insertNodeAtFront(10)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(6)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.removeDuplicatesUnsorted()
        doublyLinkedListOperations.printDoublyLinkedList()

        //find length of doubly linked list
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.findLength()
        doublyLinkedListOperations.insertNodeAtFront(25)
        doublyLinkedListOperations.insertNodeAtFront(24)
        doublyLinkedListOperations.insertNodeAtFront(23)
        doublyLinkedListOperations.insertNodeAtFront(22)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.findLength()

        //rotate doubly linked list counter clockwise by given N
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.rotateDoublyLinkedList(5)
        doublyLinkedListOperations.insertNodeAtFront(5)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(3)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.insertNodeAtFront(1)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.rotateDoublyLinkedList(-1)
        doublyLinkedListOperations.rotateDoublyLinkedList(2)
        doublyLinkedListOperations.printDoublyLinkedList()

        //reverse a doubly linked list in given group N
        doublyLinkedListOperations.deleteDoublyLinkedList()
        doublyLinkedListOperations.insertNodeAtFront(8)
        doublyLinkedListOperations.insertNodeAtFront(7)
        doublyLinkedListOperations.insertNodeAtFront(6)
        doublyLinkedListOperations.insertNodeAtFront(5)
        doublyLinkedListOperations.insertNodeAtFront(4)
        doublyLinkedListOperations.insertNodeAtFront(3)
        doublyLinkedListOperations.insertNodeAtFront(2)
        doublyLinkedListOperations.insertNodeAtFront(1)
        doublyLinkedListOperations.printDoublyLinkedList()
        doublyLinkedListOperations.reverseInGroups(3)
        doublyLinkedListOperations.printDoublyLinkedList()
    }
}