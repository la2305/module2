package ss12.Product.service;
import ss12.Product.model.Product;
import ss12.Product.respository.IProductRespository;
import ss12.Product.respository.ProductRespository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    protected Scanner scanner = new Scanner(System.in);
    private IProductRespository productRespository = new ProductRespository();

    @Override
    public void displayAll() {
        List<Product> products = productRespository.getAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Bạn muốn xóa sản phẩm nào vui lòng nhập id");
        String id = scanner.nextLine();
        Product product = productRespository.getById(id);
        if (product == null) {
            System.out.println("Mã id không chính xác");
        } else {
            System.out.println("Bạn có muốn xóa sản phẩm với tên" + product.getName());
            System.out.println("1.Xóa");
            System.out.println("2.Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRespository.removeProduct(product);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Nhập mã sản phẩm");
        String id =scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name =scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm");
        String description =scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        Float price = Float.valueOf(scanner.nextLine());
        Product product = new Product(id,name,description,price);
        productRespository.addProduct(product);
        System.out.println("Thêm mới thành công");
    }
}