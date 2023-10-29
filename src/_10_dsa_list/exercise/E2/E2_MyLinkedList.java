package _10_dsa_list.exercise.E2;

public class E2_MyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public E2_MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            Node<E> curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next.prev = newNode;
            curr.next = newNode;
            newNode.prev = curr;
        }
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        if (curr == head) {
            head = head.next;
        } else {
            curr.prev.next = curr.next;
        }
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
        if (curr == tail) {
            tail = tail.prev;
        }
        size--;
        return curr.data;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public int indexOf(E element) {
        Node<E> curr = head;
        int index = 0;
        while (curr != null) {
            if (curr.data.equals(element)) {
                return index;
            }
            index++;
            curr = curr.next;
        }
        return -1;
    }

    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {

        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data) {
            this.data = data;
        }

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while (curr != null) {
            sb.append(curr.data).append("\n");
            curr = curr.next;
        }
        return sb.toString();
    }

}