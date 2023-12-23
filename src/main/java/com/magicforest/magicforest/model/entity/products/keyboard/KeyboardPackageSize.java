package com.magicforest.magicforest.model.entity.products.keyboard;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class KeyboardPackageSize {

    @Column(name = "длина упаковки")
    private double packageLength;

    @Column(name = "ширина упаковки")
    private double packageWidth;

    @Column(name = "высота упаковки")
    private double packageHeight;

    @Column(name = "вес упаковки")
    private double packageWeight;


}
