package tree

/**
 * Created by ruben.quadros on 29/05/21
 **/
data class BinaryTree(
        var root: Node? = null
)

data class Node(
        var data: Int,
        var left: Node? = null,
        var right: Node? = null
)
