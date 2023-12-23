package com.magicforest.magicforest.service;

import com.magicforest.magicforest.model.entity.category.Category;
import com.magicforest.magicforest.model.entity.products.Product;

public interface AdminPanelService {

    void add(Product product);
    void addToCategory(Product product, Category category);
    void hideProduct(Product product);
    void hideCategory(Category category);

}
