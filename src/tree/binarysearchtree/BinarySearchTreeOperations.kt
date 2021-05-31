package tree.binarysearchtree

import tree.BinaryTree
import tree.Node
import tree.TreeCommon

/**
 * Created by ruben.quadros on 30/05/21
 **/
class BinarySearchTreeOperations: TreeCommon() {

    private val binarySearchTree = BinaryTree()

    /**
     * @param value
     * insert the given value in the binary search tree using recursion
     */
    fun insertRecursion(value: Int) {
        if (binarySearchTree.root == null) {
            binarySearchTree.root = Node(value)
            return
        }
        insertRecursion(binarySearchTree.root, value)
    }

    /**
     * @param value
     * insert the given value in the binary search tree in iterative way
     */
    fun insertIterative(value: Int) {
        val newNode = Node(value)
        if (binarySearchTree.root == null) {
            binarySearchTree.root = newNode
            return
        }
        var temp: Node? = binarySearchTree.root
        var prev: Node? = null
        while (temp != null) {
            if (value < temp.data) {
                prev = temp
                temp = temp.left
            } else if (value > temp.data) {
                prev = temp
                temp = temp.right
            }
        }
        if (value > prev!!.data) {
            prev.right = newNode
        } else {
            prev.left = newNode
        }
    }

    /**
     * @param target
     * search given value in binary search tree using recursion
     * cannot search if binary search tree is empty
     */
    fun searchNodeRecursion(target: Int) {
        if (binarySearchTree.root == null) {
            println("Cannot search $target as binary search tree is empty (Recursion)")
            return
        }
        searchRecursion(binarySearchTree.root, target)
    }

    /**
     * @param target
     * search given value in binary search tree in iterative way
     * cannot search if binary search tree is empty
     */
    fun searchNodeIterative(target: Int) {
        if (binarySearchTree.root == null) {
            println("Cannot search $target as binary search tree is empty (Iterative)")
            return
        }
        var temp = binarySearchTree.root
        while (temp != null) {
            if (temp.data == target) {
                println("Found $target in binary search tree (Iterative)")
                return
            }
            temp = if (target < temp.data) {
                temp.left
            } else {
                temp.right
            }
        }
        println("Cannot find $target as it is not present in binary search tree (Iterative)")
    }

    /**
     * delete a given node in binary search tree
     * cannot delete if binary search tree is empty
     */
    fun deleteNodeRecursion(target: Int) {
        if (binarySearchTree.root == null) {
            println("Cannot delete $target as binary search tree is empty")
            return
        }
        deleteRecursion(binarySearchTree.root, target)

    }

    /**
     * @param preorder
     * print postorder traversal from given preorder traversal
     * preorder{0} will always be root node
     * pivot = when preorder{i} > preorder{0}
     * preorder{pivot-1} to preorder{1} will be first half of postorder
     * preorder{length-1} to preorder{pivot} will be second half of postorder
     * preorder{0} will be last (root)
     */
    fun printPostFromPre(preorder: Array<Int>) {
        if (preorder.isNullOrEmpty()) {
            println("Given preorder is incorrect")
            return
        }
        val root = preorder[0]
        var pivot = -1
        for (i in 1 until preorder.size) {
            if (root <= preorder[i]) {
                pivot = i
                break
            }
        }
        print("Post order from preorder of BST: ")
        for (j in pivot-1 downTo 1) {
            print("${preorder[j]} ")
        }
        for (k in preorder.size-1 downTo pivot) {
            print("${preorder[k]} ")
        }
        print(root)
        print("\n")
    }

    /**
     * perform level order traversal of given binary search tree
     */
    fun levelOrderTraversal() {
        levelOrderTraversalTree(binarySearchTree.root)
    }

    /**
     * perform inorder traversal of given binary search tree
     * inorder traversal of a binary search tree always produces sorted output
     */
    fun inorderTraversal() {
        if (binarySearchTree.root == null) {
            println("Cannot perform inorder traversal of binary search tree as it is empty")
            return
        }
        printInorderRecursion(binarySearchTree.root)
        print("\n")
    }

    /**
     * delete a given binary search tree
     */
    fun deleteBinarySearchTree() {
        binarySearchTree.root = null
    }

    private fun insertRecursion(node: Node?, key: Int): Node {
        var temp = node
        if (temp == null) {
            temp = Node(key)
            return temp
        }
        if (key < node!!.data) {
            temp.left = insertRecursion(temp.left, key)
        }
        if (key > node.data) {
            temp.right = insertRecursion(temp.right, key)
        }
        return node
    }

    private fun searchRecursion(node: Node?, target: Int) {
        if (node == null) {
            println("Cannot find $target as it is not present in binary search tree (Recursion)")
            return
        }
        if (node.data == target) {
            println("Found $target in binary search tree (Recursion)")
            return
        }
        if (node.data < target) {
            searchRecursion(node.right, target)
        } else {
            searchRecursion(node.left, target)
        }
    }

    private fun deleteRecursion(node: Node?, target: Int): Node? {
        if (node == null) {
            println("Given node $target is not present in binary search tree")
            return node
        }
        if (target < node.data) {
            node.left = deleteRecursion(node.left, target)
        } else if (target > node.data) {
            node.right = deleteRecursion(node.right, target)
        } else {
            if (node.left == null) {
                return node.right
            } else if (node.right == null) {
                return node.left
            }
            node.data = getInorderSuccessor(node.right)
            node.right = deleteRecursion(node.right, node.data)
        }
        return node
    }

    private fun getInorderSuccessor(node: Node?): Int {
        var temp = node
        var minValue = -1
        while (temp?.left != null) {
            minValue = temp.left!!.data
            temp = temp.left
        }
        return minValue
    }

}