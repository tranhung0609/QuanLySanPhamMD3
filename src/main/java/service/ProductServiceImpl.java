package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer,Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1,"洗濯機",150000,"新しい物","Panasonic"));
        productMap.put(2, new Product(2,"冷蔵庫",1500000,"新しい物","Panasonic"));
        productMap.put(3, new Product(3,"テレビ",1000000,"新しい物","Panasonic"));
        productMap.put(4, new Product(4,"そうじにん",150000,"新しい物","Panasonic"));
        productMap.put(5, new Product(5,"スムージーマシン",150000,"新しい物","Panasonic"));
        productMap.put(6, new Product(6,"ドライヤー",150000,"新しい物","Panasonic"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }
}
