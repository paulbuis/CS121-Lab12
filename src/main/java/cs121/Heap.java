package cs121;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Heap<T> {
    private final Comparator<T> comparator;
    private final ArrayList<T> array = new ArrayList<>();

    public Heap(Comparator<T> comparator) {
        this.comparator = comparator;
    }



    public boolean add(T item) {
        array.add(item);
        siftUp();
        return true;
    }

    private void siftUp() {
        int index = array.size() - 1;
        while (index != 0) {
            T value = array.get(index);
            int parentIndex = (index-1) / 2;
            T parentValue = array.get(parentIndex);
            if (comparator.compare(value, parentValue) >= 0) {
                return;
            }
            array.set(index, parentValue);
            array.set(parentIndex, value);
            index = parentIndex;
        }
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int size() {
        return array.size();
    }

    public T removeMin() {
        if (isEmpty()) {
            throw new IllegalStateException("attempt to removeMin() from empty heap");
        }
        T resultValue = array.get(0);
        int index = array.size() - 1;
        array.set(0, array.get(index));
        array.remove(index);
        siftDown();
        return resultValue;
    }

    private void siftDown() {
        int index = 0;
        int size = array.size();
        while (2*index+1 < size) {
            T value = array.get(index);
            int leftChildIndex = 2*index+1;
            int rightChildIndex = leftChildIndex + 1;
            int minChildIndex = leftChildIndex;
            T minChildValue = array.get(minChildIndex);

            if (rightChildIndex < size) { // both children exist
                T leftChildValue = array.get(leftChildIndex);
                T rightChildValue = array.get(rightChildIndex);
                if (comparator.compare(rightChildValue, leftChildValue) < 0) {
                    minChildIndex = rightChildIndex;
                    minChildValue = array.get(minChildIndex);
                }
            }
            if (comparator.compare(value, minChildValue) <= 0) {
                break;
            }
            array.set(index, minChildValue);
            array.set(minChildIndex, value);

            index = minChildIndex;
        }
    }




}
