import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
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
