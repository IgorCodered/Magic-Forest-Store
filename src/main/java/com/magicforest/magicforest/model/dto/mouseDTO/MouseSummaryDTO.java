package com.magicforest.magicforest.model.dto.mouseDTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MouseSummaryDTO {

    private String brand;
    private String model;
    private String technology;
    private String typeConnection;
    private String typeLight;
    private String interfaceConnection;
    private boolean isConnectionToUSB;
    private double lengthOfWire;

}
