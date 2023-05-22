package ss100.respository;

import ss100.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRespository implements IProductRespository {
    private static List<Product> products =new ArrayList<>();
    static {
        products.add(new Product("P-001","Chocolate",40000,25,"Mắm siêu ngon"));
        products.add(new Product("P-002","Chínu",15000,100,"Mắm hơi mặn"));
    }
    public List<Product> getAll(){
        return products;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public Product getByCode(String code){
        for (Product product:products) {
            if (product.getCodeProduct().equals(code)){
                return product;
            }
        }
        return null;
    }
    public void removeProduct(Product product){
        products.remove(product);
    }

}
