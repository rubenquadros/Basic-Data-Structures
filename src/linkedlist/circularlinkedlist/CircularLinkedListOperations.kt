package linkedlist.circularlinkedlist

/**
 * Created by ruben.quadros on 17/05/21
 **/
class CircularLinkedListOperations {

    private var circularLinkedList = CircularLinkedList()

    init {
        print("\n")
        println("=============== CIRCULAR LINKED LIST ================")
        println("\n")
    }

    /**
     * @param value
     * insert a node at the front of the circular linked list
     */
    fun insertNodeAtFront(value: Int) {
        if (circularLinkedList.head == null) {
            val newNode = Node(value)
            newNode.next = newNode
            circularLinkedList.head = newNode
            return
        }
        val newNode = Node(value)
        var end = circularLinkedList.head
        while (end?.next != circularLinkedList.head) {
            end = end?.next
        }
        end?.next = newNode
        newNode.next = circularLinkedList.head
        circularLinkedList.head = newNode
    }

    /**
     * @param value
     * insert a node at the end of the circular linked list
     */
    fun insertNodeAtEnd(value: Int) {
        if (circularLinkedList.head == null) {
            insertNodeAtFront(value)
            return
        }
        var end = circularLinkedList.head
        while (end?.next != circularLinkedList.head) {
            end = end?.next
        }
        val newNode = Node(value)
        end?.next = newNode
        newNode.next = circularLinkedList.head
    }

    /**
     * @param target
     * @param value
     * insert a node after node with value @param target
     * cannot insert the node if circular linked list is empty
     */
    fun insertNodeAfter(target: Int, value: Int) {
        if (circularLinkedList.head == null) {
            println("Cannot add $value after $target as circular linked list is empty")
            return
        }
        var temp = circularLinkedList.head
        do {
            if(temp?.data == target) {
                val newNode = Node(value)
                newNode.next = temp.next
                temp.next = newNode
                return
            }
            temp = temp?.next
        } while (temp != circularLinkedList.head)
        println("Cannot add $value after $target as $target is not present in the linked list")
    }

    /**
     * split a circular linked list into 2 separate circular linked lists
     * cannot split if the circular linked list is empty
     * cannot split if the circular linked list has only 1 node
     */
    fun splitCircularLinkedList() {
        if (circularLinkedList.head == null) {
            println("Cannot split circular linked list as it is empty")
            return
        }
        if (circularLinkedList.head?.next == circularLinkedList.head) {
            println("Cannot split circular linked list as it has only 1 node")
            return
        }
        var slowPointer = circularLinkedList.head
        var fastPointer = circularLinkedList.head
        while (fastPointer?.next != circularLinkedList.head &&
                fastPointer?.next?.next != circularLinkedList.head) {
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next?.next
        }
        if (fastPointer?.next?.next == circularLinkedList.head) {
            fastPointer = fastPointer?.next
        }
        val head1 = circularLinkedList.head
        val head2 = slowPointer?.next
        slowPointer?.next = head1
        fastPointer?.next = head2
        print("First half of circular linked list: ")
        var node1 = head1
        do {
            print("${node1?.data} ")
            node1 = node1?.next
        } while (node1 != head1)
        print("\nSecond half of circular linked list: ")
        var node2 = head2
        do {
            print("${node2?.data} ")
            node2 = node2?.next
        } while (node2 != head2)
        print("\n")
    }

    /**
     * @param value
     * insert a new node at a sorted position in the circular linked list
     * if linked list is empty then a new node is added
     * if value of new node is <= value of head then new node is added at head
     */
    fun sortedInsert(value: Int) {
        if (circularLinkedList.head == null) {
            insertNodeAtFront(value)
            return
        }
        if (circularLinkedList.head!!.data >= value) {
            var end = circularLinkedList.head
            while (end?.next != circularLinkedList.head) {
                end = end?.next
            }
            val newNode = Node(value)
            end?.next = newNode
            newNode.next = circularLinkedList.head
            circularLinkedList.head = newNode
            return
        }
        var temp = circularLinkedList.head
        while (temp?.next != circularLinkedList.head && temp?.next!!.data < value) {
            temp = temp.next
        }
        val newNode = Node(value)
        newNode.next = temp?.next
        temp?.next = newNode
    }

    /**
     * check if given linked list is circular
     */
    fun isLinkedListCircular() {
        if (circularLinkedList.head == null) {
            println("Linked list is empty")
            return
        }
        var node = circularLinkedList.head?.next
        while (node != null && node != circularLinkedList.head) {
            node = node.next
        }
        if (node == circularLinkedList.head) {
            println("Given linked list is circular")
        } else {
            println("Given linked list is not circular")
        }
    }

    /**
     * get the length of a circular linked list
     */
    fun getLength() {
        if (circularLinkedList.head == null) {
            println("Length of circular linked list is 0 as it is empty")
            return
        }
        var length = 0
        var temp = circularLinkedList.head
        do {
            length++
            temp = temp?.next
        } while (temp != circularLinkedList.head)
        println("Length of circular linked list is: $length")
    }

    /**
     * find the safest position in Josephus Circle
     */
    fun josephusCircle(length: Int, position: Int) {
        val node = Node(1)
        circularLinkedList.head = node
        var previous: Node? = node
        for (i in 2..length) {
            val newNode = Node(i)
            previous?.next = newNode
            previous = newNode
        }
        previous?.next = circularLinkedList.head
        printCircularLinkedList()
        var temp = circularLinkedList.head
        while (temp?.next != circularLinkedList.head) {
            var count = 1
            while (count != position) {
                previous = temp
                temp = temp?.next
                count++
            }
            previous?.next = temp?.next
            temp = previous?.next
        }
        println("Josephus positions is: ${temp?.data}")
    }

    /**
     * convert a given singly linked list to circular linked list
     * cannot convert if linked list is empty
     */
    fun convertSinglyToCircular() {
        if (circularLinkedList.head == null) {
            println("Cannot convert singly linked list to circular as it is empty")
            return
        }
        var temp = circularLinkedList.head
        while (temp?.next != null) {
            temp = temp.next
        }
        temp?.next = circularLinkedList.head
    }

    /**
     * swap the first and last nodes of a circular linked list
     * cannot swap if circular linked list is empty
     * cannot swap if circular linked list has only one node
     */
    fun swapFirstAndLastNodes() {
        if (circularLinkedList.head == null) {
            println("Cannot swap first and last nodes as circular linked list is empty")
            return
        }
        if (circularLinkedList.head?.next == circularLinkedList.head) {
            println("Nothing to swap as there is only one node in circular linked list")
            return
        }
        //if length is 2
        if (circularLinkedList.head?.next?.next == circularLinkedList.head) {
            circularLinkedList.head = circularLinkedList.head?.next
            return
        }
        val head: Node? = circularLinkedList.head
        var last: Node? = circularLinkedList.head
        var secLast: Node? = null
        while (last?.next != head) {
            secLast = last
            last = last?.next
        }
        last?.next = head?.next
        secLast?.next = head
        head?.next = last
        circularLinkedList.head = last
    }

    /**
     * swap the values of first and last nodes of a circular linked list
     * cannot swap if circular linked list is empty
     * cannot swap if circular linked list has only one node
     */
    fun swapFirstAndLastValues() {
        if (circularLinkedList.head == null) {
            println("Cannot swap first and last node values as circular linked list is empty")
            return
        }
        if (circularLinkedList.head?.next == circularLinkedList.head) {
            println("Cannot swap as circular linked list has only one node")
            return
        }
        val head = circularLinkedList.head
        var last = circularLinkedList.head
        while (last?.next != circularLinkedList.head) {
            last = last?.next
        }
        val temp = head?.data
        head?.data = last?.data ?: -1
        last?.data = temp ?: -1
    }

    /**
     * @param target
     * delete a given node from the circular linked list
     * if circular linked list is empty then cannot delete the node
     * if given node is not present in the circular linked list then cannot delete the node
     */
    fun deleteNode(target: Int) {
        if (circularLinkedList.head == null) {
            println("Cannot delete node $target as circular linked list is empty")
            return
        }
        var current: Node? = circularLinkedList.head
        var previous: Node? = null
        while (current?.data != target) {
            if (current?.next == circularLinkedList.head) {
                println("Cannot delete node $target as it is not present")
                return
            }
            previous = current
            current = current?.next
        }
        //if only 1 node
        if (current == circularLinkedList.head && current.next == circularLinkedList.head) {
            deleteCircularLinkedList()
            return
        }
        //head node
        if (current == circularLinkedList.head) {
            var end = circularLinkedList.head
            while (end?.next != circularLinkedList.head) {
                end = end?.next
            }
            end?.next = current.next
            circularLinkedList.head = current.next
            return
        }
        //last node
        if (current.next == circularLinkedList.head) {
            previous?.next = circularLinkedList.head
            return
        }
        //somewhere in between circular linked list
        previous?.next = current.next

    }

    /**
     * create a singly linked list
     */
    fun createSinglyLinkedList() {
        val node = Node(1)
        node.next = Node(2)
        node.next?.next = Node(3)
        node.next?.next?.next = Node(4)
        circularLinkedList.head = node
        var temp = circularLinkedList.head
        while (temp != null) {
            print("${temp.data} ")
            temp = temp.next
        }
        print("\n")
    }

    /**
     * delete a circular linked list
     */
    fun deleteCircularLinkedList() {
        if (circularLinkedList.head == null) {
            println("Cannot delete the circular linked list as it is empty")
            return
        }
        circularLinkedList.head = null
    }

    /**
     * print the values of the circular linked list
     */
    fun printCircularLinkedList() {
        if (circularLinkedList.head == null) {
            println("Cannot print the circular linked list as it is empty")
            return
        }
        var temp = circularLinkedList.head
        do {
            print("${temp?.data} ")
            temp = temp?.next
        } while (temp != circularLinkedList.head)
        print("\n")
    }
}