package com.vaishu.SimpleWebApp.Services;

import com.vaishu.SimpleWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    Product prod;
    List<Product> list = new ArrayList<>(Arrays.asList(new Product(23, "Spectacles", 30000),
                                    new Product(45, "Laptop", 90000),
                                    new Product(34, "Earpods", 500)));

    public List<Product> getProducts(){
        return list;
    }

    public Product getProductById(int prodId){
        return list.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst().orElse(new Product(0, "no product", 0));
    }

    public void addProduct(Product prod) {
        list.add(prod);
    }
}
