package ss12.service;


import ss12.product.Product;
import ss12.respository.IRespositoryProduct;
import ss12.respository.RespositoryProduct;

import java.util.List;
import java.util.Scanner;

public class ServiceProduct implements IServiceProduct{
    protected Scanner scanner =new Scanner(System.in);
    private IRespositoryProduct respositoryProduct = new RespositoryProduct();

    @Override
    public void displayAll() {
        List<Product> products = respositoryProduct.getAll();
        for (Product product:products) {
            System.out.println(product);
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhập vào id sản phẩm bạn muốn xóa");
        String id = scanner.nextLine();
        Product product = respositoryProduct.getById(id);
        if (product==null){
            System.out.println("Id bạn nhâp không chính xác");
        }else {
            System.out.println("1. Nếu bạn thực sự muốn xóa sản phẩm này"+product.getName());
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice==1){
                respositoryProduct.removeProduct(product);
                System.out.println("Xóa sản phẩm thành công");
            }
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Nhập vào id của sản phẩm");
        String id = scanner.nextLine();
        System.out.println("Nhập vào tên của sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập vào mô tả sản phẩm");
        String description =scanner.nextLine();
        System.out.println("Nhập vào số lượng sản phẩm");
        int quality = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giá của sản phẩm");
        float price = Float.valueOf(scanner.nextLine());
        Product product = new Product(id,name,description,quality,price);
        respositoryProduct.addProduct(product);
        System.out.println("Thêm sản phẩm thành công");
    }

    @Override
    public void findName() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm");
        String name = scanner.nextLine();
        respositoryProduct.getByName(name);
    }

    @Override
    public void editNameProDuct() {
        System.out.println("Bạn muốn sửa mã sản phẩm nào vui lòng nhập mã sản phẩm");
        String id = scanner.nextLine();
        Product product =respositoryProduct.getById(id);
        if (product==null){
            System.out.println("Id sản phẩm bạn nhập không đúng");
        } else {
            System.out.println("Chọn mục cần sửa");
            System.out.println("1. Sửa id của sản phẩm");
            System.out.println("2. Sửa tên của sản phẩm");
            System.out.println("3. Sửa mô tả sản phẩm");
            System.out.println("4. Sửa số lượng sản phẩm");
            System.out.println("5. Sửa giá của sản phẩm");
            System.out.println("6. Không muốn sửa nữa");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập id mới của sản phẩm");
                    String idnew = scanner.nextLine();
                    product.setId(idnew);
                    break;
                case 2:
                    System.out.println("Nhập tên mới của sản phẩm");
                    String name = scanner.nextLine();
                    product.setName(name);
                    break;
                case 3:
                    System.out.println("Nhập mô tả mới của sản phẩm");
                    String description = scanner.nextLine();
                    product.setDescription(description);
                    break;
                case 4:
                    System.out.println("Nhập số lượng mới của sản phẩm");
                    int quality = Integer.parseInt(scanner.nextLine());
                    product.setQuality(quality);
                    break;
                case 5:
                    System.out.println("Nhập giá mới của sản phẩm");
                    float price = Float.valueOf(scanner.nextLine());
                    product.setPrice(price);
                    break;
                case 6:
                    break;
            }
            System.out.println("Kết thúc chỉnh sửa");
        }
    }

    @Override
    public void arrangeProductPrice() {
        System.out.println("Chọn cách bạn muốn sắp xếp");
        System.out.println("1. Sắp xếp theo thứ tự giá tăng dần");
        System.out.println("2. Sắp xếp theo thứ tự giá giảm dần");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            respositoryProduct.sortUpAscending();
            System.out.println("Sản phẩm đã được sắp xếp tăng dần thành công");
        } else {
            respositoryProduct.sortDescending();
            System.out.println("Sản phẩm được sắp xếp giảm dần thành công");
        }
    }


}
