package com.magicforest.magicforest.model.entity.products.mouse;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class MouseConstructionCharacteristics {

    @Column(nullable = true)
    private String hand;

    @Column(nullable = true)
    private boolean hasGaming;

}
