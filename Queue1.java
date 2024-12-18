import java.util.*;

class Queue {
    Node front, rear;

    void enque(int data) {
        Node newNode = new Node(data);
        
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode; 
        }
    }
    
    int dequeue() {
        if (front == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        
        int result = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        
        return result;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.enque(40);
        queue.enque(50);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        try {
            System.out.println("Dequeued: " + queue.dequeue());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}