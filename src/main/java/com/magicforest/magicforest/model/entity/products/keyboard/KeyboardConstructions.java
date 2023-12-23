package com.magicforest.magicforest.model.entity.products.keyboard;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class KeyboardConstructions {

    private boolean isForGamer;
    private String peculiarities;
    private String complect;

}
