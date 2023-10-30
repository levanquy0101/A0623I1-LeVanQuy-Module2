package _11_dsa_stack_queue.exercise.E3;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularQueue {
    private Node front;
    private Node rear;

    public CircularQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            rear.next = front; // Tạo liên kết vòng
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front; // Cập nhật liên kết vòng
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Hàng đợi trống");
            return -1; // Giá trị mặc định khi hàng đợi trống
        } else {
            int removedData = front.data;
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = front.next;
                rear.next = front; // Cập nhật liên kết vòng
            }
            return removedData;
        }
    }
}

public class QueueCircularLinkedList {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println("Dequeued: " + queue.deQueue());
        System.out.println("Dequeued: " + queue.deQueue());

        queue.enQueue(4);

        System.out.println("Dequeued: " + queue.deQueue());
        System.out.println("Dequeued: " + queue.deQueue());
    }
}
