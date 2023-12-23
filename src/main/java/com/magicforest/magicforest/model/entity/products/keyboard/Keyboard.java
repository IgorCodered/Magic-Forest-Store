package com.magicforest.magicforest.model.entity.products.keyboard;

import com.magicforest.magicforest.model.entity.products.Product;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Keyboard extends Product {

    @Embedded
    private KeyboardCommonCharacteristics common;

    @Embedded
    private KeyboardButton buttons;

    @Embedded
    private KeyboardConstructions constructions;

    @Embedded
    private KeyboardSizeAndColor sizeAndColor;

    @Embedded
    private KeyboardPackageSize packageSize;

}
