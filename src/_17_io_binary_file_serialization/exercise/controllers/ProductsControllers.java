package _17_io_binary_file_serialization.exercise.controllers;


import _17_io_binary_file_serialization.exercise.models.Product;
import _17_io_binary_file_serialization.exercise.services.ProductManager;

import java.io.IOException;
import java.util.Scanner;

public class ProductsControllers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        do {
            System.out.println("------menu------");
            System.out.println("1.Thêm sản phẩm: ");
            System.out.println("2.Hiển thị danh sách sản phẩm");
            System.out.println("3.Tìm kiếm sản phẩm theo tên");
            System.out.println("----enter your choice----");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.display();
                    break;
                case 3:
                    productManager.search();
                    break;
            }
        } while (true);
    }
}
