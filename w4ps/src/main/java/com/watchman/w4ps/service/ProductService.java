package com.watchman.w4ps.service;

// You can create an Interface which contains add, edit, get and delete methods using the code as shown below −


import java.util.Collection;
import com.watchman.w4ps.model.Product;

// header functions 
public interface ProductService {
   public abstract void createProduct(Product product);
   public abstract void updateProduct(String id, Product product);
   public abstract void deleteProduct(String id);
   public abstract Collection<Product> getProducts();
}