package _12_java_collection_framework.exercise.pracitce_use_array_linked_list.linked_list;

public class Product2 implements Comparable<Product2> {
    private int id;
    private String nameProduct;
    private double price;

    public Product2() {
    }

    public Product2(int id, String nameProduct, double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product2 o) {
        if (o.getPrice() > o.getPrice()) {
            return 1;
        } else if (o.getPrice() < getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }


}
