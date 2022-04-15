package _12_java_collection_framework.exercise.pracitce_use_array_linked_list;

import java.util.Scanner;

public class ProductMangagerTesst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean check = true;
        do {
            System.out.println("------menu------");
            System.out.println("1.Thêm sản phẩm: ");
            System.out.println("2.Sửa thông tin sản phẩm theo id");
            System.out.println("3.Xoá sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7.Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("Enter your choice!");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.remove();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.sortAscending();
                    break;
                case 7:
                    productManager.sortDescending();
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
