package com.magicforest.magicforest.model.entity.products.mouse;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class MouseSize {

    @Column(nullable = true)
    private double mouseLength;

    @Column(nullable = true)
    private double mouseWidth;

    @Column(nullable = true)
    private double mouseHeight;

    @Column(nullable = true)
    private double mouseWeight;


}
