package com.magicforest.magicforest.model.entity.products.mouse;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class MouseSensorCharacteristics {

    @Column(nullable = true)
    private int sensorResolution;

    @Column(nullable = true)
    private String resolutionSupport;

    @Column(nullable = true)
    private boolean sensorSensitivityChange;

    @Column(nullable = true)
    private byte maxAcceleretion;

    @Column(nullable = true)
    private double maxSpeed;

    @Column(nullable = true)
    private double pollingFrequncyInHz;

    @Column(nullable = true)
    private long responseTimeInMilliseonds;

}
