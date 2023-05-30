package ss17.excercise.MVC.respository;

import ss17.excercise.MVC.model.Product;

import java.util.List;

public interface IProductRespository {
    List<Product> getAll();
    Product getById(String id);
    void removeProduct(Product product);
    void addProduct(Product product);
    void getByName(String name);
}
