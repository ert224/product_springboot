package com.watchman.w4ps.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.watchman.w4ps.exception.ProductNotfoundException;
import com.watchman.w4ps.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
    /*
     * Service Components are the class file which contains @Service annotation.
     * These class files are used to write business logic in a different layer,
     * separated from @RestController class file.
     */

    private static Map<String, Product> productRepo = new HashMap<>();
    static {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("Honey");
        productRepo.put(honey.getId(), honey);

        Product almond = new Product();
        almond.setId("2");
        almond.setName("Almond");
        productRepo.put(almond.getId(), almond);
    }

    @Override
    public void createProduct(Product product) {
        productRepo.put(product.getId(), product);
    }

    @Override
    public void updateProduct(String id, Product product) {
        if (!productRepo.containsKey(id)) {
            throw new ProductNotfoundException();
        }
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id, product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepo.remove(id);

    }

    @Override
    public Collection<Product> getProducts() {
        return productRepo.values();
    }
}