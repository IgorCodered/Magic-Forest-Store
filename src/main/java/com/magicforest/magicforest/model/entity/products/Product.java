package com.magicforest.magicforest.model.entity.products;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Products")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "product_type")
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String description;
    @Column(nullable = true)
    private double price;

    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productCode;

}
