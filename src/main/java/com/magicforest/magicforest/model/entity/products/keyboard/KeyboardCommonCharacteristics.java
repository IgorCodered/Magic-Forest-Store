package com.magicforest.magicforest.model.entity.products.keyboard;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class KeyboardCommonCharacteristics {

    private String brand;
    private String model;
    private String typeConnection;
    private String typeWirelessCon;
    private String typeInterface;
    private String typeMechanicalSwitch;
    private double lengthOfCable;
    private float radiusConnect;
    private boolean isMechanical;

}
