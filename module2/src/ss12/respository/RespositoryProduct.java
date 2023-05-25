package ss12.respository;


import ss12.product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RespositoryProduct implements IRespositoryProduct {
    //
    private static List<Product> products = new ArrayList<>();

    //
    static {
        products.add(new Product("1-001", "Bánh", "Bánh ăn cũng ngon", 10, 5000));
        products.add(new Product("1-002", "Bánh trái cây", "Bánh này ăn vô đau bụng", 15, 10000));
        products.add(new Product("1-003", "Kẹo", "Kẹo ăn hơi bị đỉnh", 50, 1000));
        products.add(new Product("1-004", "Kẹo socola", "Kẹo không ngon lắm", 100, 1000));
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

    @Override
    public void getByName(String name) {
        for (Product product : products) {
            if (product.getName().contains(name)) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void editProduct(Product product) {

    }

    @Override
    public void sortUpAscending() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }

    @Override
    public void sortDescending() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
    }


}
