package linkedlist.doublylinkedlist

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

/**
 * Created by ruben.quadros on 18/05/21
 **/
class DoubleLinkedListOperations {

    private var doublyLinkedList = DoublyLinkedList()

    init {
        print("\n")
        println("=============== DOUBLY LINKED LIST ================")
        println("\n")
    }

    /**
     * @param value
     * insert a node at front of the doubly linked list
     * takes value as input param which is the value of the node to be inserted
     */
    fun insertNodeAtFront(value: Int) {
        if (doublyLinkedList.head == null) {
            doublyLinkedList.head = Node(value)
            return
        }
        val newNode = Node(value)
        newNode.next = doublyLinkedList.head
        doublyLinkedList.head?.previous = newNode
        doublyLinkedList.head = newNode
    }

    /**
     * @param target
     * @param newValue
     * insert a node after a given node
     * cannot insert if doubly linked list is empty
     * cannot insert if given node is not present in doubly linked list
     */
    fun insertNodeAfter(target: Int, newValue: Int) {
        if (doublyLinkedList.head == null) {
            println("Could not insert $newValue after $target as doubly linked list is empty")
            return
        }
        var temp = doublyLinkedList.head
        while (temp != null) {
            if (temp.data == target) {
                val newNode = Node(newValue)
                newNode.previous = temp
                newNode.next = temp.next
                if (temp.next != null) {
                    temp.next?.previous = newNode
                }
                temp.next = newNode
                return
            }
            temp = temp.next
        }
        println("Could not insert $newValue after $target as node with value $target is not present")
    }

    /**
     * @param value
     * insert a node at the end of a doubly linked list
     */
    fun insertNodeAtEnd(value: Int) {
        if (doublyLinkedList.head == null) {
            insertNodeAtFront(value)
            return
        }
        var last = doublyLinkedList.head
        while (last?.next != null) {
            last = last.next
        }
        val newNode = Node(value)
        newNode.previous = last
        last?.next = newNode
    }

    /**
     * @param target
     * @param newValue
     * insert a node before a given node in doubly linked list
     * cannot insert if doubly linked list is empty
     * cannot insert if given node is not present in doubly linked list
     */
    fun insertNodeBefore(target: Int, newValue: Int) {
        if (doublyLinkedList.head == null) {
            println("Could not insert $newValue before $target as doubly linked list is empty")
            return
        }
        var temp = doublyLinkedList.head
        while (temp != null) {
            if (temp.data == target) {
                val newNode = Node(newValue)
                newNode.next = temp
                newNode.previous = temp.previous
                if (temp.previous != null) {
                    temp.previous?.next = newNode
                }
                temp.previous = newNode
                if (temp == doublyLinkedList.head) {
                    doublyLinkedList.head = newNode
                }
                return
            }
            temp = temp.next
        }
        println("Could not insert $newValue before $target as node with value $target is not present")
    }

    /**
     * reverse a doubly linked list using stack
     * cannot reverse if doubly linked list is empty
     * cannot reverse if doubly linked list has only one node
     */
    fun  reverseDoublyLinkedListStack() {
        if (doublyLinkedList.head == null) {
            println("Cannot reverse doubly linked list as it is empty (stack)")
            return
        }
        if (doublyLinkedList.head?.next == null) {
            println("Cannot reverse doubly linked list as it has only one node (stack)")
            return
        }
        val stack = Stack<Int>()
        var temp = doublyLinkedList.head
        while (temp != null) {
            stack.push(temp.data)
            temp = temp.next
        }
        temp = doublyLinkedList.head
        while (!stack.isEmpty()) {
            temp?.data = stack.pop()
            temp = temp?.next
        }
    }

    /**
     * reverse a doubly linked list by swapping each node
     * cannot reverse if doubly linked list is empty
     * cannot reverse if doubly linked list has only one node
     */
    fun reverseDoublyLinkedList() {
        if (doublyLinkedList.head == null) {
            println("Cannot reverse doubly linked list as it is empty (swapping)")
            return
        }
        if (doublyLinkedList.head?.next == null) {
            println("Cannot reverse doubly linked list as it has only one node (swapping)")
            return
        }
        var temp: Node? = null
        var node: Node? = doublyLinkedList.head
        while (node != null) {
            temp = node.previous
            node.previous = node.next
            node.next = temp
            node = node.previous
        }
        if (temp != null) {
            doublyLinkedList.head = temp.previous
        }
    }

    /**
     * @param sum
     * find all the pairs in doubly linked list whose node sum is equal to given sum
     * cannot find pairs if doubly linked list is empty
     * cannot find pairs if doubly linked list has only one node
     */
    fun findPairSorted(sum: Int) {
        if (doublyLinkedList.head == null) {
            println("Cannot find pairs as doubly linked list is empty")
            return
        }
        if (doublyLinkedList.head?.next == null) {
            println("Cannot find pairs as doubly linked list has only one node")
            return
        }
        var last = doublyLinkedList.head
        while (last?.next != null) {
            last = last.next
        }
        val pairs: ArrayList<Pair<Int?, Int?>> = ArrayList()
        var first = doublyLinkedList.head
        while (first != last && last?.next != first) {
            val nodeSum = last?.data?.let { first?.data?.plus(it) }
            when {
                nodeSum == sum -> {
                    pairs.add(Pair(first?.data, last?.data))
                    first = first?.next
                    last = last?.previous
                }
                nodeSum!! > sum -> {
                    last = last?.previous
                }
                nodeSum < sum -> {
                    first = first?.next
                }
            }
        }
        if (pairs.isEmpty()) {
            println("There are no pairs with sum $sum in doubly linked list")
            return
        }
        println("Pairs with sum $sum in doubly linked list: $pairs")
    }

    /**
     * @param value
     * insert a new node in doubly linked list in a sorted way
     */
    fun sortedInsertNode(value: Int) {
        if (doublyLinkedList.head == null) {
            insertNodeAtFront(value)
            return
        }
        var node = doublyLinkedList.head
        if (node!!.data > value) {
            val newNode = Node(value)
            newNode.next = node
            node.previous = newNode
            doublyLinkedList.head = newNode
            return
        }
        while (node?.next != null && node.next!!.data < value) {
            node = node.next
        }
        val newNode = Node(value)
        newNode.next = node?.next
        newNode.previous = node
        if (node?.next != null) {
            node.next?.previous = newNode
        }
        node?.next = newNode
    }

    /**
     * @param sum
     * find all the triplets in doubly linked list whose sum is equal to given sum using hashing
     * cannot find triplets if doubly linked list is empty
     * cannot find triplets if doubly linked list has only 1 node
     * cannot find triplets if doubly linked list has only 2 nodes
     */
    fun findTripletsHash(sum: Int) {
        if (doublyLinkedList.head == null) {
            println("Cannot find triplets as doubly linked list is empty (hashing)")
            return
        }
        if (doublyLinkedList.head?.next == null) {
            println("Cannot find triplets as doubly linked list has only 1 node (hashing)")
            return
        }
        if (doublyLinkedList.head?.next?.next == null) {
            println("Cannot find triplets as doubly linked list has only 2 nodes (hashing)")
            return
        }
        var temp = doublyLinkedList.head
        val nodValueMap = HashMap<Int, Node>()
        while (temp != null) {
            nodValueMap[temp.data] = temp
            temp = temp.next
        }
        val triplets = ArrayList<Triple<Int, Int, Int>>()
        var ptr1 = doublyLinkedList.head
        while (ptr1 != null) {
            var ptr2 = ptr1.next
            while (ptr2 != null) {
                val nodeSum = ptr1.data + ptr2.data
                if (nodValueMap.containsKey(sum-nodeSum) &&
                        nodValueMap[sum-nodeSum] != ptr1 && nodValueMap[sum-nodeSum] != ptr2) {
                            val node = nodValueMap[sum-nodeSum]
                    triplets.add(Triple(ptr1.data, ptr2.data, node!!.data))
                }
                ptr2 = ptr2.next
            }
            ptr1 = ptr1.next
        }
        if (triplets.isEmpty()) {
            println("There were no triplets in doubly linked list with sum $sum (hashing)")
            return
        }
        println("Triplets in doubly linked list with sum $sum (hashing): $triplets")
    }

    /**
     * @param sum
     * find all the triplets in doubly linked list whose sum is equal to given sum using pointers
     * cannot find triplets if doubly linked list is empty
     * cannot find triplets if doubly linked list has only 1 node
     * cannot find triplets if doubly linked list has only 2 nodes
     */
    fun findTripletsPointers(sum: Int) {
        if (doublyLinkedList.head == null) {
            println("Cannot find triplets as doubly linked list is empty (pointers)")
            return
        }
        if (doublyLinkedList.head?.next == null) {
            println("Cannot find triplets as doubly linked list has only 1 node (pointers)")
            return
        }
        if (doublyLinkedList.head?.next?.next == null) {
            println("Cannot find triplets as doubly linked list has only 2 nodes (pointers)")
            return
        }
        var last = doublyLinkedList.head
        while (last?.next != null) {
            last = last.next
        }
        val triplets: ArrayList<Triple<Int, Int, Int>> = ArrayList()
        var current = doublyLinkedList.head
        while (current != null) {
            val next = current.next
            val pairs = findPairs(next, last, sum-current.data)
            if (pairs.first != -1 && pairs.second != -1) {
                triplets.add(Triple(current.data, pairs.first, pairs.second))
            }
            current = current.next
        }
        if (triplets.isEmpty()) {
            println("There were no triplets in doubly linked list with sum $sum (pointers)")
            return
        }
        println("Triplets in doubly linked list with sum $sum (pointers): $triplets")
    }

    /**
     * remove all duplicate nodes in a sorted doubly linked list iteratively
     * cannot remove if doubly linked list is empty
     */
    fun removeDuplicatesSortedIterative() {
        if (doublyLinkedList.head == null) {
            println("Cannot remove duplicates as sorted doubly linked list is empty (iterative)")
            return
        }
        var temp = doublyLinkedList.head
        while (temp?.next != null) {
            if (temp.data == temp.next?.data) {
                val next = temp.next?.next
                temp.next = next
                if (next != null) {
                    next.previous = temp
                }
            } else {
                temp = temp.next
            }
        }
    }

    /**
     * remove all duplicate nodes in a sorted doubly linked list using 2 pointers
     * cannot remove if doubly linked list is empty
     */
    fun removeDuplicatesSortedPointers() {
        if (doublyLinkedList.head == null) {
            println("Cannot remove duplicates as sorted doubly linked list is empty (pointers)")
            return
        }
        var temp = doublyLinkedList.head
        var previous = doublyLinkedList.head
        while (temp != null) {
            if (temp.data != previous?.data) {
                previous?.next = temp
                temp.previous = previous
                previous = temp
            }
            temp = temp.next
        }
        if (previous != temp) {
            previous.next = null
        }
    }

    /**
     * remove all duplicate nodes in an unsorted doubly linked list using hashing
     * cannot remove if doubly linked list is empty
     */
    fun removeDuplicatesUnsorted() {
        if (doublyLinkedList.head == null) {
            println("Cannot remove duplicates as unsorted doubly linked list is empty")
            return
        }
        var temp = doublyLinkedList.head
        val nodeValues: HashSet<Int> = HashSet()
        while (temp != null) {
            if (nodeValues.contains(temp.data)) {
                if (temp.previous != null) {
                    temp.previous?.next = temp.next
                }
                if (temp.next != null) {
                    temp.next?.previous = temp.previous
                }
            } else {
                nodeValues.add(temp.data)
            }
            temp = temp.next
        }
    }

    /**
     * find the length of the doubly linked list
     */
    fun findLength() {
        if (doublyLinkedList.head == null) {
            println("Length of doubly linked list is 0 as it is empty")
            return
        }
        var length = 0
        var temp = doublyLinkedList.head
        while (temp != null) {
            length++
            temp = temp.next
        }
        println("Length of doubly linked list: $length")
    }

    /**
     * @param position
     * rotate a doubly linked list counter clockwise by given position
     * cannot rotate doubly linked list if it is empty
     * cannot rotate doubly linked list if given position is out of bounds
     */
    fun rotateDoublyLinkedList(position: Int) {
        if (doublyLinkedList.head == null) {
            println("Cannot rotate doubly linked list counter clockwise by $position as it is empty")
            return
        }
        if (position <= 0) {
            println("Cannot rotate doubly linked list counter clockwise by $position as it is out of bounds")
            return
        }
        var temp = doublyLinkedList.head
        for (i in 1 until position) {
            if (temp == null) {
                println("Cannot rotate doubly linked list counter clockwise by $position as it is out of bounds")
                return
            }
            temp = temp.next
        }
        if (temp == null) {
            println("Cannot rotate doubly linked list counter clockwise by $position as it is out of bounds")
            return
        }
        var last = doublyLinkedList.head
        while (last?.next != null) {
            last = last.next
        }
        val head = doublyLinkedList.head
        head?.previous = last
        last?.next = head
        temp.next?.previous = null
        doublyLinkedList.head = temp.next
        temp.next = null
    }

    /**
     * @param group
     * reverse a doubly linked list in given groups
     * cannot reverse if doubly linked list is empty
     * cannot reverse if doubly linked list has only one node
     */
    fun reverseInGroups(group: Int) {
        if (doublyLinkedList.head == null) {
            println("Cannot reverse doubly linked list in groups of $group as it is empty")
            return
        }
        if (doublyLinkedList.head?.next == null) {
            println("Cannot reverse doubly linked list in groups as it has only 1 node")
            return
        }
        if (group <= 1) {
            println("Nothing to reverse doubly linked list in groups of $group")
            return
        }
        var node = doublyLinkedList.head
        var first = doublyLinkedList.head
        var last = doublyLinkedList.head
        while (node != null) {
            var count = 1
            if (first != last) {
                first = last?.next
                last = first
            }
            for (i in 1 until group) {
                if (last?.next == null) {
                    reverse(first, count)
                    return
                }
                count++
                last = last.next
            }
            node = last?.next
            reverse(first, count)
        }
    }

    /**
     * @param target
     * delete all nodes of a given value
     * cannot delete nodes if doubly linked list is empty
     */
    fun deleteAllNodesOfKey(target: Int) {
        if (doublyLinkedList.head == null) {
            println("Cannot delete nodes with value $target as doubly linked list is empty")
            return
        }
        if (doublyLinkedList.head?.data == target && doublyLinkedList.head?.next == null) {
            deleteDoublyLinkedList()
            return
        }
        var temp = doublyLinkedList.head
        while (temp != null) {
            if (temp.data == target ) {
                if (temp == doublyLinkedList.head) {
                    doublyLinkedList.head = temp.next
                }
                if (temp.previous != null) {
                    temp.previous?.next = temp.next
                }
                if (temp.next != null) {
                    temp.next?.previous = temp.previous
                }
            }
            temp = temp.next
        }
    }

    /**
     * @param position
     * delete a node at given position in doubly linked list
     * cannot delete the node if doubly linked list is empty
     * cannot delete the node if given position is out of bounds of doubly linked list
     */
    fun deleteNodeAtPosition(position: Int) {
        if (doublyLinkedList.head == null) {
            println("Cannot delete node at position $position as doubly linked list is empty")
            return
        }
        if (position <= 0) {
            println("Cannot delete the node as given position $position as it is out of bounds of doubly linked list")
            return
        }
        var temp = doublyLinkedList.head
        for (i in 1 until position) {
            if (temp == null) {
                println("Cannot delete the node as given position $position as it is out of bounds of doubly linked list")
                return
            }
            temp = temp.next
        }
        if (temp == doublyLinkedList.head && temp?.next == null) {
            doublyLinkedList.head = null
            return
        }
        if (temp == doublyLinkedList.head) {
            temp?.next?.previous = null
            doublyLinkedList.head = temp?.next
            return
        }
        if (temp?.previous != null) {
            temp.previous?.next = temp.next
        }
        if (temp?.next != null) {
            temp.next?.previous = temp.previous
        }
    }

    /**
     * @param target
     * delete a given node in doubly linked list
     * cannot delete if doubly linked list is empty
     * cannot delete if given node is not present in doubly linked list
     */
    fun deleteNode(target: Int) {
        if (doublyLinkedList.head == null) {
            println("Cannot delete node $target as doubly linked list is empty")
            return
        }
        var temp = doublyLinkedList.head
        while (temp != null) {
            if (temp.data == target) {
                if (temp == doublyLinkedList.head) {
                    doublyLinkedList.head = temp.next
                }
                if (temp.next != null) {
                    temp.next?.previous = temp.previous
                }
                if (temp.previous != null) {
                    temp.previous?.next = temp.next
                }
                return
            }
            temp = temp.next
        }
        println("Cannot delete node $target as it is not present in doubly linked list")
    }

    /**
     * delete a doubly linked list
     * cannot delete if the doubly linked list is empty
     */
    fun deleteDoublyLinkedList() {
        if (doublyLinkedList.head == null) {
            println("Cannot delete doubly linked list as it is empty")
            return
        }
        doublyLinkedList.head = null
    }

    /**
     * print a doubly linked list in both the directions
     * cannot print if the doubly linked list is empty
     */
    fun printDoublyLinkedList() {
        if (doublyLinkedList.head == null) {
            println("Cannot print as doubly linked list is empty")
            return
        }
        var last: Node? = null
        var temp: Node? = doublyLinkedList.head
        print("Forward direction: ")
        while (temp != null) {
            print("${temp.data} ")
            last = temp
            temp = temp.next
        }
        print("\nBackward direction: ")
        while (last != null) {
            print("${last.data} ")
            last = last.previous
        }
        print("\n")
    }

    private fun findPairs(first: Node?, second: Node?, sum: Int): Pair<Int, Int> {
        var ptr1: Node? = first
        var ptr2: Node? = second
        while (ptr1 != null && ptr2 != null && ptr1 != ptr2 && ptr2.next != ptr1) {
            val nodeSum = ptr1.data + ptr2.data
            if (nodeSum == sum) {
                return Pair(ptr1.data, ptr2.data)
            }
            if (nodeSum > sum) {
                ptr2 = ptr2.previous
            }
            if (nodeSum < sum) {
                ptr1 = ptr1.next
            }
        }
        return Pair(-1, -1)
    }

    private fun reverse(first: Node?, len: Int) {
        val nodeStack: Stack<Int> = Stack()
        var start = first
        for (i in 0 until len) {
            nodeStack.push(start?.data)
            start = start?.next
        }
        start = first
        while (!nodeStack.isEmpty()) {
            start?.data = nodeStack.pop()
            start = start?.next
        }
    }
}