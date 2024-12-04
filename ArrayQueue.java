public class ArrayQueue {
    private int front;
    private int rear;
    private int[] queue;
    private int capacity;

    // Constructor to initialize the queue
    public ArrayQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = -1;                                                                                                                                              
        rear = -1;                                                                                                                 
    }                                                                         

    // Method to add an element to the queue                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    public void enqueue(int element) {                                                                                                                                                                     
        if (rear == capacity - 1) {
            System.out.println("Queue is full. Cannot enqueue " + element);
        } else {
            if (front == -1) { // If queue is initially empty
                front = 0;
            }
            queue[++rear] = element;
            System.out.println("Enqueued: " + element);
        }
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int dequeuedElement = queue[front];
            if (front >= rear) { // Queue becomes empty after this dequeue
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Dequeued: " + dequeuedElement);
            return dequeuedElement;
        }
    }

    // Method to get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No elements to peek.");
            return -1;
        } else {
            return queue[front];
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Method to display the elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the queue operations
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Peeked element: " + queue.peek());
        queue.dequeue();
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
