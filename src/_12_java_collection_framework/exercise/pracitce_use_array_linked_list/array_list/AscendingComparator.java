package _12_java_collection_framework.exercise.pracitce_use_array_linked_list.array_list;

import java.util.Comparator;

public class AscendingComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) return 1;
        if (o1.getPrice() < o2.getPrice()) return -1;
        else return 0;
    }

}
