package org.pi.codewithmosh;

// parent index = index - 1 / 2
// left child index = 2 * index + 1
// right child index = 2 * index + 2
public class Heap {
    private int[] items = new int[10];
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == items.length;
    }

    public void insert(int item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        items[size++] = item;

        bubbleUp();
    }

    public int remove() {
        if(isEmpty()) {
            throw new IllegalStateException();
        }

        int root = items[0];
        items[0] = items[--size];

        bubbleDown();

        return root;
    }

    private void bubbleUp() {
        int index = size - 1;
        while (index > 0 && items[index] > items[parentIndex(index)]) {
            swap(index, parentIndex(index));
            index = parentIndex(index);
        }
    }

    private void bubbleDown() {
        int index = 0;

        while (index <= size && !isValidParent(index)) {
            int largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    private void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    private int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    private int leftChild(int index) {
        return items[leftChildIndex(index)];
    }

    private int rightChild(int index) {
        return items[rightChildIndex(index)];
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) <= size;
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) <= size;
    }

    private boolean isValidParent(int index) {
        if(!hasLeftChild(index)) {
            return true;
        }
        if(!hasRightChild(index)) {
            return items[index] >= leftChild(index);
        }
        return items[index] >= leftChild(index) && items[index] >= rightChild(index);
    }

    private int largerChildIndex(int index) {
        if(!hasLeftChild(index)) {
            return index;
        }
        if(!hasRightChild(index)) {
            return leftChildIndex(index);
        }
        return leftChild(index) > rightChild(index) ? leftChildIndex(index) : rightChildIndex(index);
    }

    public static void heapify(int[] array) {
        // without optimisation
//        for (int i = 0; i < array.length; i++) {
//            heapify(array, i);
//        }

        // with optimisation
//        for (int i = 0; i < array.length / 2 - 1; i++) {
//            heapify(array, i);
//        }

        // with more optimisation
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, i);
        }
    }

    private static void heapify(int[] array, int index) {
        int largerIndex = index;
        int leftIndex = index * 2 + 1;
        if(leftIndex < array.length && array[leftIndex] > array[index]) {
            largerIndex = leftIndex;
        }
        int rightIndex = index * 2 + 2;
        if(rightIndex < array.length && array[rightIndex] > array[index]) {
            largerIndex = rightIndex;
        }
        if(index == largerIndex) return;

        swap(array, index, largerIndex);

        heapify(array, largerIndex);
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int getKthLargest(int[] array, int k) {
        if (k == 0 || k > array.length) throw new IllegalArgumentException();

        Heap h = new Heap();
        for (int value : array) {
            h.insert(value);
        }
        for (int i = 0; i < k - 1; i++) {
            h.remove();
        }
        return h.max();
    }

    public int max() {
        if(isEmpty()) throw new IllegalStateException();
        return items[0];
    }
}
