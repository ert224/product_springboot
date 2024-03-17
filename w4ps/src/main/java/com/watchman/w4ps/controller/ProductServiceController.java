package com.watchman.w4ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.watchman.w4ps.model.Product;

import com.watchman.w4ps.service.ProductService;

// 
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//The @RestController annotation is used to define the RESTful web services. It serves JSON, XML and custom response. Its syntax is shown below −
@RestController
class ProductServiceController {

    @Autowired
    ProductService productService;
   
    // // The @RequestMapping annotation is used to define the Request URI to access
    // // the REST Endpoints.
    // // We can define Request method to consume and produce object. The default
    // // request method is GET.

    // private static Map<String, Product> productRepo = new HashMap<>();

    // static {
    //     Product honey = new Product();
    //     honey.setId("1");
    //     honey.setName("Honey");
    //     productRepo.put(honey.getId(), honey);

    //     Product almond = new Product();
    //     almond.setId("2");
    //     almond.setName("Almond");
    //     productRepo.put(almond.getId(), almond);
    // }



    // // The @RequestParam annotation is used to read the request parameters from the
    // // Request URL. By default,
    // // it is a required parameter. We can also set default value for request
    // // parameters as shown here −

    // @RequestMapping(value = "/products") // default is GET Request
    // public ResponseEntity<Object> getProduct() {
    //     return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    // }
    @RequestMapping(value = "/products")
    
    public ResponseEntity<Object> getProduct() {
       return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }
    // // The following example shows the sample code to define the HTTP POST request
    // // method.
    // // In this example, we used HashMap to store the Product, where the product is a
    // // POJO class.
    // @RequestMapping(value = "/products", method = RequestMethod.POST)
    // public ResponseEntity<Object> createProduct(@RequestBody Product product) { 
    //     productRepo.put(product.getId(), product);
    //     return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    // }
    
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
       productService.createProduct(product);
       return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }

    // // Here the request URI is /products/{id} which will return the String after a
    // // the product into a HashMap repository.
    // // Note that we used the Path variable {id} which defines the products ID that
    // // needs to be updated.
    // @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    // public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) { 
    //    if(!productRepo.containsKey(id)){
    //        throw new ProductNotfoundException();
    //    }

    //    productRepo.remove(id);
    //    product.setId(id);
    //    productRepo.put(id, product);
    //    return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
    // }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
       
       productService.updateProduct(id, product);
       return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
    }

    // // The request URI is /products/{id} and it will return the String after
    // // deleting the product from HashMap repository.
    // // We used the Path variable {id} which defines the products ID that needs to be
    // // deleted.
    // @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    // public ResponseEntity<Object> delete(@PathVariable("id") String id) {
    //     productRepo.remove(id);
    //     return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
    // }
    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
       productService.deleteProduct(id);
       return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
    }

}