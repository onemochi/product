package com.hanzw.product.service;



import com.hanzw.product.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);


}
