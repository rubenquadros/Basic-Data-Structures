package stack

import stack.implementation.*

/**
 * Created by ruben.quadros on 21/05/21
 **/
class DriverOfStack {
    init {

        print("\n")
        println("=============== STACK ================")
        println("\n")

        val stackOperations = StackOperations()

        //operations on stack implemented using array
        val stackArray = StackArray()

        stackArray.printStack()
        stackArray.peek()
        stackArray.pop()
        println("Is stack empty (array): ${stackArray.isEmpty()}")

        stackArray.push(1)
        stackArray.push(2)
        stackArray.push(3)
        stackArray.push(4)
        stackArray.push(5)
        stackArray.push(6)

        stackArray.printStack()

        println("Is stack empty (array): ${stackArray.isEmpty()}")
        println("The top element in stack is (array): ${stackArray.peek()}")
        stackArray.pop()
        stackArray.pop()

        stackArray.printStack()

        //operations on stack implemented using linked list
        val stackLinkedList = StackLinkedList()

        stackLinkedList.printStack()
        stackLinkedList.peek()
        stackLinkedList.pop()
        println("Is stack empty (linked list): ${stackLinkedList.isEmpty()}")

        stackLinkedList.push(1)
        stackLinkedList.push(2)
        stackLinkedList.push(3)
        stackLinkedList.push(4)
        stackLinkedList.push(5)
        stackLinkedList.push(6)

        stackLinkedList.printStack()

        println("Is stack empty (linked list): ${stackLinkedList.isEmpty()}")
        println("The top element in stack is (linked list): ${stackLinkedList.peek()}")
        stackLinkedList.pop()
        stackLinkedList.pop()

        stackLinkedList.printStack()

        //operations on stack implemented using queue (push heavy)
        val stackQueuePush = StackQueuePush()

        stackQueuePush.printStack()
        stackQueuePush.peek()
        stackQueuePush.pop()
        println("Is stack empty (queue push): ${stackQueuePush.isEmpty()}")

        stackQueuePush.push(1)
        stackQueuePush.push(2)
        stackQueuePush.push(3)
        stackQueuePush.push(4)
        stackQueuePush.push(5)
        stackQueuePush.push(6)

        stackQueuePush.printStack()

        println("Is stack empty (queue push): ${stackQueuePush.isEmpty()}")
        stackQueuePush.pop()
        stackQueuePush.pop()
        println("The top element in stack is (queue push): ${stackQueuePush.peek()}")

        stackQueuePush.printStack()

        //operations on stack implemented using queue (pop heavy)
        val stackQueuePop = StackQueuePop()

        stackQueuePop.printStack()
        stackQueuePop.peek()
        stackQueuePop.pop()
        println("Is stack empty (queue pop): ${stackQueuePop.isEmpty()}")

        stackQueuePop.push(1)
        stackQueuePop.push(2)
        stackQueuePop.push(3)
        stackQueuePop.push(4)
        stackQueuePop.push(5)
        stackQueuePop.push(6)

        stackQueuePop.printStack()

        println("Is stack empty (queue push): ${stackQueuePop.isEmpty()}")
        stackQueuePop.pop()
        stackQueuePop.pop()

        stackQueuePop.printStack()

        //operations on stack implemented using single queue
        val stackQueue = StackQueue()

        stackQueue.printStack()
        stackQueue.peek()
        stackQueue.pop()
        println("Is stack empty (single queue): ${stackQueue.isEmpty()}")

        stackQueue.push(1)
        stackQueue.push(2)
        stackQueue.push(3)
        stackQueue.push(4)
        stackQueue.push(5)
        stackQueue.push(6)

        stackQueue.printStack()

        println("Is stack empty (single queue): ${stackQueue.isEmpty()}")
        stackQueue.pop()
        stackQueue.pop()
        println("The top element in stack is (single queue): ${stackQueue.peek()}")

        //operations on stack implemented using double ended queue (dequeue)
        val stackDequeue = StackDequeue()

        stackDequeue.printStack()
        stackDequeue.peek()
        stackDequeue.pop()
        println("Is stack empty (dequeue): ${stackDequeue.isEmpty()}")

        stackDequeue.push(1)
        stackDequeue.push(2)
        stackDequeue.push(3)
        stackDequeue.push(4)
        stackDequeue.push(5)
        stackDequeue.push(6)

        stackDequeue.printStack()

        println("Is stack empty (dequeue): ${stackDequeue.isEmpty()}")
        println("The top element in stack is (dequeue): ${stackDequeue.peek()}")
        stackDequeue.pop()
        stackDequeue.pop()
        stackDequeue.printStack()
        println("The top element in stack is (dequeue): ${stackDequeue.peek()}")

        //operations on special stack
        val specialStack = SpecialStack()

        specialStack.printStack()
        specialStack.peek()
        specialStack.pop()
        specialStack.getMinimum()
        println("Is special stack empty: ${specialStack.isEmpty()}")

        specialStack.push(18)
        specialStack.push(19)
        specialStack.push(29)
        specialStack.push(15)
        specialStack.push(16)

        specialStack.printStack()

        println("Is special stack empty: ${specialStack.isEmpty()}")
        println("Minimum value in special stack: ${specialStack.getMinimum()}")

        specialStack.pop()
        specialStack.pop()
        specialStack.printStack()

        println("Minimum value in special stack: ${specialStack.getMinimum()}")

        //operations on optimized special stack with dummy value
        val specialStack2 = SpecialStack2()

        specialStack2.printStack()
        specialStack2.peek()
        specialStack2.pop()
        specialStack2.getMinimum()
        println("Is optimized special stack empty: ${specialStack2.isEmpty()}")

        specialStack2.push(18)
        specialStack2.push(19)
        specialStack2.push(29)
        specialStack2.push(15)
        specialStack2.push(16)

        specialStack2.printStack()

        println("Is optimized special stack empty: ${specialStack2.isEmpty()}")
        println("Minimum value in optimized special stack: ${specialStack2.getMinimum()}")

        specialStack2.pop()
        specialStack2.pop()
        specialStack2.printStack()

        println("Minimum value in optimized special stack: ${specialStack2.getMinimum()}")

        //operations on optimized special stack
        val specialStack3 = SpecialStack3()

        specialStack3.printStack()
        specialStack3.peek()
        specialStack3.pop()
        specialStack3.getMinimum()
        println("Is optimized special stack empty: ${specialStack3.isEmpty()}")

        specialStack3.push(18)
        specialStack3.push(19)
        specialStack3.push(29)
        specialStack3.push(15)
        specialStack3.push(16)

        specialStack3.printStack()

        println("Is optimized special stack empty: ${specialStack3.isEmpty()}")
        println("Minimum value in optimized special stack: ${specialStack3.getMinimum()}")

        specialStack3.pop()
        specialStack3.pop()
        specialStack3.printStack()

        println("Minimum value in optimized special stack: ${specialStack3.getMinimum()}")

        //operations on a mid stack
        val midStack = MidStack()

        midStack.printStack()
        midStack.peek()
        midStack.pop()
        midStack.getMiddle()
        midStack.deleteMiddle()
        println("Is mid stack empty: ${midStack.isEmpty()}")

        midStack.push(1)
        midStack.push(2)
        midStack.push(3)
        midStack.push(4)

        midStack.printStack()

        println("Is mid stack empty: ${midStack.isEmpty()}")
        println("Top element in mid stack is: ${midStack.peek()}")
        println("Middle element is: ${midStack.getMiddle()}")
        midStack.deleteMiddle()
        midStack.printStack()
        println("Middle element is: ${midStack.getMiddle()}")
        midStack.pop()
        midStack.printStack()
        println("Middle element is: ${midStack.getMiddle()}")

        //reverse a stack using recursion
        stackOperations.push(1)
        stackOperations.push(2)
        stackOperations.push(3)
        stackOperations.push(4)

        stackOperations.printStack()
        stackOperations.reverseStack()
        stackOperations.printStack()

        //sort a stack using recursion
        stackOperations.deleteStack()
        stackOperations.push(30)
        stackOperations.push(-5)
        stackOperations.push(18)
        stackOperations.push(14)
        stackOperations.push(-3)

        stackOperations.printStack()
        stackOperations.sortStackRecursion()
        stackOperations.printStack()

        //sort a stack using temporary stack
        stackOperations.deleteStack()
        stackOperations.push(34)
        stackOperations.push(3)
        stackOperations.push(31)
        stackOperations.push(98)
        stackOperations.push(92)
        stackOperations.push(23)

        stackOperations.printStack()
        stackOperations.sortStack()
        stackOperations.printSortedStack()

        //reverse stack in O(1) space (using linked list)
        stackLinkedList.deleteStack()
        stackLinkedList.push(4)
        stackLinkedList.push(3)
        stackLinkedList.push(2)
        stackLinkedList.push(1)

        stackLinkedList.printStack()
        stackLinkedList.reverse()
        stackLinkedList.printStack()

        //sort an array using stack
        stackOperations.deleteStack()
        stackOperations.sortArray(arrayOf(8, 5, 7, 1, 9, 12, 10))

        //delete K elements smaller than next
        stackOperations.deleteStack()
        stackOperations.deleteArrayElements(arrayOf(23, 45, 11, 77, 18), 3)

        //reverse each word in a string
        stackOperations.reverseStringLetters("Hello World")
    }
}