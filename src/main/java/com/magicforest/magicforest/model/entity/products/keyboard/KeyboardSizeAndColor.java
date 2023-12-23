package com.magicforest.magicforest.model.entity.products.keyboard;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class KeyboardSizeAndColor {

    private String color;

    private double keyboardLength;

    private double keyboardWidth;

    private double keyboardHeight;

    private double keyboardWeight;

}
