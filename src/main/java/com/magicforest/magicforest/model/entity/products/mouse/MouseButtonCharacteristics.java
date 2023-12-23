package com.magicforest.magicforest.model.entity.products.mouse;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class MouseButtonCharacteristics {

    @Column(nullable = true)
    private byte numbersOfButtons;

    @Column(nullable = true)
    private byte numbersOfProgrammingButtons;

    @Column(nullable = true)
    private boolean hasScrollWheel;

}
