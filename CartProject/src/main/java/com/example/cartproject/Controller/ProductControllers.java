package com.example.cartproject.Controller;

@RestController
@RequestMapping("/api/products")
public class ProductControllers {

    FakeStoreProductServices fakeStoreProductServices = new FakeStoreProductServices();
    @GetMapping("/")
    public String getProductName() {
        return "Enter Product Id to get Details of Product";
    }

    @GetMapping("/product/{id}")
    public Product getProductDetails(@PathVariable Long id) {
        return fakeStoreProductServices.getProduct(id);
    }
}