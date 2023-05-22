package ss100.service;

import ss100.model.Product;
import ss100.respository.IProductRespository;
import ss100.respository.ProductRespository;

import java.security.PublicKey;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    protected Scanner scanner = new Scanner(System.in);
    private static IProductRespository productRespository = new ProductRespository();

    public void displayAll() {
        List<Product> products = productRespository.getAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct() {
        System.out.print("Nhập mã sản phẩm");
        String code = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm");
        Float price = Float.valueOf(scanner.nextLine());
        System.out.println("Nhập số lượng sản phẩm");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm");
        String description = scanner.nextLine();
        Product product = new Product(code,name,price,quantity,description);
        productRespository.addProduct(product);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void deleteProduct() {
        System.out.println("Bạn muốn sản phẩm nào. Vui lòng nhập mã sản phẩm: ");
        String code = scanner.nextLine();
        Product product = productRespository.getByCode(code);
        if (product == null){
            System.out.println("Không có sản phẩm");
        }else {
            System.out.println("Bạn có muốn xóa sản phẩm với tên: "+product.getNameProduct());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1){
                productRespository.removeProduct(product);
                System.out.println("xóa thành công");
            }
        }
    }
}
