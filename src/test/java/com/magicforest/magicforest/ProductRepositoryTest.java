package com.magicforest.magicforest;

import com.magicforest.magicforest.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@DataJpaTest
@AutoConfigureTestDatabase
@SpringJUnitConfig(classes = MagicForestApplication.class)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testSaveProduct() {

//        Product product1 = new Product();
//        product1.setProductCode(56568596);
//        product1.setDescription("Мышка для ноутбука");
//        product1.setPrice(763.50);
//        product1.setName("Мышка Oklick 120M");
//
//        Product product2 = new Product();
//        product2.setProductCode(10003756);
//        product2.setDescription("Штатив для телефона");
//        product2.setPrice(500);
//        product2.setName("Штатив для телефона Xiaomi");
//
//        Product product3 = new Product();
//        product3.setProductCode(67904498);
//        product3.setDescription("Колонка JBL");
//        product3.setPrice(20050.75);
//        product3.setName("JBL BoomBox 500");
//
//        Product product4 = new Product();
//        product4.setProductCode(12313000);
//        product4.setDescription("Телевизор LG для дома");
//        product4.setPrice(45000);
//        product4.setName("LG 45\" дюймов");
//
//        productRepository.save(product1);
//        productRepository.save(product2);
//        productRepository.save(product3);
//        productRepository.save(product4);

    }
}
