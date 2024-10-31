# LinkedList Java Implementation

A simple implementation of a singly linked list in Java. This project provides basic operations to manipulate a linked list, including adding, removing, searching, and reversing elements. The list holds integers, with each element represented by a `Node` class.

## Features

- **Add Elements**: Add items to the start or end of the list.
- **Remove Elements**: Remove items from the start or end of the list.
- **Search**: Find the index of an item or check for its existence.
- **Conversion to Array**: Convert the list to an array for easy access and manipulation.
- **Reverse List**: Reverse the order of elements in the list.

## Class Structure

### `LinkedList`

This is the main class that manages the linked list and provides methods to manipulate it.

#### Fields

- `first`: Points to the first node in the list.
- `last`: Points to the last node in the list.
- `size`: Tracks the number of elements in the list.

#### Inner Class

- **Node**: Represents each element in the list, containing a value and a reference to the next node.

### Methods

- **addFirst(int item)**: Adds a new node with the specified value to the beginning of the list.
- **addLast(int item)**: Adds a new node with the specified value to the end of the list.
- **removeFirst()**: Removes the first node in the list. Throws `NoSuchElementException` if the list is empty.
- **removeLast()**: Removes the last node in the list. Throws `NoSuchElementException` if the list is empty.
- **contains(int item)**: Returns `true` if the list contains the specified value, otherwise `false`.
- **indexOf(int item)**: Returns the index of the specified value in the list, or `-1` if not found.
- **size()**: Returns the current size of the list.
- **toArray()**: Converts the list to an integer array.
- **reverse()**: Reverses the order of the nodes in the list.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK 8 or later installed.

### Compilation and Execution

1. **Compile** the `LinkedList` class:

   ```bash
   javac LinkedList.java
   ```

2. **Run Tests or Examples** (optional): Create a test or main class to interact with `LinkedList`.

## Usage Example

Here's a simple example showing how to use the `LinkedList` class:

```java
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);

        System.out.println("List contains 20: " + list.contains(20)); // true
        System.out.println("Index of 10: " + list.indexOf(10)); // 1

        list.removeFirst();
        list.removeLast();
        
        System.out.println("Size of list: " + list.size()); // 1

        list.addLast(30);
        list.reverse();

        int[] array = list.toArray();
        for (int num : array)
            System.out.print(num + " "); // Outputs the reversed list
    }
}
```

## Error Handling

- Throws `NoSuchElementException` if attempting to remove from an empty list in `removeFirst()` or `removeLast()` methods.

## License

This project is licensed under the MIT License. See `LICENSE` for details.