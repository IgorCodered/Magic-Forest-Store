package com.magicforest.magicforest.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {


    private String name;
    private String description;
    private double price;

    @JsonProperty("артикул")
    private Long productCode;


}
