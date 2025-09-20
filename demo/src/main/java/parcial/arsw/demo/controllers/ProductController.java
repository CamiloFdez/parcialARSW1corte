package parcial.arsw.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import parcial.arsw.demo.models.Product;
import parcial.arsw.demo.service.ProductService;

// Controlador REST
@RestController
@RequestMapping("/productos")
class ProductController {
    @Autowired
    private ProductService productService;
    
    @GetMapping
    public List<Product> getProducts() {
    return productService.getAllProducts();
    }
    
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
    return productService.getProductById(id);
    }
    
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
    return productService.addProduct(product.getNombre(), product.getPrecio());
    }
}
