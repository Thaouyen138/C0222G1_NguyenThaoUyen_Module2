package _10_dsa_list.exercise.impl_method_array_list;

import java.util.Arrays;

public class MyList<E> {
    // số lượng phần tử có trong MyList
    private int size = 0;
    // sức chứa
    private static final int DEFAULT_CAPACITY = 10;
    // mảng đối tượng chứa các phần tử
    Object elements[];

    //  constructor ko tham số sức chứa mặc định
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    // constructor với sức chứa truyền vào
    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capicity" + capacity);

        }
    }


    // phương thức trả về số lượng phân tử
    public int size() {
        return this.size;
    }

    // xóa phần tử trong array
    public void clear() {
        int size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //phương thức add phần tử
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    //phương thức tăng kích thước của mảng khi số lượng phần tử vượt quá sức chứa
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("mincapacity" + minCapacity);
        }
    }

    public void add(int index, E element) {
        if (elements.length == size) {
            throw new IllegalArgumentException("index" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(6);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            //bắt đầu vị trí cuối mảng đến vị trí index
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }
}

