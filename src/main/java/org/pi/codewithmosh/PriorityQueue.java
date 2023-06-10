package org.pi.codewithmosh;

public class PriorityQueue {
    Heap heap = new Heap();

    public void enqueue(int item) {
        heap.insert(item);
    }

    public int dequeue() {
        return heap.remove();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
