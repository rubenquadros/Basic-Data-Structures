package tree.binarysearchtree

/**
 * Created by ruben.quadros on 30/05/21
 **/
class DriverOfBinarySearchTree {

    init {
        print("\n")
        println("=============== BINARY SEARCH TREE (BST) ==================")
        println("\n")

        val binarySearchTreeOperations = BinarySearchTreeOperations()

        //insert a node in a binary search tree using recursion
        binarySearchTreeOperations.inorderTraversal()
        binarySearchTreeOperations.insertRecursion(8)
        binarySearchTreeOperations.insertRecursion(3)
        binarySearchTreeOperations.insertRecursion(10)
        binarySearchTreeOperations.insertRecursion(1)
        binarySearchTreeOperations.insertRecursion(6)
        binarySearchTreeOperations.insertRecursion(14)
        binarySearchTreeOperations.insertRecursion(4)
        binarySearchTreeOperations.insertRecursion(7)
        binarySearchTreeOperations.insertRecursion(13)
        binarySearchTreeOperations.inorderTraversal()

        //insert a node in a binary search tree iteratively
        binarySearchTreeOperations.deleteBinarySearchTree()
        binarySearchTreeOperations.inorderTraversal()
        binarySearchTreeOperations.insertIterative(8)
        binarySearchTreeOperations.insertIterative(3)
        binarySearchTreeOperations.insertIterative(10)
        binarySearchTreeOperations.insertIterative(1)
        binarySearchTreeOperations.insertIterative(6)
        binarySearchTreeOperations.insertIterative(14)
        binarySearchTreeOperations.insertIterative(4)
        binarySearchTreeOperations.insertIterative(7)
        binarySearchTreeOperations.insertIterative(13)
        binarySearchTreeOperations.inorderTraversal()

        //search a node in binary search tree
        binarySearchTreeOperations.deleteBinarySearchTree()
        binarySearchTreeOperations.searchNodeRecursion(3)
        binarySearchTreeOperations.insertRecursion(8)
        binarySearchTreeOperations.insertRecursion(3)
        binarySearchTreeOperations.insertRecursion(10)
        binarySearchTreeOperations.insertRecursion(1)
        binarySearchTreeOperations.insertRecursion(6)
        binarySearchTreeOperations.insertRecursion(14)
        binarySearchTreeOperations.insertRecursion(4)
        binarySearchTreeOperations.insertRecursion(7)
        binarySearchTreeOperations.insertRecursion(13)
        binarySearchTreeOperations.inorderTraversal()
        binarySearchTreeOperations.searchNodeRecursion(20)
        binarySearchTreeOperations.searchNodeRecursion(7)

        //search a node in binary search tree in iterative way
        binarySearchTreeOperations.inorderTraversal()
        binarySearchTreeOperations.searchNodeIterative(30)
        binarySearchTreeOperations.searchNodeIterative(13)

        //delete a node in binary tree
        binarySearchTreeOperations.deleteBinarySearchTree()
        binarySearchTreeOperations.deleteNodeRecursion(2)
        binarySearchTreeOperations.insertRecursion(50)
        binarySearchTreeOperations.insertRecursion(30)
        binarySearchTreeOperations.insertRecursion(70)
        binarySearchTreeOperations.insertRecursion(40)
        binarySearchTreeOperations.insertRecursion(20)
        binarySearchTreeOperations.insertRecursion(80)
        binarySearchTreeOperations.insertRecursion(60)
        binarySearchTreeOperations.inorderTraversal()
        binarySearchTreeOperations.deleteNodeRecursion(10)
        binarySearchTreeOperations.deleteNodeRecursion(20)
        binarySearchTreeOperations.deleteNodeRecursion(30)
        binarySearchTreeOperations.deleteNodeRecursion(50)
        binarySearchTreeOperations.inorderTraversal()

        //
        binarySearchTreeOperations.printPostFromPre(arrayOf(40, 30, 35, 80, 100))
    }
}