package com.magicforest.magicforest.model.entity.products.mouse;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class MouseCommonCharacteristics {

    @Column(nullable = true)
    private String brand;

    @Column(nullable = true)
    private String model;

    @Column(nullable = true)
    private String technology;

    @Column(nullable = true)
    private String typeConnection;

    @Column(nullable = true)
    private String typeLight;

    @Column(nullable = true)
    private String interfaceConnection;

    @Column(nullable = true)
    private boolean isConnectionToUSB;

    @Column(nullable = true)
    private double lengthOfWire;
}
