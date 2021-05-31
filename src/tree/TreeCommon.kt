package tree

import java.util.*

/**
 * Created by ruben.quadros on 30/05/21
 **/
abstract class TreeCommon {

    fun levelOrderTraversalTree(root: Node?) {
        if (root == null) {
            println("Cannot perform level order traversal of binary search tree as it is empty")
            return
        }
        print("Level order traversal: ")
        val queue: Queue<Node> = LinkedList()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val temp = queue.remove()
            print("${temp.data} ")
            if (temp.left != null) {
                queue.add(temp.left)
            }
            if (temp.right != null) {
                queue.add(temp.right)
            }
        }
        print("\n")
    }

    fun printInorderRecursion(node: Node?) {
        if (node == null) {
            return
        }
        printInorderRecursion(node.left)
        print("${node.data} ")
        printInorderRecursion(node.right)
    }
}