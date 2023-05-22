package ss100.respository;

import ss100.model.Product;

import java.util.List;

public interface IProductRespository  {
    List<Product> getAll();
    void addProduct(Product product);
    Product getByCode(String code);
    void removeProduct(Product product);
}
