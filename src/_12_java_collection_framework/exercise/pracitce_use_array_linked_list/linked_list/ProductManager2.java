package _12_java_collection_framework.exercise.pracitce_use_array_linked_list.linked_list;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager2 {
    Product2 product=new Product2();
    Scanner scanner=new Scanner(System.in);
    List<Product2> productList=new LinkedList<>();

    public void display() {
        for (Product2 p : productList) {
            System.out.println(p);
        }
    }
    public void add() {
        System.out.print("enter id product: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("enter name product: ");
        String name = scanner.nextLine();
        System.out.print("enter price product: ");
        double price = Double.parseDouble(scanner.nextLine());
        product = new Product2(id, name, price);
        productList.add(product);
    }
    public void edit() {
        System.out.println("enter id to edit:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                System.out.println("enter name product edit:");
                productList.get(i).setNameProduct(scanner.nextLine());
                System.out.println("enter price product edit:");
                productList.get(i).setPrice(Double.parseDouble(scanner.nextLine()));
            }
        }
    }

    public void search() {
        System.out.println("enter name product to search");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().contains(name)) {
                System.out.print("id: " + productList.get(i).getId());
                System.out.print("name: " + productList.get(i).getNameProduct());
                System.out.print("price: " + productList.get(i).getPrice());
            }
        }
    }

    public void remove() {
        System.out.println("enter id product to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i).getId();
            }
        }
    }
    public  void sort(){
        Collections.sort(productList);
        for (Product2 p:productList
             ) {
            System.out.println(p);
        }
    }

}
