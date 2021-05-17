package linkedlist

import java.util.*
import kotlin.collections.HashSet

/**
 * Created by ruben.quadros on 15/05/21
 **/
class SinglyLinkedListOperations {

    private var singlyLinkedList = SinglyLinkedList()

    init {
        print("\n")
        println("=============== SINGLY LINKED LIST ================")
    }

    private var left: Node? = null

    /**
     * @param newValue
     * insert a new node at the front of a linked list
     * takes value of the new node as an input param
     */
    fun insertNodeAtFront(newValue: Int) {
        val newNode = Node(newValue)
        if (singlyLinkedList.head == null) {
            singlyLinkedList.head = newNode
        } else {
            newNode.next = singlyLinkedList.head
            singlyLinkedList.head = newNode
        }
    }

    /**
     * @param prevValue
     * @param newValue
     * insert a new node after the value of the given node
     * takes value of previous node and new node as input params
     * if linked list is empty then new value cannot be added
     * if given value is not present as node then new value cannot be added
     */
    fun insertNodeAfterGivenNode(prevValue: Int, newValue: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot add value $newValue as Linked List is empty")
            return
        }
        var node: Node? = singlyLinkedList.head
        while (node != null) {
            if(node.data == prevValue) {
                val newNode = Node(newValue)
                newNode.next = node.next
                node.next = newNode
                return
            }
            node = node.next
        }
        println("Cannot add value $newValue after $prevValue as it is NOT present in the linked list")
    }

    /**
     * @param newValue
     * insert a node at the end of the linked list
     * takes value of the new node as an input param
     * if the linked list is empty then insert new node at front
     */
    fun insertNodeAtEnd(newValue: Int) {
        if (singlyLinkedList.head == null) {
            insertNodeAtFront(newValue)
            return
        }
        val newNode = Node(newValue)
        var node = singlyLinkedList.head
        while(node?.next != null) {
            node = node.next
        }
        node?.next = newNode
    }

    /**
     * @param value
     * delete a node of given value
     * if linked list is empty then cannot be deleted
     * if head is equal to value then change head to next node
     * if no node is present for given value then cannot be deleted
     */
    fun deleteNodeOfKey(value: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot delete $value as Linked List is empty")
            return
        }
        var current = singlyLinkedList.head
        var previous: Node? = null
        if (current?.data == value) {
            singlyLinkedList.head = current.next
            current.next = null
            return
        }
        while (current != null) {
            if(current.data == value) {
                previous?.next = current.next
                current.next = null
                return
            }
            previous = current
            current = current.next
        }
        println("Cannot delete $value as it is NOT present in the linked list")
    }

    /**
     * @param position
     * delete a node at a given position
     * if linked list if empty then cannot be deleted
     * if given position is out of bounds of linked list then cannot be deleted
     * if position is 0 then change head to next node
     */
    fun deleteNodeOfPosition(position: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot delete node at position $position as linked list is empty")
            return
        }
        if (position < 0) {
            println("Cannot delete position $position as given position is out of bounds of linked list")
            return
        }
        var node = singlyLinkedList.head
        if(position == 0) {
            singlyLinkedList.head = node?.next
            node?.next = null
            return
        }
        for (i in 1 until position) {
            if(node?.next == null) {
                println("Cannot delete position $position as given position is out of bounds of linked list")
                return
            }
            node = node.next
        }
        val temp = node?.next?.next
        node?.next = temp
    }

    /**
     * calculate the length of the linked list
     */
    fun getLinkedListLength() {
        var length = 0
        if(singlyLinkedList.head == null) {
            println("Length of linked list is $length as it is empty")
            return
        }
        var node = singlyLinkedList.head
        while (node != null) {
            node = node.next
            length++
        }
        println("Length of linked list is $length")
    }

    /**
     * @param target
     * search the given target in linked list iteratively
     * takes target as an input to search in the linked list and returns the first position
     * if linked list is empty then cannot find
     * if the target is not present in the linked list then cannot find
     */
    fun searchElementIterative(target: Int) {
        if(singlyLinkedList.head == null) {
            println("Cannot find $target as the linked list is empty (Iterative)")
            return
        }
        var temp = singlyLinkedList.head
        var position = 0
        while (temp != null) {
            if (temp.data == target) {
                println("Found $target at position $position (Iterative)")
                return
            }
            temp = temp.next
            position++
        }
        println("Cannot find $target in the linked list (Iterative)")
    }

    /**
     * @param target
     * search the given target in linked list recursively
     * takes target as an input to search in the linked list and returns the first position
     * if linked list is empty then cannot find
     * if the target is not present in the linked list then cannot find
     */
    fun searchElementRecursive(target: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot find $target as the linked list is empty (Recursive)")
            return
        }
        searchRecursive(singlyLinkedList.head, target, 0)
    }

    /**
     * @param position
     * find the value of the nth node iteratively
     * takes position as an input param and finds the value of node at given position
     * if linked list is empty then cannot find the value of node
     * if given position is out of bounds of linked list then cannot find the value of node
     */
    fun getNodeIterative(position: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot find ${position}th node as linked list is empty (Iterative)")
            return
        }
        if (position < 0) {
            println("Cannot get node at position $position as it is out of bounds of linked list (Iterative)")
            return
        }
        var temp = singlyLinkedList.head
        var count = 0
        while (temp != null) {
            if (count == position) {
                println("Value of node at position $position is ${temp.data} (Iterative)")
                return
            }
            temp = temp.next
            count++
        }
        println("Cannot get node at position $position as it is out of bounds of linked list (Iterative)")
    }

    /**
     * @param position
     * find the value of the nth node recursively
     * takes position as an input param and finds the value of node at given position
     * if linked list is empty then cannot find the value of node
     * if given position is out of bounds of linked list then cannot find the value of node
     */
    fun getNodeRecursive(position: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot find ${position}th node as linked list is empty (Recursive)")
            return
        }
        if (position < 0) {
            println("Cannot get node at position $position as it is out of bounds of linked list (Recursive)")
            return
        }
        getNRecursive(singlyLinkedList.head, 0, position)
    }

    /**
     * @param position
     * find the value of the nth node from last using length of linked list
     * takes n as an input param and find nth node from last
     * if linked list is empty then cannot find nth last node
     * if given n is out of bounds of linked list then cannot find nth last node
     */
    fun getNNodeFromLast(position: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot find ${position}th node from last as linked list is empty")
            return
        }
        var node = singlyLinkedList.head
        var length = 0
        while (node != null) {
            length++
            node = node.next
        }
        if (length < position || position <= 0) {
            println("Cannot find ${position}th node from last as it is out bounds of linked list")
            return
        }
        node = singlyLinkedList.head
        for (i in 0 until length-position) {
            node = node?.next
        }
        println("Value of ${position}th node from last is ${node?.data}")
    }

    /**
     * @param position
     * find the value of the nth node from last using 2 pointers
     * takes n as an input param and find nth node from last
     * if linked list is empty then cannot find nth last node
     * if given n is out of bounds of linked list then cannot find nth last node
     */
    fun getNFromLastPointers(position: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot find ${position}th node from last as linked list is empty (2 pointers)")
            return
        }
        if (position <= 0) {
            println("Cannot find ${position}th node from last as it is out bounds of linked list (2 pointers)")
            return
        }
        var forwardPtr = singlyLinkedList.head
        for (i in 0 until position) {
            if (forwardPtr == null) {
                println("Cannot find ${position}th node from last as it is out bounds of linked list (2 pointers)")
                return
            }
            forwardPtr = forwardPtr.next
        }
        if (forwardPtr == null) {
            println("Value of ${position}th node from last is ${singlyLinkedList.head?.data} (2 pointers)")
            return
        }
        var backwardPrt = singlyLinkedList.head
        while (forwardPtr != null) {
            forwardPtr = forwardPtr.next
            backwardPrt = backwardPrt?.next
        }
        println("Value of ${position}th node from last is ${backwardPrt?.data} (2 pointers)")
    }

    /**
     * find the value of mid node of linked list using length of linked list
     * if linked list is empty then cannot find the mid node
     */
    fun getMidNode() {
        if (singlyLinkedList.head == null) {
            println("Cannot find mid node as linked list is empty (using length)")
            return
        }
        var temp = singlyLinkedList.head
        var length = 0
        while (temp != null) {
            length++
            temp = temp.next
        }
        temp = singlyLinkedList.head
        for (i in 0 until length/2) {
            temp = temp?.next
        }
        println("Value of mid node is ${temp?.data} (using length)")
    }

    /**
     * find the value of mid node of linked list by incrementing mid on odd counter
     * if linked list is empty then cannot find the mid node
     */
    fun getMidNodeOddCounter() {
        if (singlyLinkedList.head == null) {
            println("Cannot find mid node as linked list is empty (odd counter)")
            return
        }
        var temp = singlyLinkedList.head
        var mid = singlyLinkedList.head
        var count = 0
        while (temp != null) {
            if (count%2 == 1) {
                mid = mid?.next
            }
            count++
            temp = temp.next
        }
        println("Value of mid node is ${mid?.data} (odd counter)")
    }

    /**
     * find the value of mid node of linked list using slow and fast pointers
     * if linked list is empty then cannot find the mid node
     */
    fun getMidNodePointers() {
        if (singlyLinkedList.head == null) {
            println("Cannot find mid node as linked list is empty (2 pointers)")
            return
        }
        var fastPointer = singlyLinkedList.head
        var slowPointer = singlyLinkedList.head
        while (fastPointer?.next != null) {
            fastPointer = fastPointer.next?.next
            slowPointer = slowPointer?.next
        }
        println("Value of mid node is ${slowPointer?.data} (2 pointers)")
    }

    /**
     * @param target
     * finds the total occurrences of a value in the linked list iteratively
     * takes n as an input parameter and finds the total occurrences of n in the linked list
     * if linked list is empty then cannot find the occurrences
     */
    fun getRepeatingCountIterative(target: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot find occurrences of $target as linked list is empty (iterative)")
            return
        }
        var temp = singlyLinkedList.head
        var count = 0
        while (temp != null) {
            if (temp.data == target) {
                count++
            }
            temp = temp.next
        }
        println("Occurrences of $target is: $count (iterative)")
    }

    /**
     * @param target
     * finds the total occurrences of a value in the linked list recursively
     * takes n as an input parameter and finds the total occurrences of n in the linked list
     * if linked list is empty then cannot find the occurrences
     */
    fun getRepeatingCountRecursive(target: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot find occurrences of $target as linked list is empty (recursive)")
            return
        }
        getRepeatingRecursive(singlyLinkedList.head, target, 0)
    }

    /**
     * detect if a loop is present in the linked list
     * uses Floyd’s Cycle-Finding Algorithm
     * if linked list is empty then cannot detect
     */
    fun detectLoop() {
        if(singlyLinkedList.head == null) {
            println("Cannot detect loop as linked list is empty")
            return
        }
        var fastPointer = singlyLinkedList.head
        var slowPointer = singlyLinkedList.head
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next
            fastPointer = fastPointer.next?.next
            if(slowPointer == fastPointer) {
                println("The linked list has a loop")
                return
            }
        }
        println("The linked list does not have a loop")
    }

    /**
     * creates a circular linked list
     * cannot create a loop if the linked list is empty
     */
    fun createHeadLoop() {
        if (singlyLinkedList.head == null) {
            println("Cannot create a loop as linked list is empty")
            return
        }
        val head = singlyLinkedList.head
        var temp = singlyLinkedList.head
        while (temp?.next != null) {
            temp = temp.next
        }
        temp?.next = head
    }

    /**
     * creates a loop in the linked list
     * cannot create a loop if the linked list is empty
     */
    fun createLoop() {
        if (singlyLinkedList.head == null) {
            println("Cannot create a loop as linked list is empty")
            return
        }
        var temp = singlyLinkedList.head
        val loop = singlyLinkedList.head?.next?.next?.next
        while (temp?.next != null) {
            temp = temp.next
        }
        temp?.next = loop
    }

    /**
     * find out the length of the loop in the linked list
     * cannot find the length of the loop if the linked list is empty
     */
    fun getLengthOfLoop() {
        if (singlyLinkedList.head == null) {
            println("Cannot get length of the loop as linked list is empty")
            return
        }
        var slowPointer = singlyLinkedList.head
        var fastPointer = singlyLinkedList.head
        var isLoop = false
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next
            fastPointer = fastPointer.next?.next
            if (slowPointer == fastPointer) {
                isLoop = true
                break
            }
        }
        if (isLoop) {
            lengthOfLoop(fastPointer)
        } else {
            println("Cannot find length of loop as there is no loop in the linked list")
        }
    }

    /**
     * delete a loop if its present in linked list
     */
    fun deleteLoop() {
        if (singlyLinkedList.head == null) {
            println("Cannot delete any loop as linked list is empty")
            return
        }
        var slowPointer: Node? = singlyLinkedList.head
        var fastPointer: Node? = singlyLinkedList.head
        var isLoop = false
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next
            fastPointer = fastPointer.next?.next
            if (slowPointer == fastPointer) {
                isLoop = true
                break
            }
        }
        if (isLoop) {
            removeLoop(singlyLinkedList.head, fastPointer)
        } else {
            println("Cannot delete any loop as no loop is present in the linked list")
        }
    }

    /**
     * check if given linked list is palindrome using stack
     * cannot determine if linked list is empty
     */
    fun isLinkedListPalindromeStack() {
        if (singlyLinkedList.head == null) {
            println("Cannot determine if linked list is palindrome as it is empty (stack)")
            return
        }
        val stack = Stack<Int>()
        var temp = singlyLinkedList.head
        while (temp != null) {
            stack.push(temp.data)
            temp = temp.next
        }
        temp = singlyLinkedList.head
        while (temp != null) {
            if (stack.pop() != temp.data) {
                println("Linked list is not palindrome (stack)")
                return
            }
            temp = temp.next
        }
        println("Linked list is palindrome (stack)")
    }

    /**
     * check if given linked list is palindrome using recursion
     * cannot determine if linked list is empty
     */
    fun isLinkedListPalindromeRecursive() {
        if (singlyLinkedList.head == null) {
            println("Cannot determine if linked list is palindrome as it is empty (recursive)")
            return
        }
        left = singlyLinkedList.head
        if (palindromeRecursive(left)) {
            println("Linked list is palindrome (recursive)")
        } else {
            println("Linked list is not palindrome (recursive)")
        }
    }

    /**
     * remove duplicates in a sorted linked list iteratively
     * cannot remove duplicates if linked list is empty
     */
    fun removeSortedDuplicatesIterative() {
        if (singlyLinkedList.head == null) {
            println("Cannot remove sorted duplicates as linked list is empty (iterative)")
            return
        }
        var node = singlyLinkedList.head
        while (node?.next != null) {
            if (node.data == node.next?.data) {
                val temp = node.next
                node.next = node.next?.next
                temp?.next = null
            }
            node = node.next
        }
    }

    /**
     * remove duplicates in a sorted linked list using 2 pointers
     * cannot remove duplicates if linked list is empty
     */
    fun removeSortedDuplicatesPointers() {
        if (singlyLinkedList.head == null) {
            println("Cannot remove sorted duplicates as linked list is empty (2 pointers)")
            return
        }
        var current = singlyLinkedList.head
        var previous = singlyLinkedList.head
        while (current != null) {
            if (current.data != previous?.data) {
                previous?.next = current
                previous = current
            }
            current = current.next
        }
        if (previous != current) {
            previous.next = null
        }
    }

    /**
     * remove duplicates in a sorted linked list using recursion
     * cannot remove duplicates if linked list is empty
     */
    fun removeSortedDuplicatesRecursive() {
        if (singlyLinkedList.head == null) {
            println("Cannot remove sorted duplicates as linked list is empty (recursive)")
            return
        }
        duplicatesRecursive(singlyLinkedList.head)
    }

    /**
     * remove duplicates in an unsorted linked list
     * cannot remove duplicates if linked list is empty
     */
    fun removeUnsortedDuplicates() {
        if (singlyLinkedList.head == null) {
            println("Cannot remove unsorted duplicates as linked list is empty")
            return
        }
        var current: Node? = singlyLinkedList.head
        var previous: Node? = null
        val set = HashSet<Int>()
        while (current != null) {
            if (set.contains(current.data)) {
                previous?.next = current.next
            } else {
                set.add(current.data)
                previous = current
            }
            current = current.next
        }
    }

    /**
     * @param x
     * @param y
     * swap 2 nodes in a linked list
     * takes values of node1 and node2 as input params and swaps node1 with node2
     * cannot swap nodes if linked list is empty
     * no swapping if both nodes have same value
     * no swapping if one or both values not present in linked list
     */
    fun swapNodes(x: Int, y: Int) {
        if (singlyLinkedList.head == null) {
            println("Cannot swap nodes as the linked list is empty")
            return
        }
        if (x == y) {
            println("Nothing to swap as both values are same")
            return
        }
        var currX: Node? = null
        var prevX: Node? = null
        var currY: Node? = null
        var prevY: Node? = null
        var node: Node? = singlyLinkedList.head
        while (node != null) {
            if (node.data == x) {
                currX = node
            }
            if (node.data == y) {
                currY = node
            }
            if (currX == null) {
                prevX = node
            }
            if (currY == null) {
                prevY = node
            }
            node = node.next
        }
        if (currX == null || currY == null) {
            println("Cannot perform swapping as one or both of the values is not present")
            return
        }
        if (prevX != null) {
            prevX.next = currY
        } else {
            singlyLinkedList.head = currY
        }
        if (prevY != null) {
            prevY.next = currX
        } else {
            singlyLinkedList.head = currX
        }
        val temp = currY.next
        currY.next = currX.next
        currX.next = temp
    }

    /**
     * pairwise swap nodes in a linked list iteratively
     * cannot swap nodes pairwise if linked list is empty
     */
    fun pairwiseSwapNodesIterative() {
        if (singlyLinkedList.head == null) {
            println("Cannot swap nodes pairwise as the linked list is empty (iterative)")
            return
        }
        var node = singlyLinkedList.head
        while (node?.next != null) {
            val temp = node.next?.data
            node.next?.data = node.data
            node.data = temp ?: 0
            node = node.next?.next
        }
    }

    /**
     * pairwise swap nodes in a linked list recursively
     * cannot swap nodes pairwise if linked list is empty
     */
    fun pairwiseSwapNodesRecursive() {
        if (singlyLinkedList.head == null) {
            println("Cannot swap nodes pairwise as the linked list is empty (recursive)")
            return
        }
        pairwiseSwapRecursive(singlyLinkedList.head)
    }

    /**
     * move last node of a linked list to front
     * cannot move if linked list is empty
     */
    fun moveToFront() {
        if (singlyLinkedList.head == null) {
            println("Cannot move last to front as the linked list is empty")
            return
        }
        var last: Node? = singlyLinkedList.head
        var secLast: Node? = null
        while (last?.next != null) {
            secLast = last
            last = last.next
        }
        secLast?.next = null
        last?.next = singlyLinkedList.head
        singlyLinkedList.head = last
    }

    /**
     * segregate even and odd nodes in a linked list
     * all even nodes will be in the front and all odd nodes after that
     * cannot segregate if the linked list is empty
     */
    fun segregateEvenOdd() {
        if (singlyLinkedList.head == null) {
            println("Cannot segregate even and odd nodes as the linked list is empty")
            return
        }
        var end = singlyLinkedList.head
        while (end?.next != null) {
            end = end.next
        }
        var newEnd: Node? = end
        var previous: Node? = null
        var current: Node? = singlyLinkedList.head
        while (((current?.data?.rem(2)) != 0) && current != end) {
            newEnd?.next = current
            current = current?.next
            newEnd?.next?.next = null
            newEnd = newEnd?.next
        }
        if (current?.data?.rem(2) == 0) {
            singlyLinkedList.head = current
            while (current != end) {
                if (current?.data?.rem(2) == 0) {
                    previous = current
                    current = current.next
                } else {
                    previous?.next = current?.next
                    newEnd?.next = current
                    current = current?.next
                    newEnd?.next?.next = null
                    newEnd = newEnd?.next
                }
            }
        }
        if (newEnd != end && end?.data?.rem(2) != 0) {
            newEnd?.next = end
            newEnd?.next?.next = null
        }
    }

    /**
     * reverse a linked list iteratively
     * cannot reverse the linked list if it is empty
     */
    fun reverseLinkedListIterative() {
        if (singlyLinkedList.head == null) {
            println("Cannot reverse the linked list as it is empty (iterative)")
            return
        }
        var previous: Node? = null
        var next: Node?
        var current = singlyLinkedList.head
        while (current != null) {
            next = current.next
            current.next = previous
            previous = current
            current = next
        }
        singlyLinkedList.head = previous
    }

    /**
     * reverse a linked list recursively
     * cannot reverse the linked list if it is empty
     */
    fun reverseLinkedListRecursive() {
        if (singlyLinkedList.head == null) {
            println("Cannot reverse the linked list as it is empty (recursive)")
            return
        }
        reverseRecursive(singlyLinkedList.head, null)
    }

    /**
     * reverse a linked list using stack
     * cannot reverse the linked list if it is empty
     */
    fun reverseLinkedListStack() {
        if (singlyLinkedList.head == null) {
            println("Cannot reverse the linked list as it is empty (stack)")
            return
        }
        var temp = singlyLinkedList.head
        val stack = Stack<Node>()
        while (temp?.next != null) {
            stack.push(temp)
            temp = temp.next
        }
        singlyLinkedList.head = temp
        while (!stack.isEmpty()) {
            temp?.next = stack.pop()
            temp = temp?.next
        }
        temp?.next = null
    }

    /**
     * delete the entire linked list
     * if linked list is empty then it cannot be deleted
     */
    fun deleteLinkedList() {
        if (singlyLinkedList.head == null) {
            println("Cannot delete the linked list as it is empty")
            return
        }
        singlyLinkedList.head = null
    }

    /**
     * Print the values of the linked list
     */
    fun printSinglyLinkedList() {
        if (singlyLinkedList.head == null) {
            println("Cannot print as Linked List is empty")
            return
        }
        var node: Node? = singlyLinkedList.head
        while (node != null) {
            print("${node.data} ")
            node = node.next
        }
        print("\n")
    }

    private fun removeLoop(node: Node?, reference: Node?) {
        var head = node
        var temp = reference
        if (temp == head) {
            while (temp?.next != head) {
                temp = temp?.next
            }
            temp?.next = null
            return
        }
        while (head?.next != temp?.next) {
            head = head?.next
            temp = temp?.next
        }
        temp?.next = null
    }

    private fun lengthOfLoop(node: Node?) {
        var temp = node
        var length = 1
        while(temp?.next != node) {
            temp = temp?.next
            length++
        }
        println("Length of the loop is: $length")
    }

    private fun searchRecursive(node: Node?, target: Int, position: Int) {
        if (node == null) {
            println("Cannot find $target in the linked list (Recursive)")
            return
        }
        if (node.data == target) {
            println("Found $target at position $position (Recursive)")
            return
        }
        searchRecursive(node.next, target, position+1)
    }

    private fun getNRecursive(node: Node?, position: Int, initialPosition: Int) {
        if (node == null) {
            println("Cannot get node at position $initialPosition as it is out of bounds of linked list (Recursive)")
            return
        }
        if (position == initialPosition) {
            println("Value of node at position $initialPosition is ${node.data} (Recursive)")
            return
        }
        getNRecursive(node.next, position+1, initialPosition)
    }

    private fun getRepeatingRecursive(node: Node?, target: Int, count: Int) {
        var sum = count
        if (node == null) {
            println("Occurrences of $target is: $count (recursive)")
            return
        }
        if (node.data == target) {
            sum++
        }
        getRepeatingRecursive(node.next, target, sum)
    }

    private fun palindromeRecursive(right: Node?): Boolean {
        if (right == null) {
            return  true
        }
        val result = palindromeRecursive(right.next)
        val isEqual = right.data == left?.data
        left = left?.next
        return  (result && isEqual)
    }

    private fun duplicatesRecursive(node: Node?) {
        if (node == null) {
            return
        }
        if (node.next != null) {
            if (node.data == node.next?.data) {
                node.next = node.next?.next
                duplicatesRecursive(node)
            } else {
                duplicatesRecursive(node.next)
            }
        }
    }

    private fun pairwiseSwapRecursive(node: Node?) {
        if (node?.next != null) {
            val temp = node.next?.data
            node.next?.data = node.data
            node.data = temp ?: 0
        }
        pairwiseSwapRecursive(node?.next?.next)
    }

    private fun reverseRecursive(current: Node?, previous: Node?) {
        if (current?.next == null) {
            singlyLinkedList.head = current
            current?.next = previous
            return
        }
        val next = current.next
        current.next = previous
        reverseRecursive(next, current)
    }
}