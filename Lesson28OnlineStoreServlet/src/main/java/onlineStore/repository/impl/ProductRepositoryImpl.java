package onlineStore.repository.impl;

import onlineStore.model.Product;
import onlineStore.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

import static onlineStore.utils.ProductHelper.products;

public class ProductRepositoryImpl implements ProductRepository {

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Product> getProductsByCategoryId(int categoryId) {
        return products.stream()
                .filter(product -> product.getCategoryId() == categoryId)
                .collect(Collectors.toList());
    }
}
