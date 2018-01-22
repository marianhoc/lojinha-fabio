package com.mariano.lojinhafabio.Dao;

import com.mariano.lojinhafabio.model.Product;
import com.mariano.lojinhafabio.util.TypeOfProduct;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductDao {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<Integer, Product>(){
            {
                put(1, new Product(1, "pizza muzzarela",  29.9, TypeOfProduct.PIZZAS));
                put(2, new Product(2, "pizza calabresa", 39.9, TypeOfProduct.PIZZAS));
                put(3, new Product(3, "pizza napolitana", 25.9, TypeOfProduct.PIZZAS));
                put(4, new Product(4, "pizza marguerita", 27.9, TypeOfProduct.PIZZAS));
                put(5, new Product(5, "Sorvete", 2.9, TypeOfProduct.SOBREMESAS));
                put(6, new Product(6, "suco",  5.9, TypeOfProduct.BEBIDAS));
                put(7, new Product(7, "refrigerante",  6.9, TypeOfProduct.BEBIDAS));

            }
        };
    }


    public Collection<Product> getProducts(){
        return this.products.values();
    }

    public Product getProductById(int id){
        return this.products.get(id);
    }

    public void removeProductById(int id) {
        this.products.remove(id);
    }

    public void updateProduct(Product product){
        Product p = products.get(product.getId());
        p.setName(product.getName());
        p.setValue(product.getValue());
        products.put(product.getId(),product);
    }

    public void insertProduct(Product product) {
        this.products.put(product.getId(), product);

    }


}
