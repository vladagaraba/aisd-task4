import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RadixSort {

    public static void radixSort(LinkedList<Integer> list) {

        List<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        // sort
        boolean flag = false;
        int tmp = -1, divisor = 1;
        while (!flag) {
            flag = true;
            // split input between lists
            for (Integer i : list) {
                tmp = i / divisor;
                buckets[tmp % 10].add(i);
                if (flag && tmp > 0) {
                    flag = false;
                }
            }
            // empty lists into input array
            list.clear();
            for (int i = 0; i < 10; i++) {
                for (Integer j : buckets[i]) {
                    list.add(j);

                }
                buckets[i].clear();
            }
            // move to next digit
            divisor *= 10;
        }
    }
}
