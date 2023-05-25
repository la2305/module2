package ss12.respository;


import ss12.product.Product;

import java.util.List;

public interface IRespositoryProduct {
    //
    List<Product> getAll();
    void removeProduct(Product product);
    //
    Product getById(String id);
    void addProduct(Product product);
    void getByName(String name);
    void editProduct(Product product);
    void sortUpAscending();
    void sortDescending();
}
