import linkedlist.circularlinkedlist.DriverOfCircularLinkedList
import linkedlist.doublylinkedlist.DriverOfDoublyLinkedList
import linkedlist.singlylinkedlist.DriverOfSinglyLinkedList
import queue.DriverOfQueue
import sorting.DriverOfSorting
import stack.DriverOfStack
import tree.binarysearchtree.DriverOfBinarySearchTree
import tree.binarytree.DriverOfBinaryTree

/**
 * Created by ruben.quadros on 15/05/21
 **/
class MainClass {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //All Sorting algorithms
            DriverOfSorting()

            //All operations on a singly linked list
            DriverOfSinglyLinkedList()

            //All operations on a circular linked list
            DriverOfCircularLinkedList()

            //All operations on a doubly linked list
            DriverOfDoublyLinkedList()

            //All operations on a stack
            DriverOfStack()

            //All operations on a queue
            DriverOfQueue()

            //All operations on a binary tree
            DriverOfBinaryTree()

            //All operations on a binary search tree (BST)
            DriverOfBinarySearchTree()
        }
    }
}