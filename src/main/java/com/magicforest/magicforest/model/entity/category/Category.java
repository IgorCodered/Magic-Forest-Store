package com.magicforest.magicforest.model.entity.category;

import com.magicforest.magicforest.util.CategoryManager;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Категории")
public abstract class Category implements CategoryManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

}
