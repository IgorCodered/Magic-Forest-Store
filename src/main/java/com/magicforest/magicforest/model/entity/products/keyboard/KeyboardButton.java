package com.magicforest.magicforest.model.entity.products.keyboard;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class KeyboardButton {

    private boolean isMultimediaButton;
    private boolean isLightButton;
    private boolean isRussianButton;
    private boolean isButtonsDuplicateMouseButtons;
    private boolean isNumPad;

    private String designButtons;
    private String colorRussianLetter;
    private String colorEnglandLetter;

    private byte numberOfKeys;
}
