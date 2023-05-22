package ss12.Product.respository;


import ss12.Product.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRespository implements IProductRespository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("1-001", "Bánh", "Bánh đậu đen", 5000));
        products.add(new Product("1-002", "Kẹo", "Kẹo dẻo", 10000));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public Product getById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }
}
