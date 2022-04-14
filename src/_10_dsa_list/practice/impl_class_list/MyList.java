package _10_dsa_list.practice.impl_class_list;

import java.util.Arrays;

public class MyList<E> {
    // sức chứa 10.
    private static final int DEFAULT_CAPACITY = 10;
    //kích thước danh sách
    private int size = 0;
    //khai báo mảg
    private Object[] elements;
    // constructor sức chứa mặc định
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    //constructor sức chứa đảm bảo
    private void ensureCapa() {
        //độ dài mảng mới bằng độ dài mảng cũ nhân 2.
        //phần tử mảng mới bằng mảng cũ + mảng cũ nhân 2.
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    // phương thức thêm
    public void add(E e) {
        //nếu kích thước danh sách truyền vào bằng độ dài mảng(làm nhiệm vụ trong if)->mảng gấp đôi
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        //nếu i > hơn kích thước danh sách hoặc bé hơn 0
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];

    }
}

