package _17_io_binary_file_serialization.exercise.services;

import _17_io_binary_file_serialization.exercise.services.IServices;
import _17_io_binary_file_serialization.exercise.models.Product;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements IServices {
   List<Product> productList = readFileBinary("src\\_17_io_binary_file_serialization\\exercise\\utils\\Product.txt");
   Scanner scanner=new Scanner(System.in);
   

   @Override
   public void add() {
      System.out.print("enter id product: ");
      int id=Integer.parseInt(scanner.nextLine());
      System.out.print("enter name product: ");
      String name=scanner.nextLine();
      System.out.print("enter kan of product: ");
      String kan=scanner.nextLine();
      System.out.print("enter price product: ");
      double price=Double.parseDouble(scanner.nextLine());
      productList.add(new Product(id,name,kan,price));
      writerFileBinary("src\\_17_io_binary_file_serialization\\exercise\\utils\\Product.txt",productList);
   }

   @Override
   public void display() {
      for (Product product: productList){
         System.out.println(product);
      }
   }

   @Override
   public void search() {
      System.out.println("enter name product to search:");
     String name=scanner.nextLine();
      for (int i=0;i<productList.size();i++){
         if (productList.get(i).getName().contains(name)){
            System.out.print("id: " + productList.get(i).getId());
            System.out.print("name: " + productList.get(i).getName());
            System.out.print("kan of: "+ productList.get(i).getKanOfProduct());
            System.out.print("price: " + productList.get(i).getPrice());
         }
      }
   }
   public static void writerFileBinary(String path, List<Product> obj){
      File file = new File(path);
      FileOutputStream os = null;
      ObjectOutputStream oos = null;
      try {
         os = new FileOutputStream(file);
         oos = new ObjectOutputStream(os);
         oos.writeObject(obj);

      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            if (os!=null) {
               os.close();
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }


   public static List<Product> readFileBinary(String path) {

      File file = new File(path);
     List<Product> obj;
      try (FileInputStream is = new FileInputStream(file);
         ObjectInputStream ois = new ObjectInputStream(is)){
         obj = (List<Product>) ois.readObject();
         return obj;
      } catch (IOException | ClassNotFoundException e) {
         return new ArrayList<>();
      }
   }

}
