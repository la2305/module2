package ss17.excercise.MVC.service;
import ss17.excercise.MVC.model.Product;
import ss17.excercise.MVC.respository.IProductRespository;
import ss17.excercise.MVC.respository.ProductRespository;

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
    public void addProduct() {
        System.out.println("Nhập vào id của sản phẩm mới");
        String id = scanner.nextLine();
        System.out.println("Nhập vào tên của sản phẩm mới");
        String name = scanner.nextLine();
        Float price;
        do {
            try {
                System.out.println("Nhập vào giá của sản phẩm");
                price = Float.valueOf(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập 1 số");
            }
        }while (true);
        System.out.println("Nhập vào hảng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập vào mô tả sản phẩm");
        String description = scanner.nextLine();
        Product product =new Product(id,name,price,manufacturer,description);
        productRespository.addProduct(product);
        System.out.println("Thêm sản phẩm thành công");
    }

    @Override
    public void deleteProduct() {
        System.out.println("Bạn muốn xóa sản phẩm nào, vui lòng nhập id");
        String id = scanner.nextLine();
        Product product = productRespository.getById(id);
        if (product == null) {
            System.out.println("Id sản phẩm bạn nhập không tồn tại");
        } else {
            System.out.println("Bạn có thực sự muốn xóa sản phẩm tên: " + product.getName());
            System.out.println("1. Nếu bạn thực sự muốn xóa sản phẩm");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                productRespository.removeProduct(product);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void findName() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm");
        String name = scanner.nextLine();
        productRespository.getByName(name);
    }
}
