package queue.implementation

/**
 * Created by ruben.quadros on 24/05/21
 **/
data class PriorityQueueDLL(
        var head: DNode? = null
)

data class DNode(
        var data: Int,
        var priority: Int,
        var next: DNode? = null,
        var previous: DNode? = null
)
