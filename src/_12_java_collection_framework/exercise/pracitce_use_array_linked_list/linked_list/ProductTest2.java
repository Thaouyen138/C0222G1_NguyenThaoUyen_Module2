package _12_java_collection_framework.exercise.pracitce_use_array_linked_list.linked_list;

import java.util.Scanner;

public class ProductTest2<check> {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ProductManager2 productManager2 = new ProductManager2();

        boolean check = true;
        do {
            System.out.println("------menu------");
            System.out.println("1.Thêm sản phẩm: ");
            System.out.println("2.Sửa thông tin sản phẩm theo id");
            System.out.println("3.Xoá sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("Enter your choice!");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager2.add();
                    break;
                case 2:
                    productManager2.edit();
                    break;
                case 3:
                    productManager2.remove();
                    break;
                case 4:
                    productManager2.display();
                    break;
                case 5:
                    productManager2.search();
                    break;
                case 6:
                    productManager2.sort();
                    break;

                case 0:
                    check = false;
                    break;
                default:
                    System.out.println("no choice!");
            }
        } while (check);
    }
}