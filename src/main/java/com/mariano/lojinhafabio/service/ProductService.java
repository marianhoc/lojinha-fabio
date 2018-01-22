package com.mariano.lojinhafabio.service;

import com.mariano.lojinhafabio.Dao.ProductDao;
import com.mariano.lojinhafabio.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Collection<Product> getProducts(){
        return this.productDao.getProducts();
    }

    public Product getProductById(int id){
        return this.productDao.getProductById(id);
    }


    public void removeProductById(int id) {
        this.productDao.removeProductById(id);
    }


    public void updateProduct(Product product) {
        this.productDao.updateProduct(product);
    }

    public void insertProduct(Product product) {
        this.productDao.insertProduct(product);

    }


}
