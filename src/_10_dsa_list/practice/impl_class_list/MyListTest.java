package _10_dsa_list.practice.impl_class_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        /*
      thêm 1 index 0,
      thêm 2 index 1,
      thêm 3 index 2,
      thêm 3 index 3,
      thêm 4 index 4
         */
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        // lấy phần tử index 4,
        //lấy phần tử index 1,
        //lấy phần tử index 2.


        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
    }

}
