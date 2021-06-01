import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Sort {

    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(2);
        num.add(3);
        num.add(263);
        num.add(2499);
        num.add(44);
        num.add(450);
        num.add(48);
        num.add(20);
        num.add(4);

        RadixSort.radixSort(num);

        for (int h : num)
            System.out.print(h + " ");
    }

}
