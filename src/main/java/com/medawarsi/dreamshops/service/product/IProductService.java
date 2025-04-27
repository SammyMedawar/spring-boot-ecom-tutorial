package com.medawarsi.dreamshops.service.product;

import com.medawarsi.dreamshops.models.Product;
import com.medawarsi.dreamshops.request.AddProductRequest;
import com.medawarsi.dreamshops.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    Product updateProduct(ProductUpdateRequest request, Long productId);
    Product getProductById(Long id);
    void deleteProductById (Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName (String brand, String name);
}
