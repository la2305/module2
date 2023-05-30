package ss17.excercise.MVC.respository;


import ss17.excercise.MVC.common.ReadAndWriteFile;
import ss17.excercise.MVC.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRespository implements IProductRespository {
    private static List<Product> products = new ArrayList<>();


    @Override
    public List<Product> getAll() {
        products = ReadAndWriteFile.readProductFromFile();
        return products;
    }

    @Override
    public Product getById(String id) {
        products = ReadAndWriteFile.readProductFromFile();
        for (Product product:products) {
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void removeProduct(Product product) {
        products = ReadAndWriteFile.readProductFromFile();
        products.remove(product);
        ReadAndWriteFile.writeProductListToFile(products);
    }

    @Override
    public void addProduct(Product product) {
        products = ReadAndWriteFile.readProductFromFile();
        products.add(product);
        ReadAndWriteFile.writeProductListToFile(products);
    }

    @Override
    public void getByName(String name) {
        products = ReadAndWriteFile.readProductFromFile();
        for (Product product:products) {
            if (product.getName().contains(name)){
                System.out.println(product);
            }
        }
    }
}
