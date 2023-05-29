package ss17.excercise.MVC.respository;


import ss17.excercise.MVC.common.ReadAndWriteFile;
import ss17.excercise.MVC.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRespository implements IProductRespository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("1-001", "", 50000, "Việt Nam", "Bánh xe bò siêu cấp vip pro"));
        products.add(new Product("1-002", "Bánh xe máy bay", 10000, "Mỹ", "Bánh xe đi bao thủng"));
//        ReadAndWriteFile.writeProductListToFile(products);
    }

    @Override
    public List<Product> getAll() {
        products = ReadAndWriteFile.readProductFromFile();
        return products;
    }

    @Override
    public Product getById(String id) {
        for (Product product:products) {
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void RemoveProduct(Product product) {
//        products = ReadAndWriteFile.readProductFromFile();
        products.remove(product);
//        ReadAndWriteFile.writeProductListToFile(products);
    }

    @Override
    public void addProduct(Product product) {
        products = ReadAndWriteFile.readProductFromFile();
        products.add(product);
        ReadAndWriteFile.writeProductListToFile(products);
    }

    @Override
    public void getByName(String name) {
        for (Product product:products) {
            if (product.getName().contains(name)){
                System.out.println(product);
            }
        }
    }
}
