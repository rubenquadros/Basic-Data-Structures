package queue

import queue.implementation.*

/**
 * Created by ruben.quadros on 23/05/21
 **/
class DriverOfQueue {
    init {

        print("\n")
        println("=============== QUEUE ================")
        println("\n")

        val queueOperations = QueueOperations()

        //operations on queue implemented using array
        val queueArray = QueueArray()

        queueArray.getFront()
        queueArray.getRear()
        queueArray.dequeue()
        println("Is queue empty (array): ${queueArray.isEmpty()}")
        println("Is queue full (array): ${queueArray.isFull()}")
        queueArray.printQueue()

        queueArray.enqueue(1)
        queueArray.enqueue(2)
        queueArray.enqueue(3)
        queueArray.enqueue(4)
        queueArray.enqueue(5)
        queueArray.enqueue(6)

        queueArray.printQueue()
        println("Is queue empty (array): ${queueArray.isEmpty()}")
        println("Is queue full (array): ${queueArray.isFull()}")
        println("First element in queue is (array): ${queueArray.getFront()}")
        println("Last element in queue is (array): ${queueArray.getRear()}")
        queueArray.dequeue()
        queueArray.dequeue()
        queueArray.printQueue()

        //operations on queue implemented using linked list
        val queueLinkedList = QueueLinkedList()

        queueLinkedList.getFront()
        queueLinkedList.getRear()
        queueLinkedList.dequeue()
        println("Is queue empty (linked list): ${queueLinkedList.isEmpty()}")
        queueLinkedList.printQueue()

        queueLinkedList.enqueue(1)
        queueLinkedList.enqueue(2)
        queueLinkedList.enqueue(3)
        queueLinkedList.enqueue(4)
        queueLinkedList.enqueue(5)
        queueLinkedList.enqueue(6)

        queueLinkedList.printQueue()
        println("Is queue empty (linked list): ${queueLinkedList.isEmpty()}")
        println("First element in queue is (linked list): ${queueLinkedList.getFront()}")
        println("Last element in queue is (linked list): ${queueLinkedList.getRear()}")
        queueLinkedList.dequeue()
        queueLinkedList.dequeue()
        queueLinkedList.printQueue()

        //operations on queue implemented using stack (enqueue heavy)
        val queueStackEnq = QueueStackEnq()

        queueStackEnq.getFront()
        queueStackEnq.dequeue()
        println("Is queue empty (stack enq): ${queueStackEnq.isEmpty()}")
        queueStackEnq.printQueue()

        queueStackEnq.enqueue(6)
        queueStackEnq.enqueue(7)
        queueStackEnq.enqueue(8)
        queueStackEnq.enqueue(9)
        queueStackEnq.enqueue(10)

        queueStackEnq.printQueue()
        println("Is queue empty (stack enq): ${queueStackEnq.isEmpty()}")
        println("First element in queue is (stack enq): ${queueStackEnq.getFront()}")
        queueStackEnq.dequeue()
        queueStackEnq.dequeue()
        queueStackEnq.printQueue()

        //operations on queue implemented using stack (dequeue heavy)
        val queueStackDq = QueueStackDq()

        queueStackDq.getFront()
        queueStackDq.dequeue()
        println("Is queue empty (stack enq): ${queueStackDq.isEmpty()}")
        queueStackDq.printQueue()

        queueStackDq.enqueue(16)
        queueStackDq.enqueue(17)
        queueStackDq.enqueue(18)
        queueStackDq.enqueue(19)
        queueStackDq.enqueue(20)

        queueStackDq.printQueue()
        println("Is queue empty (stack enq): ${queueStackDq.isEmpty()}")
        queueStackDq.dequeue()
        queueStackDq.dequeue()
        println("First element in queue is (stack enq): ${queueStackDq.getFront()}")
        queueStackDq.printQueue()

        //operations on queue implemented using double ended queue (dequeue)
        val queueDequeue = QueueDequeue()

        queueDequeue.getFront()
        queueDequeue.getRear()
        queueDequeue.dequeue()
        println("Is queue empty (dequeue): ${queueDequeue.isEmpty()}")
        queueDequeue.printQueue()

        queueDequeue.enqueue(1)
        queueDequeue.enqueue(2)
        queueDequeue.enqueue(3)
        queueDequeue.enqueue(4)
        queueDequeue.enqueue(5)
        queueDequeue.enqueue(6)

        queueDequeue.printQueue()
        println("Is queue empty (dequeue): ${queueDequeue.isEmpty()}")
        println("First element in queue is (dequeue): ${queueDequeue.getFront()}")
        println("Last element in queue is (dequeue): ${queueDequeue.getRear()}")
        queueDequeue.dequeue()
        queueDequeue.dequeue()
        queueDequeue.printQueue()
        println("First element in queue is (dequeue): ${queueDequeue.getFront()}")
        println("Last element in queue is (dequeue): ${queueDequeue.getRear()}")

        //operations on dequeue (Double ended queue) implemented using circular array
        val dequeueArray = DequeueArray()

        dequeueArray.printDequeue()
        dequeueArray.deleteFront()
        dequeueArray.deleteRear()
        dequeueArray.getFront()
        dequeueArray.getRear()
        println("Is dequeue empty (array): ${dequeueArray.isEmpty()}")
        println("Is dequeue full (array): ${dequeueArray.isFull()}")

        dequeueArray.insertAtFront(6)
        dequeueArray.insertAtRear(5)
        dequeueArray.insertAtFront(10)
        dequeueArray.insertAtFront(20)
        dequeueArray.insertAtRear(1)
        dequeueArray.insertAtRear(30)
        dequeueArray.insertAtFront(40)

        dequeueArray.printDequeue()
        println("Element at front in dequeue (array): ${dequeueArray.getFront()}")
        println("Element at rear in dequeue (array): ${dequeueArray.getRear()}")
        println("Is dequeue empty (array): ${dequeueArray.isEmpty()}")
        println("Is dequeue full (array): ${dequeueArray.isFull()}")

        dequeueArray.deleteRear()
        dequeueArray.deleteFront()
        dequeueArray.deleteFront()

        dequeueArray.printDequeue()
        println("Element at front in dequeue (array): ${dequeueArray.getFront()}")
        println("Element at rear in dequeue (array): ${dequeueArray.getRear()}")

        //operations on dequeue (Double ended queue) implemented using doubly linked list (DLL)
        val dequeueLinkedList = DequeueLinkedList()

        dequeueLinkedList.printDequeue()
        dequeueLinkedList.deleteFront()
        dequeueLinkedList.deleteRear()
        dequeueLinkedList.getFront()
        dequeueLinkedList.getRear()
        println("Is dequeue empty (DLL): ${dequeueLinkedList.isEmpty()}")

        dequeueLinkedList.insertAtRear(35)
        dequeueLinkedList.insertAtRear(50)
        dequeueLinkedList.insertAtFront(20)
        dequeueLinkedList.insertAtFront(10)
        dequeueLinkedList.insertAtRear(45)
        dequeueLinkedList.insertAtRear(40)
        dequeueLinkedList.insertAtFront(15)

        dequeueLinkedList.printDequeue()

        println("Element at front in dequeue (DLL): ${dequeueLinkedList.getFront()}")
        println("Element at rear in dequeue (DLL): ${dequeueLinkedList.getRear()}")
        println("Is dequeue empty (DLL): ${dequeueLinkedList.isEmpty()}")

        dequeueLinkedList.deleteRear()
        dequeueLinkedList.deleteFront()
        dequeueLinkedList.deleteFront()
        dequeueLinkedList.deleteRear()

        dequeueLinkedList.printDequeue()
        println("Element at front in dequeue (DLL): ${dequeueLinkedList.getFront()}")
        println("Element at rear in dequeue (DLL): ${dequeueLinkedList.getRear()}")

        //operations on circular queue implemented using array
        val circularQueueArray = CircularQueueArray()

        circularQueueArray.printQueue()
        circularQueueArray.dequeue()
        circularQueueArray.getFront()
        circularQueueArray.getRear()
        println("Is circular queue empty (array): ${circularQueueArray.isEmpty()}")
        println("Is circular queue full (array): ${circularQueueArray.isFull()}")

        circularQueueArray.enqueue(1)
        circularQueueArray.enqueue(2)
        circularQueueArray.enqueue(3)
        circularQueueArray.enqueue(4)
        circularQueueArray.enqueue(5)
        circularQueueArray.enqueue(6)

        circularQueueArray.printQueue()

        println("Element at front in circular queue (array): ${circularQueueArray.getFront()}")
        println("Element at rear in circular queue (array): ${circularQueueArray.getRear()}")
        println("Is circular queue empty (array): ${circularQueueArray.isEmpty()}")
        println("Is circular queue full (array): ${circularQueueArray.isFull()}")

        circularQueueArray.dequeue()
        circularQueueArray.dequeue()
        circularQueueArray.enqueue(6)

        circularQueueArray.printQueue()
        println("Element at front in circular queue (array): ${circularQueueArray.getFront()}")
        println("Element at rear in circular queue (array): ${circularQueueArray.getRear()}")

        //operations on circular queue implemented using circular linked list (CLL)
        val circularQueueLinkedList = CircularQueueLinkedList()

        circularQueueLinkedList.printQueue()
        circularQueueLinkedList.dequeue()
        circularQueueLinkedList.getFront()
        circularQueueLinkedList.getRear()
        println("Is circular queue empty (CLL): ${circularQueueLinkedList.isEmpty()}")

        circularQueueLinkedList.enqueue(21)
        circularQueueLinkedList.enqueue(22)
        circularQueueLinkedList.enqueue(23)
        circularQueueLinkedList.enqueue(24)
        circularQueueLinkedList.enqueue(25)
        circularQueueLinkedList.enqueue(26)

        circularQueueLinkedList.printQueue()

        println("Element at front in circular queue (CLL): ${circularQueueLinkedList.getFront()}")
        println("Element at rear in circular queue (CLL): ${circularQueueLinkedList.getRear()}")
        println("Is circular queue empty (CLL): ${circularQueueLinkedList.isEmpty()}")

        circularQueueLinkedList.dequeue()
        circularQueueLinkedList.dequeue()
        circularQueueLinkedList.enqueue(30)
        circularQueueLinkedList.dequeue()

        circularQueueLinkedList.printQueue()
        println("Element at front in circular queue (CLL): ${circularQueueLinkedList.getFront()}")
        println("Element at rear in circular queue (CLL): ${circularQueueLinkedList.getRear()}")

        //operations on priority queue implemented using singly linked list (SLL)
        val priorityQueueLinkedList = PriorityQueueLinkedList()

        priorityQueueLinkedList.printPriorityQueue()
        priorityQueueLinkedList.getHighestPriority()
        priorityQueueLinkedList.deleteHighestPriority()
        println("Is priority queue empty (SLL): ${priorityQueueLinkedList.isEmpty()}")
        
        priorityQueueLinkedList.insert(40, 15)
        priorityQueueLinkedList.insert(42, 18)
        priorityQueueLinkedList.insert(35, 12)
        priorityQueueLinkedList.insert(38, 20)
        priorityQueueLinkedList.insert(36, 8)
        
        priorityQueueLinkedList.printPriorityQueue()
        println("Is priority queue empty (SLL): ${priorityQueueLinkedList.isEmpty()}")
        println("Highest priority in the queue is: ${priorityQueueLinkedList.getHighestPriority()}")
        priorityQueueLinkedList.deleteHighestPriority()
        priorityQueueLinkedList.deleteHighestPriority()
        priorityQueueLinkedList.printPriorityQueue()
        println("Highest priority in the queue is: ${priorityQueueLinkedList.getHighestPriority()}")

        //operations on priority queue implemented using doubly linked list (DLL)
        val priorityQueueDoublyLinkedList = PriorityQueueDoublyLinkedList()

        priorityQueueDoublyLinkedList.printPriorityQueue()
        priorityQueueDoublyLinkedList.getHighestPriority()
        priorityQueueDoublyLinkedList.deleteHighestPriority()
        println("Is priority queue empty (DLL): ${priorityQueueDoublyLinkedList.isEmpty()}")

        priorityQueueDoublyLinkedList.insert(60, 10)
        priorityQueueDoublyLinkedList.insert(62, 2)
        priorityQueueDoublyLinkedList.insert(61, 7)
        priorityQueueDoublyLinkedList.insert(65, 1)
        priorityQueueDoublyLinkedList.insert(66, 9)

        priorityQueueDoublyLinkedList.printPriorityQueue()
        println("Is priority queue empty (DLL): ${priorityQueueDoublyLinkedList.isEmpty()}")
        println("Highest priority in the queue is: ${priorityQueueDoublyLinkedList.getHighestPriority()}")
        priorityQueueDoublyLinkedList.deleteHighestPriority()
        priorityQueueDoublyLinkedList.deleteHighestPriority()
        priorityQueueDoublyLinkedList.printPriorityQueue()
        println("Highest priority in the queue is: ${priorityQueueDoublyLinkedList.getHighestPriority()}")

        //reverse a queue
        queueOperations.printQueue()
        queueOperations.reverseQueueStack()

        queueOperations.enqueue(15)
        queueOperations.enqueue(16)
        queueOperations.enqueue(17)
        queueOperations.enqueue(18)
        queueOperations.enqueue(19)
        queueOperations.enqueue(20)

        queueOperations.printQueue()
        queueOperations.reverseQueueStack()
        queueOperations.printQueue()
        queueOperations.reverseQueueRecursion()
        queueOperations.printQueue()

        //reverse first k elements of a queue
        queueOperations.deleteQueue()
        queueOperations.reverseFirstK(2)

        queueOperations.enqueue(1)
        queueOperations.enqueue(2)
        queueOperations.enqueue(3)
        queueOperations.enqueue(4)
        queueOperations.enqueue(5)
        queueOperations.enqueue(6)

        queueOperations.printQueue()
        queueOperations.reverseFirstK(-2)
        queueOperations.reverseFirstK(10)
        queueOperations.reverseFirstK(2)
        queueOperations.printQueue()

        //interleave first half with second half of queue
        queueOperations.deleteQueue()
        queueOperations.interleaveQueue()

        queueOperations.enqueue(11)
        queueOperations.enqueue(12)
        queueOperations.enqueue(13)
        queueOperations.enqueue(14)
        queueOperations.enqueue(15)
        queueOperations.enqueue(16)
        queueOperations.enqueue(17)
        queueOperations.enqueue(18)
        queueOperations.enqueue(19)
        queueOperations.enqueue(20)

        queueOperations.printQueue()
        queueOperations.interleaveQueue()
        queueOperations.printQueue()

        //sort elements in queue
        queueOperations.deleteQueue()
        queueOperations.sortQueue()

        queueOperations.enqueue(11)
        queueOperations.enqueue(5)
        queueOperations.enqueue(4)
        queueOperations.enqueue(21)

        queueOperations.printQueue()
        queueOperations.sortQueue()
        queueOperations.printQueue()
    }
}