package _17_io_binary_file_serialization.exercise.controllers;


import _17_io_binary_file_serialization.exercise.models.Product;
import _17_io_binary_file_serialization.exercise.services.ProductManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsControllers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean check = true;
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "iphone", "apple", 34.0));
        productList.add(new Product(2, "galaxy", "samsung", 13.0));
        productList.add(new Product(3, "asus", "samsung", 24.0));

        do {
            System.out.println("------menu------");
            System.out.println("1.Thêm sản phẩm: ");
            System.out.println("2.Hiển thị danh sách sản phẩm");
            System.out.println("3.Tìm kiếm sản phẩm theo tên");
            System.out.println("4.Write File: ");
            System.out.println("5.Read file: ");
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
                case 4:
                    productManager.writerFileBinary("src\\_17_io_binary_file_serialization\\exercise\\utils\\Product.txt", productList);
                    break;
                case 5:
                    productList = (List<Product>) productManager.readFileBinary("src\\_17_io_binary_file_serialization\\exercise\\utils\\Product.txt");
                    System.out.println(productList);
                    break;
            }
        } while (check);
    }
}
