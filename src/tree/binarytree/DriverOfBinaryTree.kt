package tree.binarytree

/**
 * Created by ruben.quadros on 29/05/21
 **/
class DriverOfBinaryTree {

    init {
        print("\n")
        println("=============== BINARY TREE ================")
        println("\n")

        val binaryTreeOperations = BinaryTreeOperations()

        //perform inorder traversal of binary tree using recursion
        binaryTreeOperations.inorderTraversalRecursion()
        binaryTreeOperations.createBinaryTree()
        binaryTreeOperations.inorderTraversalRecursion()

        //perform inorder traversal of binary tree using stack
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.inorderTraversalStack()
        binaryTreeOperations.createBinaryTree()
        binaryTreeOperations.inorderTraversalStack()

        //perform inorder traversal of binary tree without using recursion and stack
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.inorderTraversal()
        binaryTreeOperations.createBinaryTree()
        binaryTreeOperations.inorderTraversal()

        //perform preorder traversal of binary tree using recursion
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.preorderTraversalRecursion()
        binaryTreeOperations.createBinaryTree()
        binaryTreeOperations.preorderTraversalRecursion()

        //perform postorder traversal of binary tree using recursion
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.postorderTraversalRecursion()
        binaryTreeOperations.createBinaryTree()
        binaryTreeOperations.postorderTraversalRecursion()

        //perform level order traversal of binary tree
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.levelOrderTraversal()
        binaryTreeOperations.createBinaryTree()
        binaryTreeOperations.levelOrderTraversal()

        //insert a node in binary tree
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.insertNode(1)
        binaryTreeOperations.insertNode(2)
        binaryTreeOperations.insertNode(3)
        binaryTreeOperations.insertNode(4)
        binaryTreeOperations.insertNode(5)
        binaryTreeOperations.inorderTraversalRecursion()

        //delete a node in binary tree
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.deleteNode(10)
        binaryTreeOperations.createBinaryTree()
        binaryTreeOperations.levelOrderTraversal()
        binaryTreeOperations.deleteNode(8)
        binaryTreeOperations.deleteNode(2)
        binaryTreeOperations.levelOrderTraversal()

        //check if given binary tree is continuous
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.checkIfContinuousTreeRecursion()
        binaryTreeOperations.createBinaryTree()
        /*
                 1
                / \             //This is not a continuous tree
               2   3
              / \
             4   5
         */
        binaryTreeOperations.levelOrderTraversal()
        binaryTreeOperations.checkIfContinuousTreeRecursion()
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.insertNode(3)
        binaryTreeOperations.insertNode(2)
        binaryTreeOperations.insertNode(4)
        binaryTreeOperations.insertNode(1)
        binaryTreeOperations.insertNode(3)
        binaryTreeOperations.insertNode(5)
        /*
                 3
                / \             //This is a continuous tree
               2   4
              / \   \
             1   3   5
         */
        binaryTreeOperations.levelOrderTraversal()
        binaryTreeOperations.checkIfContinuousTreeRecursion()

        //check if given binary tree is continuous using BFS
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.checkIfContinuousTreeBFS()
        binaryTreeOperations.createBinaryTree()
        binaryTreeOperations.checkIfContinuousTreeBFS()
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.insertNode(3)
        binaryTreeOperations.insertNode(2)
        binaryTreeOperations.insertNode(4)
        binaryTreeOperations.insertNode(1)
        binaryTreeOperations.insertNode(3)
        binaryTreeOperations.insertNode(5)
        binaryTreeOperations.levelOrderTraversal()
        binaryTreeOperations.checkIfContinuousTreeBFS()

        //check if given binary tree is foldable
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.checkFoldableTreeBFS()
        binaryTreeOperations.createBinaryTree()
        binaryTreeOperations.levelOrderTraversal()
        binaryTreeOperations.checkFoldableTreeBFS()
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.createFoldableTree()
        binaryTreeOperations.levelOrderTraversal()
        binaryTreeOperations.checkFoldableTreeBFS()

        //check if given binary tree is symmetric (mirror image)
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.checkSymmetricTreeRecursion()
        binaryTreeOperations.createBinaryTree()
        binaryTreeOperations.levelOrderTraversal()
        binaryTreeOperations.checkSymmetricTreeRecursion()
        binaryTreeOperations.deleteBinaryTree()
        binaryTreeOperations.insertNode(1)
        binaryTreeOperations.insertNode(2)
        binaryTreeOperations.insertNode(2)
        binaryTreeOperations.insertNode(3)
        binaryTreeOperations.insertNode(4)
        binaryTreeOperations.insertNode(4)
        binaryTreeOperations.insertNode(3)
        binaryTreeOperations.levelOrderTraversal()
        binaryTreeOperations.checkSymmetricTreeRecursion()

        //print post order traversal from given inorder and preorder traversals using recursion
        binaryTreeOperations.printPostOrderFromInPreRecursion(
                arrayOf(4, 2, 5, 1, 3, 6),
                arrayOf(1, 2, 4, 5, 3, 6)
        )
    }
}