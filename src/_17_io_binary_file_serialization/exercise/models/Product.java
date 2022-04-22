package _17_io_binary_file_serialization.exercise.models;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialversionUID =
            130899L;
    //Viết một chương trình cho phép người dùng thêm, hiển thị, tìm kiếm thông tin sản phẩm vào file.
    //
    //Thông tin sản phẩm gồm:
    //
    //- Mã sản phẩm
    //
    //- Tên sản phẩm
    //
    //- Hãn sản xuất
    //
    //- Giá
    private int id;
    private String name;
    private String kanOfProduct;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String kanOfProduct, double price) {
        this.id = id;
        this.name = name;
        this.kanOfProduct = kanOfProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKanOfProduct() {
        return kanOfProduct;
    }

    public void setKanOfProduct(String kanOfProduct) {
        this.kanOfProduct = kanOfProduct;
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
                ", name='" + name + '\'' +
                ", kanOfProduct='" + kanOfProduct + '\'' +
                ", price=" + price +
                '}';
    }
}
