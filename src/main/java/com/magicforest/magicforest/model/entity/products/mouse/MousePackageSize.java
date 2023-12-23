package com.magicforest.magicforest.model.entity.products.mouse;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class MousePackageSize {

    @Column(nullable = true)
    private double packageLength;

    @Column(nullable = true)
    private double packageWidth;

    @Column(nullable = true)
    private double packageHeight;

    @Column(nullable = true)
    private double packageWeight;

}
