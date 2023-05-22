package ss12.Product.respository;

import ss12.Product.model.Product;

import java.util.List;

public interface IProductRespository {
    List<Product> getAll();

    void removeProduct(Product product);

    Product getById(String id);
    void addProduct(Product product);
}
