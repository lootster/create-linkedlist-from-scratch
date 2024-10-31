import java.util.NoSuchElementException;

public class LinkedList {

    // Nested class to represent a node in the linked list
    private class Node {
        private int value; // Holds the value of the node
        private Node next; // Pointer to the next node in the list

        // Constructor to initialize node with a value
        public Node(int value) {
            this.value = value;
        }
    }

    private Node first; // Reference to the first node in the list
    private Node last;  // Reference to the last node in the list
    private int size;   // Number of elements in the list

    // Adds an item to the beginning of the list
    public void addFirst(int item) {
        var node = new Node(item); // Create a new node with the given item

        // If list is empty, set both first and last to the new node
        if (isEmpty())
            first = last = node;
        else {
            // Link the new node to the current first node and update first
            node.next = first;
            first = node;
        }

        size++; // Increment the size of the list
    }

    // Adds an item to the end of the list
    public void addLast(int item) {
        var node = new Node(item); // Create a new node with the given item

        // If list is empty, set both first and last to the new node
        if (isEmpty())
            first = last = node;
        else {
            // Link the current last node to the new node and update last
            last.next = node;
            last = node;
        }

        size++; // Increment the size of the list
    }

    // Checks if the list is empty
    private boolean isEmpty() {
        return first == null; // If first is null, list is empty
    }

    // Returns the index of the first occurrence of the item in the list, or -1 if not found
    public int indexOf(int item) {
        int index = 0;         // Initialize index counter
        var current = first;   // Start from the first node

        while (current != null) {  // Traverse the list
            if (current.value == item) // Check if current node's value matches the item
                return index;          // Item found, return its index
            current = current.next;    // Move to the next node
            index++;
        }

        return -1; // Item not found, return -1
    }

    // Returns true if the item exists in the list, false otherwise
    public boolean contains(int item) {
        return indexOf(item) != -1; // Call indexOf; if -1, item is absent
    }

    // Removes the first item in the list
    public void removeFirst() {
        if (isEmpty()) // If list is empty, throw exception
            throw new NoSuchElementException();

        // If list has only one item, set both first and last to null
        if (first == last)
            first = last = null;
        else {
            // Otherwise, advance first to the second node and unlink the original first node
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--; // Decrement the size of the list
    }

    // Removes the last item in the list
    public void removeLast() {
        if (isEmpty()) // If list is empty, throw exception
            throw new NoSuchElementException();

        // If list has only one item, set both first and last to null
        if (first == last)
            first = last = null;
        else {
            // Otherwise, traverse to the node before last
            var current = first;
            while (current != null) {
                if (current.next == last) break; // Stop at the node before last
                current = current.next;
            }
            last = current;        // Update last to the current node
            current.next = null;    // Unlink the old last node
        }

        size--; // Decrement the size of the list
    }

    // Returns the size of the list (number of nodes)
    public int size() {
        return size;
    }

    // Converts the list to an array of integers
    public int[] toArray() {
        int[] array = new int[size]; // Initialize array with list size
        var current = first;         // Start from the first node
        int index = 0;

        // Traverse the list and populate array with node values
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array; // Return the populated array
    }

    // Reverses the order of nodes in the list
    public void reverse() {
        if (isEmpty()) return; // If list is empty, do nothing

        var previous = first;   // Initialize previous to the first node
        var current = first.next; // Initialize current to the second node

        // Traverse through the list, reversing links between nodes
        while (current != null) {
            var next = current.next; // Temporarily store the next node
            current.next = previous; // Reverse the link
            previous = current;      // Move previous and current one step forward
            current = next;
        }

        last = first;        // Update last to the original first node
        last.next = null;    // Set the new last node's next to null
        first = previous;    // Update first to the original last node
    }
}