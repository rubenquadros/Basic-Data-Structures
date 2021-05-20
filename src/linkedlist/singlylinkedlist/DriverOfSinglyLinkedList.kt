package linkedlist.singlylinkedlist

/**
 * Created by ruben.quadros on 15/05/21
 **/
class DriverOfSinglyLinkedList {
    init {
        val singlyLinkedListOperations = SinglyLinkedListOperations()

        //try to print empty linked list
        singlyLinkedListOperations.printSinglyLinkedList()

        //try to create a loop in an empty linked list
        singlyLinkedListOperations.createHeadLoop()

        //try to find a loop in an empty linked list
        singlyLinkedListOperations.detectLoop()

        //try to find the length of the loop in an empty linked list
        singlyLinkedListOperations.getLengthOfLoop()

        //try to delete a loop in an empty linked list
        singlyLinkedListOperations.deleteLoop()

        //try to find occurrences of a value in an empty linked list (recursive)
        singlyLinkedListOperations.getRepeatingCountRecursive(0)

        //try to find occurrences of a value in an empty linked list (iterative)
        singlyLinkedListOperations.getRepeatingCountIterative(0)

        //try to find mid node of an empty linked list (2 pointers)
        singlyLinkedListOperations.getMidNodePointers()

        //try to find mid node of an empty linked list (using odd counter)
        singlyLinkedListOperations.getMidNodeOddCounter()

        //try to find mid node of an empty linked list (using length)
        singlyLinkedListOperations.getMidNode()

        //try to find nth node from last (2 pointers) on an empty list
        singlyLinkedListOperations.getNFromLastPointers(0)

        //try to find nth node from last on an empty list
        singlyLinkedListOperations.getNNodeFromLast(0)

        //try to find nth node (recursive) on an empty list
        singlyLinkedListOperations.getNodeRecursive(0)

        //try to find nth node (iterative) on an empty list
        singlyLinkedListOperations.getNodeIterative(0)

        //try to search (recursive) an element in linked list when it is empty
        singlyLinkedListOperations.searchElementRecursive(2)

        //try to search (iterative) an element in linked list when it is empty
        singlyLinkedListOperations.searchElementIterative(3)

        //find the length of an empty linked list
        singlyLinkedListOperations.getLinkedListLength()

        //try to delete an empty linked list
        singlyLinkedListOperations.deleteLinkedList()

        //try to delete a position on an empty linked list
        singlyLinkedListOperations.deleteNodeOfPosition(0)

        //try to delete a node on an empty linked list
        singlyLinkedListOperations.deleteNodeOfKey(1)

        //try to insert node after a given node on an empty linked list
        singlyLinkedListOperations.insertNodeAfterGivenNode(10, 2)

        //try to insert node at end on an empty linked list
        singlyLinkedListOperations.insertNodeAtEnd(1)

        //insert nodes at front
        singlyLinkedListOperations.insertNodeAtFront(5)
        singlyLinkedListOperations.insertNodeAtFront(6)
        singlyLinkedListOperations.insertNodeAtFront(4)
        singlyLinkedListOperations.insertNodeAtFront(4)
        singlyLinkedListOperations.printSinglyLinkedList()

        //try to insert a node after a node that is not present in the linked list
        singlyLinkedListOperations.insertNodeAfterGivenNode(10, 7)

        //insert nodes after a given node
        singlyLinkedListOperations.insertNodeAfterGivenNode(6, 7)
        singlyLinkedListOperations.insertNodeAfterGivenNode(5, 8)
        singlyLinkedListOperations.printSinglyLinkedList()

        //insert nodes at end
        singlyLinkedListOperations.insertNodeAtEnd(2)
        singlyLinkedListOperations.insertNodeAtEnd(3)
        singlyLinkedListOperations.insertNodeAtEnd(9)
        singlyLinkedListOperations.insertNodeAtEnd(11)
        singlyLinkedListOperations.printSinglyLinkedList()

        //try to delete a node that is not present in the linked list
        singlyLinkedListOperations.deleteNodeOfKey(20)

        //delete nodes of linked list with keys
        singlyLinkedListOperations.deleteNodeOfKey(4)
        singlyLinkedListOperations.deleteNodeOfKey(11)
        singlyLinkedListOperations.deleteNodeOfKey(5)
        singlyLinkedListOperations.printSinglyLinkedList()

        //try to delete out of bound positions of linked list
        singlyLinkedListOperations.deleteNodeOfPosition(-1)
        singlyLinkedListOperations.deleteNodeOfPosition(10)

        //delete nodes of linked list with positions
        singlyLinkedListOperations.deleteNodeOfPosition(0)
        singlyLinkedListOperations.deleteNodeOfPosition(6)
        singlyLinkedListOperations.deleteNodeOfPosition(2)
        singlyLinkedListOperations.printSinglyLinkedList()

        //find the length of the linked list
        singlyLinkedListOperations.getLinkedListLength()

        //try to find an element (recursive) in linked list that is not present
        singlyLinkedListOperations.searchElementRecursive(30)

        //find an element in linked list (recursive)
        singlyLinkedListOperations.searchElementRecursive(7)

        //try to find an element (iterative) in linked list that is not present
        singlyLinkedListOperations.searchElementIterative(40)

        //find an element in linked list (iterative)
        singlyLinkedListOperations.searchElementIterative(7)

        //try to find a node that is out of bound of linked list (iterative)
        singlyLinkedListOperations.getNodeIterative(-1)
        singlyLinkedListOperations.getNodeIterative(10)

        //find the nth node of a linked list (iterative)
        singlyLinkedListOperations.getNodeIterative(0)
        singlyLinkedListOperations.getNodeIterative(4)
        singlyLinkedListOperations.getNodeIterative(2)

        //try to find a node that is out of bound of linked list (recursive)
        singlyLinkedListOperations.getNodeRecursive(-2)
        singlyLinkedListOperations.getNodeRecursive(20)

        //find the nth node of a linked list (recursive)
        singlyLinkedListOperations.getNodeRecursive(0)
        singlyLinkedListOperations.getNodeRecursive(4)
        singlyLinkedListOperations.getNodeRecursive(3)

        //try to find nth node from last that is out of bound of linked list
        singlyLinkedListOperations.getNNodeFromLast(-1)
        singlyLinkedListOperations.getNNodeFromLast(0)
        singlyLinkedListOperations.getNNodeFromLast(10)

        //find the nth node from last of a linked list
        singlyLinkedListOperations.getNNodeFromLast(1)
        singlyLinkedListOperations.getNNodeFromLast(5)
        singlyLinkedListOperations.getNNodeFromLast(2)

        //try to find nth node from last (2 pointers) that is out of bound of linked list
        singlyLinkedListOperations.getNFromLastPointers(-1)
        singlyLinkedListOperations.getNFromLastPointers(0)
        singlyLinkedListOperations.getNFromLastPointers(10)

        //find the nth node from last (2 pointers) of a linked list
        singlyLinkedListOperations.getNFromLastPointers(1)
        singlyLinkedListOperations.getNFromLastPointers(5)
        singlyLinkedListOperations.getNFromLastPointers(4)

        //find the mid node of linked list (using length)
        singlyLinkedListOperations.getMidNode()

        //find the mid node of linked list (odd counter)
        singlyLinkedListOperations.getMidNodeOddCounter()

        //find the mid node of linked list (2 pointers)
        singlyLinkedListOperations.getMidNodePointers()

        //find occurrences of a value in the linked list (iterative)
        singlyLinkedListOperations.insertNodeAtEnd(6)
        singlyLinkedListOperations.getRepeatingCountIterative(10)
        singlyLinkedListOperations.getRepeatingCountIterative(1)
        singlyLinkedListOperations.getRepeatingCountIterative(6)

        //find occurrences of a value in the linked list (recursive)
        singlyLinkedListOperations.getRepeatingCountRecursive(10)
        singlyLinkedListOperations.getRepeatingCountRecursive(1)
        singlyLinkedListOperations.getRepeatingCountRecursive(6)

        //detect loop when there is no loop in linked list
        singlyLinkedListOperations.detectLoop()

        //find length of the loop when there is no loop in linked list
        singlyLinkedListOperations.getLengthOfLoop()

        //create a loop in linked list
        singlyLinkedListOperations.createHeadLoop()

        //detect loop in linked list
        singlyLinkedListOperations.detectLoop()

        //find the length of the loop in linked list
        singlyLinkedListOperations.getLengthOfLoop()

        //delete loop when there is no loop in linked list
        singlyLinkedListOperations.deleteLoop()

        //delete loop in linked list
        singlyLinkedListOperations.deleteLoop()
        singlyLinkedListOperations.printSinglyLinkedList()

        //create a loop in linked list
        singlyLinkedListOperations.createLoop()

        //find the length of the loop in linked list
        singlyLinkedListOperations.getLengthOfLoop()

        //delete loop in linked list
        singlyLinkedListOperations.deleteLoop()
        singlyLinkedListOperations.printSinglyLinkedList()

        //check if linked list is palindrome (stack)
        singlyLinkedListOperations.isLinkedListPalindromeStack()
        singlyLinkedListOperations.isLinkedListPalindromeRecursive()

        //create a palindrome linked list and check if it is palindrome
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.isLinkedListPalindromeStack()
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(2)
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.isLinkedListPalindromeStack()
        singlyLinkedListOperations.isLinkedListPalindromeRecursive()
        singlyLinkedListOperations.printSinglyLinkedList()

        //remove duplicates from linked list which does not have any duplicates
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.insertNodeAtEnd(6)
        singlyLinkedListOperations.insertNodeAtEnd(7)
        singlyLinkedListOperations.insertNodeAtEnd(8)
        singlyLinkedListOperations.removeSortedDuplicatesIterative()
        singlyLinkedListOperations.printSinglyLinkedList()

        //remove sorted duplicates from a sorted linked list (iterative)
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.removeSortedDuplicatesIterative()
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(2)
        singlyLinkedListOperations.insertNodeAtEnd(3)
        singlyLinkedListOperations.insertNodeAtEnd(3)
        singlyLinkedListOperations.insertNodeAtEnd(4)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.removeSortedDuplicatesIterative()
        singlyLinkedListOperations.printSinglyLinkedList()

        //remove sorted duplicates from a sorted linked list (2 pointers)
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.removeSortedDuplicatesPointers()
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(2)
        singlyLinkedListOperations.insertNodeAtEnd(3)
        singlyLinkedListOperations.insertNodeAtEnd(4)
        singlyLinkedListOperations.insertNodeAtEnd(4)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.removeSortedDuplicatesPointers()
        singlyLinkedListOperations.printSinglyLinkedList()

        //remove sorted duplicates from a sorted linked list (recursive)
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.removeSortedDuplicatesRecursive()
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(2)
        singlyLinkedListOperations.insertNodeAtEnd(2)
        singlyLinkedListOperations.insertNodeAtEnd(3)
        singlyLinkedListOperations.insertNodeAtEnd(4)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.removeSortedDuplicatesRecursive()
        singlyLinkedListOperations.printSinglyLinkedList()

        //remove unsorted duplicates from a sorted linked list
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.removeUnsortedDuplicates()
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(2)
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(3)
        singlyLinkedListOperations.insertNodeAtEnd(4)
        singlyLinkedListOperations.insertNodeAtEnd(3)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.removeUnsortedDuplicates()
        singlyLinkedListOperations.printSinglyLinkedList()

        //swap nodes in a linked list
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.swapNodes(0, 1)
        singlyLinkedListOperations.insertNodeAtEnd(10)
        singlyLinkedListOperations.insertNodeAtEnd(15)
        singlyLinkedListOperations.insertNodeAtEnd(12)
        singlyLinkedListOperations.insertNodeAtEnd(13)
        singlyLinkedListOperations.insertNodeAtEnd(20)
        singlyLinkedListOperations.insertNodeAtEnd(14)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.swapNodes(1, 10)
        singlyLinkedListOperations.swapNodes(10, 30)
        singlyLinkedListOperations.swapNodes(2, 4)
        singlyLinkedListOperations.swapNodes(10, 10)
        singlyLinkedListOperations.swapNodes(12, 20)
        singlyLinkedListOperations.swapNodes(10, 13)
        singlyLinkedListOperations.swapNodes(15, 14)
        singlyLinkedListOperations.swapNodes(13, 15)
        singlyLinkedListOperations.printSinglyLinkedList()

        //swap k and k from last nodes
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.swapKAndKFromLast(1)
        singlyLinkedListOperations.insertNodeAtFront(10)
        singlyLinkedListOperations.swapKAndKFromLast(1)
        singlyLinkedListOperations.insertNodeAtFront(9)
        singlyLinkedListOperations.swapKAndKFromLast(3)
        singlyLinkedListOperations.insertNodeAtFront(8)
        singlyLinkedListOperations.insertNodeAtFront(7)
        singlyLinkedListOperations.swapKAndKFromLast(2)
        singlyLinkedListOperations.insertNodeAtFront(6)
        singlyLinkedListOperations.swapKAndKFromLast(-1)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.swapKAndKFromLast(5)
        singlyLinkedListOperations.printSinglyLinkedList()

        //pairwise swap nodes of a linked list (iterative)
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.pairwiseSwapNodesIterative()
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(2)
        singlyLinkedListOperations.insertNodeAtEnd(3)
        singlyLinkedListOperations.insertNodeAtEnd(4)
        singlyLinkedListOperations.insertNodeAtEnd(5)
        singlyLinkedListOperations.insertNodeAtEnd(6)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.pairwiseSwapNodesIterative()
        singlyLinkedListOperations.printSinglyLinkedList()

        //pairwise swap nodes of a linked list (recursive)
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.pairwiseSwapNodesRecursive()
        singlyLinkedListOperations.insertNodeAtEnd(11)
        singlyLinkedListOperations.insertNodeAtEnd(12)
        singlyLinkedListOperations.insertNodeAtEnd(13)
        singlyLinkedListOperations.insertNodeAtEnd(14)
        singlyLinkedListOperations.insertNodeAtEnd(15)
        singlyLinkedListOperations.insertNodeAtEnd(16)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.pairwiseSwapNodesIterative()
        singlyLinkedListOperations.printSinglyLinkedList()

        //move last node of linked list to front
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.moveToFront()
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(2)
        singlyLinkedListOperations.insertNodeAtEnd(3)
        singlyLinkedListOperations.insertNodeAtEnd(4)
        singlyLinkedListOperations.insertNodeAtEnd(5)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.moveToFront()
        singlyLinkedListOperations.printSinglyLinkedList()

        //segregate even and odd nodes of linked list
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.segregateEvenOdd()
        singlyLinkedListOperations.insertNodeAtEnd(17)
        singlyLinkedListOperations.insertNodeAtEnd(15)
        singlyLinkedListOperations.insertNodeAtEnd(8)
        singlyLinkedListOperations.insertNodeAtEnd(12)
        singlyLinkedListOperations.insertNodeAtEnd(10)
        singlyLinkedListOperations.insertNodeAtEnd(5)
        singlyLinkedListOperations.insertNodeAtEnd(4)
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(7)
        singlyLinkedListOperations.insertNodeAtEnd(6)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.segregateEvenOdd()
        singlyLinkedListOperations.printSinglyLinkedList()

        //reverse a linked list (iterative)
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.reverseLinkedListIterative()
        singlyLinkedListOperations.insertNodeAtEnd(1)
        singlyLinkedListOperations.insertNodeAtEnd(2)
        singlyLinkedListOperations.insertNodeAtEnd(3)
        singlyLinkedListOperations.insertNodeAtEnd(4)
        singlyLinkedListOperations.insertNodeAtEnd(5)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.reverseLinkedListIterative()
        singlyLinkedListOperations.printSinglyLinkedList()

        //reverse a linked list (recursive)
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.reverseLinkedListRecursive()
        singlyLinkedListOperations.insertNodeAtEnd(6)
        singlyLinkedListOperations.insertNodeAtEnd(7)
        singlyLinkedListOperations.insertNodeAtEnd(8)
        singlyLinkedListOperations.insertNodeAtEnd(9)
        singlyLinkedListOperations.insertNodeAtEnd(10)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.reverseLinkedListRecursive()
        singlyLinkedListOperations.printSinglyLinkedList()

        //reverse a linked list (stack)
        singlyLinkedListOperations.deleteLinkedList()
        singlyLinkedListOperations.reverseLinkedListStack()
        singlyLinkedListOperations.insertNodeAtEnd(26)
        singlyLinkedListOperations.insertNodeAtEnd(27)
        singlyLinkedListOperations.insertNodeAtEnd(28)
        singlyLinkedListOperations.insertNodeAtEnd(29)
        singlyLinkedListOperations.insertNodeAtEnd(30)
        singlyLinkedListOperations.printSinglyLinkedList()
        singlyLinkedListOperations.reverseLinkedListStack()
        singlyLinkedListOperations.printSinglyLinkedList()

        //delete the linked list
        singlyLinkedListOperations.deleteLinkedList()

        //print linked list after it has been deleted
        singlyLinkedListOperations.printSinglyLinkedList()
    }
}