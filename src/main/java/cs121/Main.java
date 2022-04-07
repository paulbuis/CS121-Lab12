package cs121;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static Comparator<String> comp = Comparator.naturalOrder();
    //public static Comparator<String> comp = String.CASE_INSENSITIVE_ORDER;
    //public static Comparator<String> comp = new DictionaryOrder();

    public static boolean outOfOrder(List<String> list, int index) {
        var a = list.get(index);
        var b = list.get(index);
        return comp.compare(a, b)>0;
    }

    public static boolean isSorted(List<String> list) {
        for (int i=0; i<list.size()-1; i++) {
            if (outOfOrder(list, i)) {
                return false;
            }
        }
        return true;
    }

    public static void printSlice(List<String> list, int min, int max) {
        if (list.size() < max) {
            System.err.printf("printing list items %d to %d for list of size %d\n",
                min, max, list.size());
            return;
        }
        System.out.println("==========================");
        for (int i=min; i<max; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        DictionaryList array = new DictionaryList();
        System.out.printf("array.size()=%,d\n", array.size());
        System.out.println("Original List");
        printSlice(array, 100, 110);


        Heap<String> heap = new Heap<>(comp);

        // replace this comment with a loop that takes
        // all of the words from array and
        // adds them to heap

        System.out.printf("heap.size()=%,d\n", heap.size());

        List<String> sorted = new ArrayList<>();

        // replace this comment with a loop that repeatedly calls
        // heap.removeMin() and adds result to sorted until
        // the heap is empty.

        System.out.printf("sorted.size()=%,d\n", sorted.size());
        System.out.println("Sorted List");
        printSlice(sorted, 100, 110);
        System.out.printf("isSorted(sorted)= %b\n", isSorted(sorted));
    }
}
