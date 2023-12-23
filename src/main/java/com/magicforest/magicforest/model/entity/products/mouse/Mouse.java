package com.magicforest.magicforest.model.entity.products.mouse;

import com.magicforest.magicforest.model.entity.products.Product;
import com.magicforest.magicforest.model.entity.category.MouseCategory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "mouses")
public class Mouse extends Product {

    @Column(nullable = true)
    private String powerSource;
    @Column(nullable = true)
    private boolean hasBackLight;
    @Column(nullable = true)
    private String color;

    @ManyToOne
    @JoinColumn()
    private MouseCategory category;

    @Embedded
    @Column(nullable = true)
    private MouseCommonCharacteristics common;

    @Embedded
    @Column(nullable = true)
    private MouseSensorCharacteristics sensor;

    @Embedded
    @Column(nullable = true)
    private MouseButtonCharacteristics buttons;

    @Embedded
    @Column(nullable = true)
    private MouseConstructionCharacteristics construction;

    @Embedded
    @Column(nullable = true)
    private MouseSize mouseSize;

    @Embedded
    @Column(nullable = true)
    private MousePackageSize packageSize;


}
