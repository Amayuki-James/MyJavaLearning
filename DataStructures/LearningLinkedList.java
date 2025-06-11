package DataStructures;

public class LearningLinkedList {
    public static void main(String[] args) {
        // LinkedList is a data structure that consists of nodes, where each node contains data and a reference to the next node.
        // It allows for efficient insertion and deletion of elements.
        
        // Example usage of LinkedList in Java
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        
        // Adding elements to the LinkedList
        linkedList.add("Node 1");
        linkedList.add("Node 2");
        linkedList.add("Node 3");
        
        // Displaying the LinkedList
        System.out.println("Linked List: " + linkedList);
        
        // Accessing elements by index
        String firstElement = linkedList.get(0);
        System.out.println("First Element: " + firstElement);
        
        // Removing an element
        linkedList.remove("Node 2");
        System.out.println("After removing Node 2: " + linkedList);
        
        // Iterating through the LinkedList
        System.out.println("Iterating through Linked List:");
        for (String node : linkedList) {
            System.out.println(node);
        }
    }
    
}
