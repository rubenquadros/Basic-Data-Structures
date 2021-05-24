package queue.implementation

/**
 * Created by ruben.quadros on 24/05/21
 **/
data class PriorityQueueLL(
        var head: SNode? = null
)

data class SNode (
        var data: Int,
        var priority: Int,
        var next: SNode? = null
)
