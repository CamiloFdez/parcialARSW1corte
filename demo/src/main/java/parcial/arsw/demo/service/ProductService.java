package parcial.arsw.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import parcial.arsw.demo.models.Product;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    public List<Product> getAllProducts() {
    return products;
    }

    public Product getProductById(int id) {
    return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null); }
    
    public Product addProduct(String nombre, double precio) {
    Product product = new Product(nombre, precio);
    products.add(product);
    return product;
    }
}
