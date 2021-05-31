package tree.binarytree

import tree.BinaryTree
import tree.Node
import tree.TreeCommon
import java.util.*
import kotlin.collections.HashMap
import kotlin.math.abs

/**
 * Created by ruben.quadros on 29/05/21
 **/
class BinaryTreeOperations: TreeCommon() {

    private var binaryTree = BinaryTree()

    /**
     * @param value
     * insert a new node in binary tree with given value
     */
    fun insertNode(value: Int) {
        val newNode = Node(value)
        if (binaryTree.root == null) {
            binaryTree.root = newNode
            return
        }
        val queue: Queue<Node> = LinkedList()
        queue.add(binaryTree.root)
        while (queue.isNotEmpty()) {
            val temp = queue.remove()
            if (temp.left == null) {
                temp.left = newNode
                return
            } else {
                queue.add(temp.left)
            }
            if(temp.right == null) {
                temp.right = newNode
                return
            } else {
                queue.add(temp.right)
            }
        }
    }

    /**
     * @param value
     * delete a node with given value in binary tree
     * cannot delete node if binary tree is empty
     * cannot delete node if given node is not present in binary tree
     */
    fun deleteNode(value: Int) {
        if (binaryTree.root == null) {
            println("Cannot delete node $value in binary tree as it is empty")
            return
        }
        var delNode: Node? = null
        var temp: Node? = null
        val queue: Queue<Node> = LinkedList()
        queue.add(binaryTree.root)
        while (queue.isNotEmpty()) {
            temp = queue.remove()
            if (temp.data == value) {
                delNode = temp
            }
            if (temp.left != null) {
                queue.add(temp.left)
            }
            if (temp.right != null) {
                queue.add(temp.right)
            }
        }
        if (delNode == null) {
            println("Cannot delete node $value in binary tree as it is not present in given binary tree")
            return
        } else {
            val data = temp!!.data
            deleteLast(binaryTree.root!!, temp)
            delNode.data = data
        }
    }

    /**
     * check if given tree is a continuous tree using recursion
     * cannot check if tree is empty
     * A tree is a Continuous tree if in each binaryTree.root to leaf path,
     * the absolute difference between keys of two adjacent is 1
     */
    fun checkIfContinuousTreeRecursion() {
        if (binaryTree.root == null) {
            println("Cannot check if binary tree is continuous as it is empty")
            return
        }
        if (checkContinuous(binaryTree.root)) {
            println("Given binary tree is a continuous tree")
        } else {
            println("Given binary tree is not a continuous tree")
        }
    }

    /**
     * check if given tree is a continuous tree using BFS
     * cannot check if tree is empty
     * A tree is a Continuous tree if in each binaryTree.root to leaf path,
     * the absolute difference between keys of two adjacent is 1
     */
    fun checkIfContinuousTreeBFS() {
        if (binaryTree.root == null) {
            println("Cannot check if binary tree is continuous as it is empty (BFS)")
            return
        }
        val queue: Queue<Node> = LinkedList()
        queue.add(binaryTree.root)
        while (queue.isNotEmpty()) {
            val temp = queue.remove()
            if (temp.left != null) {
                if (abs(temp.data - temp.left!!.data) == 1) {
                    queue.add(temp.left)
                } else {
                    println("Given binary tree is not a continuous tree (BFS)")
                    return
                }
                if (temp.right != null) {
                    if (abs(temp.data - temp.right!!.data) == 1) {
                        queue.add(temp.right)
                    } else {
                        println("Given binary tree is not a continuous tree (BFS)")
                        return
                    }
                }
            }
        }
        println("Given binary tree is a continuous tree (BFS)")
    }

    fun checkFoldableTreeBFS() {
        if (binaryTree.root == null) {
            println("Cannot check if binary tree is foldable as it is empty (BFS)")
            return
        }
        val queue: Queue<Node?> = LinkedList()
        queue.add(binaryTree.root?.left)
        queue.add(binaryTree.root?.right)
        while (queue.isNotEmpty()) {
            val l = queue.remove()
            val r = queue.remove()
            if ((l == null) && (r == null)) {
                continue
            }
            if (((l == null) && (r != null)) || ((l != null) && (r == null))) {
                println("Given binary tree is not foldable (BFS)")
                return
            }
            queue.add(l?.left)
            queue.add(r?.right)
            queue.add(l?.right)
            queue.add(r?.left)
        }
        println("Given binary tree is foldable")
    }

    /**
     * check if given tree is symmetric
     * i.e mirror image of itself
     * cannot check if tree is empty
     */
    fun checkSymmetricTreeRecursion() {
        if (binaryTree.root == null) {
            println("Cannot check if binary tree is symmetric as it is empty (recursion)")
            return
        }
        if (checkSymmetric(binaryTree.root, binaryTree.root)) {
            println("Given binary tree is symmetric (recursion)")
        } else {
            println("Given binary tree is not symmetric (recursion)")
        }
    }

    /**
     * @param inorder
     * @param preorder
     * print postorder traversal from given inorder and preorder traversal
     * map = inorder{index}, i
     * preorder[0] will always be root of tree
     * inorder{0} to inorder{root} will be left nodes of tree
     * inorder{root+1} to inorder{n} will be right nodes of tree
     */
    fun printPostOrderFromInPreRecursion(inorder: Array<Int>, preorder: Array<Int>) {
        if (inorder.isNullOrEmpty() || preorder.isNullOrEmpty()) {
            println("Given inorder and preorder traversal is incorrect (recursion)")
            return
        }
        val map: HashMap<Int, Int> = HashMap()
        for (i in inorder.indices) {
            map[inorder[i]] = i
        }
        print("Post order from inorder and preorder (recursion): ")
        printPreRecursion(inorder, preorder, 0, inorder.size-1, map)
        print("\n")
    }

    /**
     * perform inorder traversal of given binary tree using recursion
     * cannot perform inorder traversal if binary tree is empty
     */
    fun inorderTraversalRecursion() {
        if (binaryTree.root == null) {
            println("Cannot perform inorder traversal of binary tree as it is empty (recursion)")
            return
        }
        print("Inorder traversal (recursion): ")
        printInorderRecursion(binaryTree.root)
        print("\n")
    }

    /**
     * perform inorder traversal of given binary tree using stack
     * cannot perform inorder traversal if binary tree is empty
     */
    fun inorderTraversalStack() {
        if (binaryTree.root == null) {
            println("Cannot perform inorder traversal of binary tree as it is empty (stack)")
            return
        }
        var temp = binaryTree.root
        val stack: Stack<Node> = Stack()
        print("Inorder traversal (stack): ")
        while (temp != null || stack.isNotEmpty()) {
            while (temp != null) {
                stack.push(temp)
                temp = temp.left
            }
            temp = stack.pop()
            print("${temp.data} ")
            temp = temp.right
        }
        print("\n")
    }

    /**
     * perform inorder traversal of given binary tree without using recursion and stack
     * cannot perform inorder traversal if binary tree is empty
     */
    fun inorderTraversal() {
        if (binaryTree.root == null) {
            println("Cannot perform inorder traversal of binary tree as it is empty")
            return
        }
        print("Inorder traversal: ")
        var temp = binaryTree.root
        var prev: Node?
        while (temp != null) {
            if (temp.left == null) {
                print("${temp.data} ")
                temp = temp.right
            } else {
                prev = temp.left
                while (prev?.right != null && prev.right != temp) {
                    prev = prev.right
                }
                if (prev?.right == null) {
                    prev?.right = temp
                    temp = temp.left
                } else {
                    prev.right = null
                    print("${temp.data} ")
                    temp = temp.right
                }
            }
        }
        print("\n")
    }

    /**
     * perform preorder traversal of given binary tree using recursion
     * cannot perform preorder traversal if binary tree is empty
     */
    fun preorderTraversalRecursion() {
        if (binaryTree.root == null) {
            println("Cannot perform preorder traversal of binary tree as it is empty")
            return
        }
        print("Preorder traversal: ")
        printPreorderRecursion(binaryTree.root)
        print("\n")
    }

    /**
     * perform postorder traversal of given binary tree using recursion
     * cannot perform postorder traversal if binary tree is empty
     */
    fun postorderTraversalRecursion() {
        if (binaryTree.root == null) {
            println("Cannot perform postorder traversal of binary tree as it is empty")
            return
        }
        print("Postorder traversal: ")
        printPostorderRecursion(binaryTree.root)
        print("\n")
    }

    /**
     * perform level order traversal of a given binary tree
     * cannot perform level order traversal if binary tree is empty
     */
    fun levelOrderTraversal() {
        levelOrderTraversalTree(binaryTree.root)
    }

    /**
     * create a binary tree
     */
    fun createBinaryTree() {
        binaryTree.root = Node(1)
        binaryTree.root?.left = Node(2)
        binaryTree.root?.right = Node(3)
        binaryTree.root?.left?.left = Node(4)
        binaryTree.root?.left?.right = Node(5)
    }

    /**
     * create a foldable binary tree
     */
    fun createFoldableTree() {
        binaryTree.root = Node(10)
        binaryTree.root?.left = Node(7)
        binaryTree.root?.right = Node(15)
        binaryTree.root?.left?.right = Node(9)
        binaryTree.root?.right?.left = Node(11)
    }

    /**
     * delete the binary tree
     */
    fun deleteBinaryTree() {
        binaryTree.root = null
    }

    private fun deleteLast(root: Node, delNode: Node) {
        val queue: Queue<Node> = LinkedList()
        queue.add(root)
        while (queue.isNotEmpty()) {
            var temp = queue.remove()
            if (temp == delNode) {
                temp = null
                return
            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null
                    return
                } else {
                    queue.add(temp.right)
                }
            }
            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null
                    return
                } else {
                    queue.add(temp.left)
                }
            }
        }
    }

    private fun printPreorderRecursion(node: Node?) {
        if (node == null) {
            return
        }
        print("${node.data} ")
        printPreorderRecursion(node.left)
        printPreorderRecursion(node.right)
    }

    private fun printPostorderRecursion(node: Node?) {
        if (node == null) {
            return
        }
        printPostorderRecursion(node.left)
        printPostorderRecursion(node.right)
        print("${node.data} ")
    }

    private fun checkContinuous(node: Node?): Boolean {
        if (node == null) {
            return true
        }
        if (node.left == null && node.right == null) {
            return true
        }
        if (node.left == null) {
            return (abs(node.data - node.right!!.data) == 1) && checkContinuous(node.right)
        }
        if (node.right == null) {
            return (abs(node.data - node.left!!.data) == 1) && checkContinuous(node.left)
        }
        return (abs(node.data - node.left!!.data) == 1) && (abs(node.data - node.right!!.data) == 1)
                && checkContinuous(node.left) && checkContinuous(node.right)
    }

    private fun checkSymmetric(node1: Node?, node2: Node?): Boolean {
        if (node1 == null && node2 == null) {
            return true
        }
        if (node1 != null && node2 != null && (node1.data == node2.data)) {
            return (checkSymmetric(node1.left, node2.right) && checkSymmetric(node1.right, node2.left))
        }
        return false
    }

    private var preIndex = 0
    private fun printPreRecursion(inorder: Array<Int>, preorder: Array<Int>,
                                       start: Int, end: Int, map: HashMap<Int, Int>) {
        if (start > end) {
            return
        }
        val inIndex = map[preorder[preIndex++]]
        printPreRecursion(inorder, preorder, start, inIndex!!-1, map)
        printPreRecursion(inorder, preorder, inIndex+1, end, map)
        print("${inorder[inIndex]} ")
    }

}